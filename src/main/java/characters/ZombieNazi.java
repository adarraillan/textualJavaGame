package characters;

import java.util.Random;

import dialogues.Dialogues;
import dices.*;

public class ZombieNazi implements Zombie {

    private final static int DAMAGE = 5;
    private final static int ARMOR = 3;

    private int attackRate;
    private int defenseRate;
    private int speedPoints;
    private int lifePoints;
    private String dialogue;

    //Pattern builder to avoid to much parameters
    /**public SkeletonArcher(int attackRate, int defenseRate, int lifePoints, int maxLifePoints, String name){
     this.attackRate = attackRate;
     this.defenseRate = defenseRate;
     this.lifePoints = lifePoints;
     this.maxLifePoints = maxLifePoints;
     this.name = name;
     }*/

    private ZombieNazi(Builder builder) {
        this.attackRate = builder.attackRate;
        this.defenseRate = builder.defenseRate;
        this.speedPoints = builder.speedPoints;
        this.lifePoints = builder.lifePoints;
        this.dialogue = builder.dialogue;
    }

    @Override
    public int getSpeedPoints() {
        return 0;
    }

    @Override
    public void setSpeedPoints(int speedPoints) {

    }

    @Override
    public String getDialogue() {
        return null;
    }

    @Override
    public void setDialogue(String dialogue) {

    }


    public static class Builder{

        private int attackRate;
        private int defenseRate;
        private int lifePoints;
        private int speedPoints;
        private String dialogue;

        public Builder attackRate(final int attackRate) {
            this.attackRate = attackRate;
            return this;
        }

        public Builder defenseRate(final int defenseRate) {
            this.defenseRate = defenseRate;
            return this;
        }

        public Builder lifePoints(final int lifePoints) {
            this.lifePoints = lifePoints;
            return this;
        }

        public Builder speedPoints(final int speedPoints) {
            this.speedPoints = speedPoints;
            return this;
        }

        public Builder dialogue() {
            Random random = new Random();
            int rand = random.nextInt(12);
            this.dialogue = Dialogues.DIALOGUES_SKELETON.giveDialogue(rand);
            return this;
        }

        public ZombieNazi build() {
            return new ZombieNazi(this);
        }

    }



    public int getAttackRate() {
        return attackRate;
    }
    //TODO check setters if let mutable class
    public void setAttackRate(int attackRate) {
        this.attackRate= attackRate;
    }

    public int getDefenseRate() {
        return defenseRate;
    }

    public void setDefenseRate(int defenseRate) {
        this.defenseRate = defenseRate;
    }


    public String getName() {
        return null;
    }


    public void setName(String name) {

    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getdialogue() {
        return this.dialogue;
    }

    //TODO type d'attaque, Design pattern/strat pour éviter elif,switch avec enum
    public void attackAttempt(int attackRate, final InterfaceCharacters target) {

        System.out.println("Je sui dans ZombieNazi.attackAttempt()");
        AttemptAttack.attemptAttack(attackRate, this, target);

    }

    public void defenseAttempt(int attackRate) {

        System.out.println("Je suis dans ZombieNazi.defenseAttempt()");
        AttemptDefense.attemptDefense(attackRate, this);

    }


    public AttackChoiceStrategy attackSuccess(final InterfaceCharacters target) {
        target.defenseAttempt(target.getDefenseRate());
        return null;
    }

    public DefenseChoiceStrategy defenseSuccess() {
        this.takeDamage(DAMAGE - ARMOR - dices.Dice.roll2());
        return null;
    }

    public AttackChoiceStrategy attackCriticalSuccess(final InterfaceCharacters target) {
        target.defenseAttempt(target.getDefenseRate()/2);
        return null;
    }

    public DefenseChoiceStrategy defenseCriticalSuccess() {
        this.takeDamage(0);
        return null;
    }

    public AttackChoiceStrategy attackFailure() {
        return null;
    }

    public DefenseChoiceStrategy defenseFailure() {
        this.takeDamage(DAMAGE - ARMOR);
        return null;
    }

    public AttackChoiceStrategy attackCriticalFailure() {
        this.takeDamage(3);
        return null;
    }

    public DefenseChoiceStrategy defenseCriticalFailure() {
        this.takeDamage(DAMAGE*2);
        return null;
    }

    public void takeDamage(int damageTaken) {
        this.setLifePoints(this.lifePoints - damageTaken);
    }

    public String toStringHP() {
        return (""+ this.lifePoints );
    }

}
