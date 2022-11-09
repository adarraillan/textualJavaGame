package characters;

import dices.AttemptAttack;
import dices.AttemptDefense;

public final class Warrior implements Hero {
	private final static int ARMOR = 3; 
	
	private int attackRate;
	private int defenseRate;
	private int lifePoints;
	private final int maxLifePoints;
	private int damage;
	private String name;

	
	private Warrior(Builder builder) {
		this.attackRate = builder.attackRate;
		this.defenseRate = builder.defenseRate;
		this.lifePoints = builder.lifePoints;
		this.maxLifePoints = builder.maxLifePoints;
		this.damage = builder.damage;
		this.name = builder.name;
	}
	

	public static class Builder{
		
		private int attackRate;
		private int defenseRate;
		private int lifePoints;
		private int maxLifePoints;
		private int damage;
		private String name;
		
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
		
		public Builder maxLifePoints(final int maxLifePoints) {
			this.maxLifePoints = maxLifePoints;
			return this;
		}

		public Builder damage(final int damage) {

			this.damage = damage;
			return this;
		}
		
		public Builder name(final String name) {
			this.name = name;
			return this;
		}
		
		public Warrior build() {
			return new Warrior(this);
		}


	}
	
	
	//
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {

		this.damage = damage;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {

		this.lifePoints = lifePoints;

	}





	//TODO type d'attaque, Design pattern/strat pour éviter elif,switch avec enum

	public void attackAttempt(int attackRate, final InterfaceCharacters target) {
		//warrior attempt attack to target
		//AttemptAttack attack = new AttemptAttack(attackRate, target);
		new AttemptAttack().attemptAttack(attackRate, this, target);


	}

	public void defenseAttempt(int defenseRate, int damageTaken) {
		//AttemptDefense defense = new AttemptDefense(defenseRate);
		AttemptDefense.attemptDefense(defenseRate, this, damageTaken);

	}
		
	
	
	
	public void attackSuccess(final InterfaceCharacters target, int damage) {
		target.defenseAttempt(target.getDefenseRate(), this.damage);
	}
	
	public void defenseSuccess(int damageTaken) {
		this.takeDamage(Math.abs(damageTaken - ARMOR - dices.Dice.roll2()));
	}
	
	public void attackCriticalSuccess(final InterfaceCharacters target, int damage) {
		target.defenseAttempt(target.getDefenseRate()/2, this.damage);
	}
	
	public void defenseCriticalSuccess() {
		this.takeDamage(0);
	}
	
	public void attackFailure() {
		System.out.println("You missed your attack");
	}
	
	public void defenseFailure(int damageTaken) {
		this.takeDamage(Math.abs(damageTaken - ARMOR));
	}
	
	public void attackCriticalFailure() {
		System.out.println("Oooooops, critical failure, you hurt yourself!\n You loose 3 HP!");
		this.takeDamage(3);
	}
	
	public void defenseCriticalFailure(int damageTaken) {
		System.out.println("Oooooops, critical failure, you cannot protect yourself! Armor ignored!");
		this.takeDamage(damageTaken * 2);
	}

	
	public void takeDamage(int damageTaken) {
		this.setLifePoints(this.lifePoints - damageTaken);
	}

	public String toStringHP() {
		return (""+ this.lifePoints );
	}
	
	public String toStringName() {
		return (""+ this.name );
	}

	public void selectAspect() {
		
	}
}
