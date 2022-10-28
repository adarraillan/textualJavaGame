
public class Skeleton implements InterfacePersonnages{
	int attackPoints;
	int defensePoints;
	int speedPoints;
	String dialogue;
	
	
	Skeleton(int attackPoints, int defensePoints, int speedPoints, String dialogue){ 
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
		this.speedPoints = speedPoints;
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

	
	
	
}
