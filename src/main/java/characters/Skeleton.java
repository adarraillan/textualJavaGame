package characters;

import java.util.Random;

public class Skeleton implements InterfaceCharacters{
	int attackPoints;
	int defensePoints;
	int speedPoints;
	int lifePoints;
	String dialogue;
	
	
	Skeleton(int attackPoints, int defensePoints, int speedPoints, int lifePoints, String dialogue){ 
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
		this.speedPoints = speedPoints;
		this.lifePoints = lifePoints; 
		this.dialogue = dialogue;
	}
	
	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	
	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
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
		if (defenseRate > rand.nextInt(11)) {
			this.setLifePoints(damageSuffered(damageTaken, armor) / 2);
		}else {	
		this.setLifePoints(damageSuffered(damageTaken, armor));
		}
	}
	
	private int damageSuffered(int damageTaken, int armor) {
		return (damageTaken - armor);
	}
	
	
}
