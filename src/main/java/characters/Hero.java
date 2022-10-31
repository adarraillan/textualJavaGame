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
	String dialogue;
	
	
	public Hero(int attackRate, int defenseRate, int speedPoints, int lifePoints, int maxLifePoints, String dialogue){ 
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.speedPoints = speedPoints;
		this.lifePoints = lifePoints;
		this.maxLifePoints = maxLifePoints;
		this.dialogue = dialogue;
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

	public String getDialogue() {
		return dialogue;
	}

	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target) {
		int attempt = dices.Dice.roll10();
		System.out.println("Le dé à fait :" + attempt);
		if (attempt == 1) {
			attackCriticalSuccess(target);
		}else{
			if (attempt == 10) {
				attackCriticalFailure();
			}else {
				if(attempt < attackRate) {
					attackSuccess(target);
				}else {
					attackFailure();
				}
			}
		}
	}
	
	public void attackSuccess(final InterfaceCharacters target) {
		System.out.println("Attack succeded!");
		target.takeDamage(DAMAGE);
	}
	
	public void attackCriticalSuccess(final InterfaceCharacters target) {
		System.out.println("Critical Attack!");
		target.takeDamage(DAMAGE*2);	
	}
	
	public void attackFailure() {
		System.out.println("Oops, you've missed!");
	}
	
	public void attackCriticalFailure() {
		System.out.println("Oooooops, critical failure, you hurt yourself!\n You loose 3 HP!");
		this.takeDamage(3);
	}

	
	public void takeDamage(int damageTaken) {
		this.setLifePoints(this.lifePoints - damageTaken);
	}

	public String toStringHP() {
		return (""+ this.lifePoints );
	}
}
