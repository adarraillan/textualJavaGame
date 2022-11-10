package characters;

import characters.Warrior;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** 
* Warrior Tester. 
* 
* @author <Adrien Darraillan>
* @since <pre>Nov 7, 2022</pre> 
* @version 1.0 
*/ 
public class WarriorTest { 

@Before
public void before(){
} 

@After
public void after(){
} 

/** 
* 
* Method: getAttackRate() 
* 
*/ 
@Test
public void testGetAttackRate(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.attackRate(5).build();
    //then
    assertEquals(5, warrior.getAttackRate());
} 

/** 
* 
* Method: setAttackRate(int attackRate) 
* 
*/ 
@Test
public void testSetAttackRate(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.attackRate(5).build();
    warrior.setAttackRate(10);
    //then
    assertEquals(10, warrior.getAttackRate());
} 

/** 
* 
* Method: getDefenseRate() 
* 
*/ 
@Test
public void testGetDefenseRate(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.defenseRate(5).build();
    //then
    assertEquals(5, warrior.getDefenseRate());
} 

/** 
* 
* Method: setDefenseRate(int defenseRate) 
* 
*/ 
@Test
public void testSetDefenseRate(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.defenseRate(5).build();
    warrior.setDefenseRate(10);
    //then
    assertEquals(10, warrior.getDefenseRate());
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.name("Toto").build();
    //then
    assertEquals("Toto", warrior.getName());
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() {
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.name("Toto").build();
    warrior.setName("Titi");
    //then
    assertEquals("Titi", warrior.getName());
} 

/** 
* 
* Method: getLifePoints() 
* 
*/ 
@Test
public void testGetLifePoints(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.lifePoints(10).build();
    //then
    assertEquals(10, warrior.getLifePoints());
} 

/** 
* 
* Method: setLifePoints(int lifePoints) 
* 
*/ 
@Test
public void testSetLifePoints(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.lifePoints(5).build();
    warrior.setLifePoints(10);
    //then
    assertEquals(10, warrior.getLifePoints());}

/** 
* 
* Method: getDamage() 
* 
*/ 
@Test
public void testGetDamage(){
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.damage(5).build();
    //then
    assertEquals(5, warrior.getDamage());
} 

/** 
* 
* Method: setDamage(int damage) 
* 
*/ 
@Test
public void testSetDamage(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).build();
    //when
    warrior.setDamage(10);
    //then
    assertEquals(10, warrior.getDamage());
} 

/** 
* 
* Method: attackAttempt(int attackRate, final InterfaceCharacters target) 
* 
*/ 
@Test
public void testAttackAttempt(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    Warrior target = new Warrior.Builder().name("target").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    //when
    warrior.attackAttempt(warrior.getAttackRate(), target);
    //then
    //target can have less life points, but also have the same life points
    assertTrue(target.getLifePoints() <= 100 && target.getLifePoints() >= 87);

} 

/** 
* 
* Method: defenseAttempt(int defenseRate, int damageTaken) 
* 
*/ 
@Test
public void testDefenseAttempt(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    //when
    warrior.defenseAttempt(warrior.getDefenseRate(), 5);
    //then
    //warrior can have less life points, but also have the same life points
    assertTrue(warrior.getLifePoints() <= 100 && warrior.getLifePoints() >= 87);
} 

/** 
* 
* Method: attackSuccess(final InterfaceCharacters target, int damage) 
* 
*/ 
@Test
public void testAttackSuccess(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                            .attackRate(10)
                                            .defenseRate(10)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();
    Warrior target = new Warrior.Builder().name("target")
                                            .attackRate(10)
                                            .defenseRate(10)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();
    //when
    warrior.attackSuccess(target, 5);
    //then
    assertTrue(target.getDefenseRate() == 10 && warrior.getDamage() == 5);
}

/** 
* 
* Method: defenseSuccess(int damageTaken) 
* 
*/ 
@Test
public void testDefenseSuccess(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    //when
    warrior.defenseSuccess(5);
    //then
    assertTrue(warrior.getLifePoints() <= 100 && warrior.getLifePoints() >= 97);

} 

/** 
* 
* Method: attackCriticalSuccess(final InterfaceCharacters target, int damage) 
* 
*/ 
@Test
public void testAttackCriticalSuccess(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                            .attackRate(5)
                                            .defenseRate(5)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();
    Warrior target = new Warrior.Builder().name("target")
                                            .attackRate(5)
                                            .defenseRate(5)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();
    //when
    warrior.attackSuccess(target, 5);
    //then
    assertTrue(target.getDefenseRate() == 5 && warrior.getDamage() == 5
               && target.getLifePoints() <= 100 && target.getLifePoints() >= 80);
}

/** 
* 
* Method: defenseCriticalSuccess() 
* 
*/ 
@Test
public void testDefenseCriticalSuccess(){
    //given
    Warrior target = new Warrior.Builder().name("target")
                                            .attackRate(10)
                                            .defenseRate(10)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();

    //when
    target.defenseCriticalSuccess();
    //then
    assertEquals(100, target.getLifePoints());
}

/** 
* 
* Method: attackFailure() 
* 
*/ 
@Test
public void testAttackFailure(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                            .attackRate(10)
                                            .defenseRate(10)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();

    Warrior target = new Warrior.Builder().name("target")
                                            .attackRate(10)
                                            .defenseRate(10)
                                            .lifePoints(100)
                                            .damage(5)
                                            .build();

    //when
    warrior.attackFailure();
    //then
    assertEquals(100, target.getLifePoints());
} 

/** 
* 
* Method: defenseFailure(int damageTaken) 
* 
*/ 
@Test
public void testDefenseFailure(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    warrior.defenseFailure(5);
    //then
    assertTrue(warrior.getLifePoints() <= 100 && warrior.getLifePoints() >= 90);
}

/** 
* 
* Method: attackCriticalFailure() 
* 
*/ 
@Test
public void testAttackCriticalFailure(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
            .attackRate(10)
            .defenseRate(10)
            .lifePoints(100)
            .damage(5)
            .build();
    //when
    int warriorLifePoints = warrior.getLifePoints();
    warrior.attackCriticalFailure();
    //then
    assertEquals(warriorLifePoints- 3, warrior.getLifePoints());
} 

/** 
* 
* Method: defenseCriticalFailure(int damageTaken) 
* 
*/ 
@Test
public void testDefenseCriticalFailure(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
            .attackRate(10)
            .defenseRate(10)
            .lifePoints(100)
            .damage(5)
            .build();
    //when
    int warriorLifePoints = warrior.getLifePoints();
    warrior.defenseCriticalFailure(5);
    //then
    assertEquals(warrior.getLifePoints(), warriorLifePoints - 10);
}

/** 
* 
* Method: takeDamage(int damageTaken) 
* 
*/ 
@Test
public void testTakeDamage(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorLifePoints = warrior.getLifePoints();
    warrior.takeDamage(5);
    //then
    assertEquals(warriorLifePoints - 5, warrior.getLifePoints());
} 

/** 
* 
* Method: toStringHP() 
* 
*/ 
@Test
public void testToStringHP(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    String warriorHP = warrior.toStringHP();
    //then
    assertEquals("100", warriorHP);
} 

/** 
* 
* Method: toStringName() 
* 
*/ 
@Test
public void testToStringName(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    String warriorName = warrior.toStringName();
    //then
    assertEquals("warrior", warriorName);
}



/** 
* 
* Method: attackRate(final int attackRate) 
* 
*/ 
@Test
public void testAttackRate(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorAttackRate = warrior.getAttackRate();
    //then
    assertEquals(10, warriorAttackRate);
} 

/** 
* 
* Method: defenseRate(final int defenseRate) 
* 
*/ 
@Test
public void testDefenseRate(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorDefenseRate = warrior.getDefenseRate();
    //then
    assertEquals(10, warriorDefenseRate);

} 

/** 
* 
* Method: lifePoints(final int lifePoints) 
* 
*/ 
@Test
public void testLifePoints(){
     //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorLifePoints = warrior.getLifePoints();
    //then
    assertEquals(100, warriorLifePoints);
} 

/** 
* 
* Method: maxLifePoints(final int maxLifePoints) 
* 
*/ 
@Test
public void testMaxLifePoints(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorMaxLifePoints = warrior.getMaxLifePoints();
    //then
    assertEquals(100, warriorMaxLifePoints);
} 

/** 
* 
* Method: damage(final int damage) 
* 
*/ 
@Test
public void testDamage(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    int warriorDamage = warrior.getDamage();
    //then
    assertEquals(5, warriorDamage);

} 

/** 
* 
* Method: name(final String name) 
* 
*/ 
@Test
public void testName(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    String warriorName = warrior.getName();
    //then
    assertEquals("warrior", warriorName);
} 

/** 
* 
* Method: build() 
* 
*/ 
@Test
public void testBuild(){
    //given
    Warrior warrior = new Warrior.Builder().name("warrior")
                                           .attackRate(10)
                                           .defenseRate(10)
                                           .lifePoints(100)
                                           .damage(5)
                                           .build();
    //when
    String warriorName = warrior.getName();
    int warriorAttackRate = warrior.getAttackRate();
    int warriorDefenseRate = warrior.getDefenseRate();
    int warriorLifePoints = warrior.getLifePoints();
    int warriorMaxLifePoints = warrior.getMaxLifePoints();
    int warriorDamage = warrior.getDamage();
    //then
    assertEquals("warrior", warriorName);
    assertEquals(10, warriorAttackRate);
    assertEquals(10, warriorDefenseRate);
    assertEquals(100, warriorLifePoints);
    assertEquals(100, warriorMaxLifePoints);
    assertEquals(5, warriorDamage);
}


}
