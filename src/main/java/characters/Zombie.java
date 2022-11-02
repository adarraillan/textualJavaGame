package characters;

import java.util.Random;

public class Zombie /**implements InterfaceCharacters*/{
	int attackPoints;
	int defensePoints;
	int speedPoints;
	int lifePoints;
	String dialogue;
	
	
	Zombie(int attackPoints, int defensePoints, int speedPoints, int lifePoints, String dialogue){ 
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
	
	
	
	private boolean attackAttemps(int attackRate, int defenseRate) {
		Random rand = new Random();
		int attempt = rand.nextInt(11);
		return (attempt < attackRate) && (attempt < defenseRate);
	}
	
	private void lifePointsLeft(int damageTaken, int defenseRate) {
		Random rand = new Random();
		if (rand.nextInt(11) != 1) {
			this.setLifePoints(this.getLifePoints() - damageTaken);
		}
	}
	
	
	

}
