package characters;

import java.util.Random;

import dialogues.Dialogues;
import dices.Attempt;
import dices.Dice;

public class SkeletonArcher implements Skeleton  {

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
	
	private SkeletonArcher(Builder builder) {
		this.attackRate = builder.attackRate;
		this.defenseRate = builder.defenseRate;
		this.speedPoints = builder.speedPoints;
		this.lifePoints = builder.lifePoints;
		this.dialogue = builder.dialogue;
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
		String attempt = Attempt.attemptAttack(attackRate);
		
		System.out.println("Skeleton Archer !!!!! Le dé à fait :" + attempt + " !!!!!");
		
		if (attempt == "attackCriticalSuccess") {
			attackCriticalSuccess(target);
		}else if(attempt == "attackSuccess"){
			attackSuccess(target);
		}else if(attempt == "attackFailure"){
			attackFailure();
		}else {
			attackCriticalFailure();
		}
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
	
	
	public void attackSuccess(final InterfaceCharacters target) {
		target.defenseAttempt(target.getDefenseRate());
	}
	
	public void defenseSuccess() {
		this.takeDamage(DAMAGE - ARMOR - dices.Dice.roll2());
	}
	
	public void attackCriticalSuccess(final InterfaceCharacters target) {
		target.defenseAttempt(target.getDefenseRate()/2);
	}
	
	public void defenseCriticalSuccess() {
		this.takeDamage(0);	
	}
	
	public void attackFailure() {
	}
	
	public void defenseFailure() {
		this.takeDamage(DAMAGE - ARMOR);
	}
	
	public void attackCriticalFailure() {
		this.takeDamage(3);
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
