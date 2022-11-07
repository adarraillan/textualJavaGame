package characters;

import dices.*;

public class Wizard implements Hero{
	
	private final static int DAMAGE = 5;
	private final static int ARMOR = 3; 
	
	private int attackRate;
	private int defenseRate;
	private int lifePoints;
	private int maxLifePoints;
	private String name;
    private int damage;

    //Pattern builder to avoid to much parameters
	/**public Warrior(int attackRate, int defenseRate, int lifePoints, int maxLifePoints, String name){ 
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.lifePoints = lifePoints;
		this.maxLifePoints = maxLifePoints;
		this.name = name;
	}*/
	
	private Wizard(Builder builder) {
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
		
		public Wizard build() {
			return new Wizard(this);
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

	public int getDamage() {return damage;}

	public void setDamage(int damage) {this.damage = damage;}

	
	//TODO type d'attaque, Design pattern/strat pour éviter elif,switch avec enum
	public void attackAttempt(int attackRate, final InterfaceCharacters target) {
		//warrior attempt attack to target
		//AttemptAttack attack = new AttemptAttack(attackRate, target);
		System.out.println("Je suis dans Warrior.attackAttempt()");
		AttemptAttack.attemptAttack(attackRate, this, target);


	}

	public void defenseAttempt(int defenseRate, int damageTaken) {
		//AttemptDefense defense = new AttemptDefense(defenseRate);
		System.out.println("Je suis dans Warrior.defenseAttempt()");
		AttemptDefense.attemptDefense(defenseRate, this, damageTaken);
	}




	public AttackChoiceStrategy attackSuccess(final InterfaceCharacters target, int damage) {
		System.out.println("Attack succeded!");
		target.defenseAttempt(target.getDefenseRate(), this.damage);
		return null;
	}

	public DefenseChoiceStrategy defenseSuccess(int damageTaken) {
		System.out.println("Defense succeded!");
		this.takeDamage(damageTaken - ARMOR - dices.Dice.roll2());
		return null;
	}

	public AttackChoiceStrategy attackCriticalSuccess(final InterfaceCharacters target, int damage) {
		System.out.println("Critical Attack!");
		target.defenseAttempt(target.getDefenseRate()/2, this.damage);
		return null;
	}

	public DefenseChoiceStrategy defenseCriticalSuccess() {
		System.out.println("Critical Defense!");
		this.takeDamage(0);
		return null;
	}

	public AttackChoiceStrategy attackFailure() {
		System.out.println("Oops, you've missed!");
		return null;
	}

	public DefenseChoiceStrategy defenseFailure(int damageTaken) {
		System.out.println("Oops, you've missed your defense!");
		this.takeDamage(damageTaken - ARMOR);
		return null;
	}

	public AttackChoiceStrategy attackCriticalFailure() {
		System.out.println("Oooooops, critical failure, you hurt yourself!\n You loose 3 HP!");
		this.takeDamage(3);
		return null;
	}

	public DefenseChoiceStrategy defenseCriticalFailure(int damageTaken) {
		System.out.println("Oooooops, critical failure, you cannot protect yourself! Armor ignored!");
		this.takeDamage(damageTaken * 2);
		return null;
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
