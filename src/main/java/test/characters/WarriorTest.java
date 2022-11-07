package test.characters; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import characters.*;

import static org.junit.Assert.assertEquals;

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
//TODO: Test goes here... 
} 

/** 
* 
* Method: setAttackRate(int attackRate) 
* 
*/ 
@Test
public void testSetAttackRate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getDefenseRate() 
* 
*/ 
@Test
public void testGetDefenseRate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setDefenseRate(int defenseRate) 
* 
*/ 
@Test
public void testSetDefenseRate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getLifePoints() 
* 
*/ 
@Test
public void testGetLifePoints() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setLifePoints(int lifePoints) 
* 
*/ 
@Test
public void testSetLifePoints() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getDamage() 
* 
*/ 
@Test
public void testGetDamage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getDamage(int damage) 
* 
*/ 
@Test
public void testGetDamageDamage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setDamage(int damage) 
* 
*/ 
@Test
public void testSetDamage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: attackAttempt(int attackRate, final InterfaceCharacters target) 
* 
*/ 
@Test
public void testAttackAttempt() throws Exception { 
//TODO: Test goes here...
    //junit test for attackAttempt
    //given
    Warrior warrior = new Warrior.Builder().name("warrior").attackRate(10).defenseRate(10).lifePoints(100).build();
    Warrior target = new Warrior.Builder().name("target").attackRate(10).defenseRate(10).lifePoints(100).build();
    //when
    warrior.attackAttempt(warrior.getAttackRate(), target);
    //then
    assertEquals(90, target.getLifePoints());
} 

/** 
* 
* Method: defenseAttempt(int defenseRate, int damageTaken) 
* 
*/ 
@Test
public void testDefenseAttempt() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: attackSuccess(final InterfaceCharacters target, int damage) 
* 
*/ 
@Test
public void testAttackSuccess() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: defenseSuccess(int damageTaken) 
* 
*/ 
@Test
public void testDefenseSuccess() throws Exception { 
//TODO: Test goes here... 
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
