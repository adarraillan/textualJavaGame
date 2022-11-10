package characters;

import characters.Wizard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Wizard Tester.
 *
 * @author <Adrien Darraillan>
 * @since <pre>Nov 7, 2022</pre>
 * @version 1.0
 */
public class WizardTest {

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
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.attackRate(5).build();
        //then
        assertEquals(5, wizard.getAttackRate());
    }

    /**
     *
     * Method: setAttackRate(int attackRate)
     *
     */
    @Test
    public void testSetAttackRate(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.attackRate(5).build();
        wizard.setAttackRate(10);
        //then
        assertEquals(10, wizard.getAttackRate());
    }

    /**
     *
     * Method: getDefenseRate()
     *
     */
    @Test
    public void testGetDefenseRate(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.defenseRate(5).build();
        //then
        assertEquals(5, wizard.getDefenseRate());
    }

    /**
     *
     * Method: setDefenseRate(int defenseRate)
     *
     */
    @Test
    public void testSetDefenseRate(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.defenseRate(5).build();
        wizard.setDefenseRate(10);
        //then
        assertEquals(10, wizard.getDefenseRate());
    }

    /**
     *
     * Method: getName()
     *
     */
    @Test
    public void testGetName(){
        //Wizard
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.name("Toto").build();
        //then
        assertEquals("Toto", wizard.getName());
    }

    /**
     *
     * Method: setName(String name)
     *
     */
    @Test
    public void testSetName() {
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.name("Toto").build();
        wizard.setName("Titi");
        //then
        assertEquals("Titi", wizard.getName());
    }

    /**
     *
     * Method: getLifePoints()
     *
     */
    @Test
    public void testGetLifePoints(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.lifePoints(10).build();
        //then
        assertEquals(10, wizard.getLifePoints());
    }

    /**
     *
     * Method: setLifePoints(int lifePoints)
     *
     */
    @Test
    public void testSetLifePoints(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.lifePoints(5).build();
        wizard.setLifePoints(10);
        //then
        assertEquals(10, wizard.getLifePoints());}

    /**
     *
     * Method: getDamage()
     *
     */
    @Test
    public void testGetDamage(){
        //given
        Wizard.Builder builder = new Wizard.Builder();
        //when
        Wizard wizard = builder.damage(5).build();
        //then
        assertEquals(5, wizard.getDamage());
    }

    /**
     *
     * Method: setDamage(int damage)
     *
     */
    @Test
    public void testSetDamage(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard").attackRate(10).defenseRate(10).lifePoints(100).build();
        //when
        wizard.setDamage(10);
        //then
        assertEquals(10, wizard.getDamage());
    }

    /**
     *
     * Method: attackAttempt(int attackRate, final InterfaceCharacters target)
     *
     */
    @Test
    public void testAttackAttempt(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
        Wizard target = new Wizard.Builder().name("target").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
        //when
        wizard.attackAttempt(wizard.getAttackRate(), target);
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
        Wizard wizard = new Wizard.Builder().name("wizard").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
        //when
        wizard.defenseAttempt(wizard.getDefenseRate(), 5);
        //then
        //wizard can have less life points, but also have the same life points
        assertTrue(wizard.getLifePoints() <= 100 && wizard.getLifePoints() >= 87);
    }

    /**
     *
     * Method: attackSuccess(final InterfaceCharacters target, int damage)
     *
     */
    @Test
    public void testAttackSuccess(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        Wizard target = new Wizard.Builder().name("target")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        wizard.attackSuccess(target, 5);
        //then
        assertTrue(target.getDefenseRate() == 10 && wizard.getDamage() == 5);
    }

    /**
     *
     * Method: defenseSuccess(int damageTaken)
     *
     */
    @Test
    public void testDefenseSuccess(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard").attackRate(10).defenseRate(10).lifePoints(100).damage(5).build();
        //when
        wizard.defenseSuccess(5);
        //then
        assertTrue(wizard.getLifePoints() <= 100 && wizard.getLifePoints() >= 97);

    }

    /**
     *
     * Method: attackCriticalSuccess(final InterfaceCharacters target, int damage)
     *
     */
    @Test
    public void testAttackCriticalSuccess(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(5)
                .defenseRate(5)
                .lifePoints(100)
                .damage(5)
                .build();
        Wizard target = new Wizard.Builder().name("target")
                .attackRate(5)
                .defenseRate(5)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        wizard.attackSuccess(target, 5);
        //then
        assertTrue(target.getDefenseRate() == 5 && wizard.getDamage() == 5
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
        Wizard target = new Wizard.Builder().name("target")
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
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();

        Wizard target = new Wizard.Builder().name("target")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();

        //when
        wizard.attackFailure();
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
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        wizard.defenseFailure(5);
        //then
        assertTrue(wizard.getLifePoints() <= 100 && wizard.getLifePoints() >= 90);
    }

    /**
     *
     * Method: attackCriticalFailure()
     *
     */
    @Test
    public void testAttackCriticalFailure(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardLifePoints = wizard.getLifePoints();
        wizard.attackCriticalFailure();
        //then
        assertEquals(wizardLifePoints- 3, wizard.getLifePoints());
    }

    /**
     *
     * Method: defenseCriticalFailure(int damageTaken)
     *
     */
    @Test
    public void testDefenseCriticalFailure(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardLifePoints = wizard.getLifePoints();
        wizard.defenseCriticalFailure(5);
        //then
        assertEquals(wizard.getLifePoints(), wizardLifePoints - 10);
    }

    /**
     *
     * Method: takeDamage(int damageTaken)
     *
     */
    @Test
    public void testTakeDamage(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardLifePoints = wizard.getLifePoints();
        wizard.takeDamage(5);
        //then
        assertEquals(wizardLifePoints - 5, wizard.getLifePoints());
    }

    /**
     *
     * Method: toStringHP()
     *
     */
    @Test
    public void testToStringHP(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        String wizardHP = wizard.toStringHP();
        //then
        assertEquals("100", wizardHP);
    }

    /**
     *
     * Method: toStringName()
     *
     */
    @Test
    public void testToStringName(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        String wizardName = wizard.toStringName();
        //then
        assertEquals("wizard", wizardName);
    }



    /**
     *
     * Method: attackRate(final int attackRate)
     *
     */
    @Test
    public void testAttackRate(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardAttackRate = wizard.getAttackRate();
        //then
        assertEquals(10, wizardAttackRate);
    }

    /**
     *
     * Method: defenseRate(final int defenseRate)
     *
     */
    @Test
    public void testDefenseRate(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardDefenseRate = wizard.getDefenseRate();
        //then
        assertEquals(10, wizardDefenseRate);

    }

    /**
     *
     * Method: lifePoints(final int lifePoints)
     *
     */
    @Test
    public void testLifePoints(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardLifePoints = wizard.getLifePoints();
        //then
        assertEquals(100, wizardLifePoints);
    }

    /**
     *
     * Method: maxLifePoints(final int maxLifePoints)
     *
     */
    @Test
    public void testMaxLifePoints(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardMaxLifePoints = wizard.getMaxLifePoints();
        //then
        assertEquals(100, wizardMaxLifePoints);
    }

    /**
     *
     * Method: damage(final int damage)
     *
     */
    @Test
    public void testDamage(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        int wizardDamage = wizard.getDamage();
        //then
        assertEquals(5, wizardDamage);

    }

    /**
     *
     * Method: name(final String name)
     *
     */
    @Test
    public void testName(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        String wizardName = wizard.getName();
        //then
        assertEquals("wizard", wizardName);
    }

    /**
     *
     * Method: build()
     *
     */
    @Test
    public void testBuild(){
        //given
        Wizard wizard = new Wizard.Builder().name("wizard")
                .attackRate(10)
                .defenseRate(10)
                .lifePoints(100)
                .damage(5)
                .build();
        //when
        String wizardName = wizard.getName();
        int wizardAttackRate = wizard.getAttackRate();
        int wizardDefenseRate = wizard.getDefenseRate();
        int wizardLifePoints = wizard.getLifePoints();
        int wizardMaxLifePoints = wizard.getMaxLifePoints();
        int wizardDamage = wizard.getDamage();
        //then
        assertEquals("wizard", wizardName);
        assertEquals(10, wizardAttackRate);
        assertEquals(10, wizardAttackRate);
        assertEquals(100, wizardLifePoints);
        assertEquals(100, wizardMaxLifePoints);
        assertEquals(5, wizardDamage);
    }


}
