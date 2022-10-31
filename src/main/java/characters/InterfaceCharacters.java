package characters;

public interface InterfaceCharacters {
	
	public int getAttackRate();

	public void setAttackRate(int attackRate);
	
	public int getDefenseRate();

	public void setDefenseRate(int defenseRate); 

	public int getSpeedPoints();

	public void setSpeedPoints(int speedPoints) ;

	public String getDialogue();

	public void setDialogue(String dialogue);
	
	public int getLifePoints();

	public void setLifePoints(int lifePoints);
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target);
	
	public void attackSuccess(final InterfaceCharacters target);
	
	public void attackCriticalSuccess(final InterfaceCharacters target);
	
	public void attackFailure();
	
	public void attackCriticalFailure();
	
	public void takeDamage(int damageTaken);	
	
}
