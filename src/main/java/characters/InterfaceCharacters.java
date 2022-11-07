package characters;

public interface InterfaceCharacters {
	
	public int getAttackRate();

	public void setAttackRate(int attackRate);
	
	public int getDefenseRate();

	public void setDefenseRate(int defenseRate);
	
	public int getLifePoints();

	public void setLifePoints(int lifePoints);

	public int getDamage();

	public void setDamage(int damage);

	public void attackAttempt(int attackRate, final InterfaceCharacters target);

	public void defenseAttempt(int attackRate, int damageTaken);
	
	public void attackSuccess(final InterfaceCharacters target, int damage);
	
	public void defenseSuccess(int damageTaken);
	
	public void attackCriticalSuccess(final InterfaceCharacters target, int damage);
	
	public void defenseCriticalSuccess();
	
	public void attackFailure();
	
	public void defenseFailure(int damageTaken);
	
	public void attackCriticalFailure();
	
	public void defenseCriticalFailure(int damageTaken);
	
	public void takeDamage(int damageTaken);

	String toStringHP();
}
