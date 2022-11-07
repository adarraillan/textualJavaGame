package characters;

import java.util.Random;

import dialogues.Dialogues;
import dices.Dice;
import dices.Strategy;

public class SkeletonArcher implements Skeleton  {

	private final static int DAMAGE = 5;
	private final static int ARMOR = 3; 
	
	private int attackRate;
	private int defenseRate;
	private int lifePoints;

	public final String dialogue;
	
	private SkeletonArcher(Builder builder) {
		this.attackRate = builder.attackRate;
		this.defenseRate = builder.defenseRate;
		int speedPoints = builder.speedPoints;
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
		
		public SkeletonArcher build() {
			return new SkeletonArcher(this);
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

		this.attackAttempt(attackRate, target);
	}
	
	public void defenseAttempt(int attackRate) {
		int attempt = Dice.roll10();
		System.out.println("SkeletonArcher ????? Le dé de défense à fait :" + attempt + " ?????");
		if (attempt == 1) {
			defenseCriticalSuccess();
		}else if (attempt == 10){
			defenseCriticalFailure();
		}else if(attempt <= defenseRate){
			defenseSuccess();
		}else {
			defenseFailure();
		}
	}
	
	
	public Strategy attackSuccess(final InterfaceCharacters target) {
		target.defenseAttempt(target.getDefenseRate());
		return null;
	}
	
	public void defenseSuccess() {
		this.takeDamage(DAMAGE - ARMOR - dices.Dice.roll2());
	}
	
	public Strategy attackCriticalSuccess(final InterfaceCharacters target) {
		target.defenseAttempt(target.getDefenseRate()/2);
		return null;
	}
	
	public void defenseCriticalSuccess() {
		this.takeDamage(0);	
	}
	
	public Strategy attackFailure() {
        return null;
    }
	
	public void defenseFailure() {
		this.takeDamage(DAMAGE - ARMOR);
	}
	
	public Strategy attackCriticalFailure() {
		this.takeDamage(3);
		return null;
	}
	
	public void defenseCriticalFailure() {
		this.takeDamage(DAMAGE*2);
	}

	public void takeDamage(int damageTaken) {
		this.setLifePoints(this.lifePoints - damageTaken);
	}

	public String toStringHP() {
		return (""+ this.lifePoints );
	}

}
