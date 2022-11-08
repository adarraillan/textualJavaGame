import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import characters.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** 
* Warrior Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 7, 2022</pre> 
* @version 1.0 
*/ 
public class WarriorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getAttackRate() 
* 
*/ 
@Test
public void testGetAttackRate() throws Exception {
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
public void testSetAttackRate() throws Exception { 
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
public void testGetDefenseRate() throws Exception {
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
public void testSetDefenseRate() throws Exception {
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
public void testGetName() throws Exception {
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
public void testSetName() throws Exception {
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
public void testGetLifePoints() throws Exception {
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
public void testSetLifePoints() throws Exception {
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
public void testGetDamage() throws Exception {
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
public void testSetDamage() throws Exception {
    //given
    Warrior.Builder builder = new Warrior.Builder();
    //when
    Warrior warrior = builder.damage(5).build();
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
public void testAttackAttempt() throws Exception {
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
public void testDefenseAttempt() throws Exception { 
    //test defenseAttempt
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
public void testAttackSuccess() throws Exception { 
    //test attackSuccess
    //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    Warrior target = new Warrior.Builder().name("target").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    //when
    warrior.attackSuccess(target, 5);
    //then
    assertTrue(target.getLifePoints() <= 100 && target.getLifePoints() >= 90);
}

/** 
* 
* Method: defenseSuccess(int damageTaken) 
* 
*/ 
@Test
public void testDefenseSuccess() throws Exception { 
    //test defenseSuccess
    //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
    //when
    warrior.defenseSuccess(5);
    //then
    assertTrue(warrior.getLifePoints() <= 99 && warrior.getLifePoints() >= 97);

} 

/** 
* 
* Method: attackCriticalSuccess(final InterfaceCharacters target, int damage) 
* 
*/ 
@Test
public void testAttackCriticalSuccess() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: defenseCriticalSuccess() 
* 
*/ 
@Test
public void testDefenseCriticalSuccess() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: attackFailure() 
* 
*/ 
@Test
public void testAttackFailure() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: defenseFailure(int damageTaken) 
* 
*/ 
@Test
public void testDefenseFailure() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: attackCriticalFailure() 
* 
*/ 
@Test
public void testAttackCriticalFailure() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: defenseCriticalFailure(int damageTaken) 
* 
*/ 
@Test
public void testDefenseCriticalFailure() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: takeDamage(int damageTaken) 
* 
*/ 
@Test
public void testTakeDamage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toStringHP() 
* 
*/ 
@Test
public void testToStringHP() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toStringName() 
* 
*/ 
@Test
public void testToStringName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectAspect() 
* 
*/ 
@Test
public void testSelectAspect() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: attackRate(final int attackRate) 
* 
*/ 
@Test
public void testAttackRate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: defenseRate(final int defenseRate) 
* 
*/ 
@Test
public void testDefenseRate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: lifePoints(final int lifePoints) 
* 
*/ 
@Test
public void testLifePoints() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: maxLifePoints(final int maxLifePoints) 
* 
*/ 
@Test
public void testMaxLifePoints() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: damage(final int damage) 
* 
*/ 
@Test
public void testDamage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: name(final String name) 
* 
*/ 
@Test
public void testName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: build() 
* 
*/ 
@Test
public void testBuild() throws Exception { 
//TODO: Test goes here... 
} 


} 
