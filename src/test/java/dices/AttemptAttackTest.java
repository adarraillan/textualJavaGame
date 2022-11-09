package dices;

import characters.Wizard;
import characters.ZombieNazi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

/** 
* AttemptAttack Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 8, 2022</pre> 
* @version 1.0 
*/ 
public class AttemptAttackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: attemptAttack(int attackRate, InterfaceCharacters player, InterfaceCharacters target) 
* 
*/ 
@Test
public void testAttemptAttack() throws Exception { 
    //given
    Wizard player = new Wizard.Builder()
                                        .attackRate(5)
                                        .defenseRate(5)
                                        .damage(7)
                                        .lifePoints(100)
                                        .maxLifePoints(100)
                                        .build();

    ZombieNazi target = new ZombieNazi.Builder()
                                        .attackRate(5)
                                        .defenseRate(5)
                                        .damage(7)
                                        .lifePoints(100)
                                        .speedPoints(100)
                                        .dialogue()
                                        .build();


    AttemptAttack attack = Mockito.mock(AttemptAttack.class);
    Mockito.when(attack.selectAttack(Mockito.anyInt())).thenReturn(AttackChoiceStrategy.ATTACK_CRITICAL_SUCCESS);
    //when
    attack.attemptAttack(player.getAttackRate(), player, target);
    //then
    assertTrue(player.getLifePoints() <= 100 && target.getLifePoints() >= 90);
} 


} 
