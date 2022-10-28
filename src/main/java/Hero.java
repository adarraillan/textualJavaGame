import java.util.Random;
import java.util.random.*;
public class Hero implements InterfacePersonnages {
	int attackRate;
	int defenseRate;
	int speedPoints;
	int lifePoints;
	String dialogue;
	
	
	Hero(int attackRate, int defenseRate, int speedPoints, int lifePoints, String dialogue){ 
		this.attackRate = attackRate;
		this.defenseRate = defenseRate;
		this.speedPoints = speedPoints;
		this.lifePoints = lifePoints;
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

	
	
	private boolean attackAttemps(int attackRate) {
		Random rand = new Random();
		return (rand.nextInt(11) < attackRate);
	}
	
	private void lifePointsLeft(int damageTaken, int defenseRate, int armor) {
		Random rand = new Random();
		(defenseRate > rand.nextInt(11)) ? return setLifePoints(damageSuffered(damageTaken, armor) / 2) : return setLifePoints(damageSuffered(damageTaken, armor));
	}
	
	private int damageSuffered(int damageTaken, int armor) {
		return 0;
	}
}
