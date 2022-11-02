package characters;

import dices.Attempt;
import dices.Dice;

public class Warrior implements InterfaceCharacters {
	
	private final static int DAMAGE = 5;
	private final static int ARMOR = 3; 
	
	private int attackRate;
	private int defenseRate;
	private int lifePoints;
	private int maxLifePoints;
	private String name;
	
	//Pattern builder to avoid to much parameters
	public Warrior(int attackRate, int defenseRate, int lifePoints, int maxLifePoints, String name){ 
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.lifePoints = lifePoints;
		this.maxLifePoints = maxLifePoints;
		this.name = name;
	}
	
	public int getAttackRate() {
		return attackRate;
	}
	//TODO check
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

	
	//TODO type d'attaque, Design pattern/strat pour éviter elif,switch avec enum
	public void attackAttempt(int attackRate, final InterfaceCharacters target) {
		String attempt = Attempt.attemptAttack(attackRate);
		
		System.out.println(this.toStringName() + "!!!!! Le dé à fait :" + attempt + " !!!!!");
		
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
		System.out.println(this.toStringName() + "????? Le dé de défense à fait :" + attempt + " ?????");
		if (attempt == 1) {
			defenseCriticalSuccess();
		}else{
			if (attempt == 10) {
				defenseCriticalFailure();
			}else {
				if(attempt <= defenseRate) {
					defenseSuccess();
				}else {
					defenseFailure();
				}
			}
		}
	}
	
	
	public void attackSuccess(final InterfaceCharacters target) {
		System.out.println("Attack succeded!");
		target.defenseAttempt(target.getDefenseRate());
	}
	
	public void defenseSuccess() {
		System.out.println("Defense succeded!");
		this.takeDamage(DAMAGE - ARMOR - dices.Dice.roll2());
	}
	
	public void attackCriticalSuccess(final InterfaceCharacters target) {
		System.out.println("Critical Attack!");
		target.defenseAttempt(target.getDefenseRate()/2);
	}
	
	public void defenseCriticalSuccess() {
		System.out.println("Critical Defense!");
		this.takeDamage(0);	
	}
	
	public void attackFailure() {
		System.out.println("Oops, you've missed!");
	}
	
	public void defenseFailure() {
		System.out.println("Oops, you've missed your defense!");
		this.takeDamage(DAMAGE - ARMOR);
	}
	
	public void attackCriticalFailure() {
		System.out.println("Oooooops, critical failure, you hurt yourself!\n You loose 3 HP!");
		this.takeDamage(3);
	}
	
	public void defenseCriticalFailure() {
		System.out.println("Oooooops, critical failure, you cannot protect yourself! Armor ignored!");
		this.takeDamage(DAMAGE*2);
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
