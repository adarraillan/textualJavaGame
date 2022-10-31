package characters;
import dices.Dice;
import java.util.Random;
public class Hero implements InterfaceCharacters {
	int attackRate;
	int defenseRate;
	int speedPoints;
	int lifePoints;
	int maxLifePoints;
	int DAMAGE = 5;
	int ARMOR = 3;
	String name;
	
	
	public Hero(int attackRate, int defenseRate, int speedPoints, int lifePoints, int maxLifePoints, String name){ 
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.speedPoints = speedPoints;
		this.lifePoints = lifePoints;
		this.maxLifePoints = maxLifePoints;
		this.name = name;
	}
	
	public int getAttackRate() {
		return attackRate;
	}

	public void setAttackRate(int attackRate) {
		this.attackRate= attackRate;
	}
	
	public int getDefenseRate() {
		return defenseRate;
	}

	public void setDefenseRate(int defenseRate) {
		this.defenseRate = defenseRate;
	}

	public int getSpeedPoints() {
		return speedPoints;
	}

	public void setSpeedPoints(int speedPoints) {
		this.speedPoints = speedPoints;
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

	
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target) {
		int attempt = dices.Dice.roll10();
		System.out.println(this.toStringName() + "!!!!! Le dé à fait :" + attempt + " !!!!!");
		if (attempt == 1) {
			attackCriticalSuccess(target);
		}else{
			if (attempt == 10) {
				attackCriticalFailure();
			}else {
				if(attempt <= attackRate) {
					attackSuccess(target);
				}else {
					attackFailure();
				}
			}
		}
	}
	
	public void defenseAttempt(int attackRate) {
		int attempt = dices.Dice.roll10();
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
}
