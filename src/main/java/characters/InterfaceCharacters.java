package characters;

public interface InterfaceCharacters {
	
	public int getAttackRate();

	public void setAttackRate(int attackRate);
	
	public int getDefenseRate();

	public void setDefenseRate(int defenseRate);

	public String getName();

	public void setName(String name);
	
	public int getLifePoints();

	public void setLifePoints(int lifePoints);
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target);
	
	public void defenseAttempt(int attackRate);
	
	public void attackSuccess(final InterfaceCharacters target);
	
	public void defenseSuccess();
	
	public void attackCriticalSuccess(final InterfaceCharacters target);
	
	public void defenseCriticalSuccess();
	
	public void attackFailure();
	
	public void defenseFailure();
	
	public void attackCriticalFailure();
	
	public void defenseCriticalFailure();
	
	public void takeDamage(int damageTaken);	
	
}
