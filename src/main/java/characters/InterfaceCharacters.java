package characters;

import dices.Strategy;

public interface InterfaceCharacters {
	
	public int getAttackRate();

	public void setAttackRate(int attackRate);
	
	public int getDefenseRate();

	public void setDefenseRate(int defenseRate);
	
	public int getLifePoints();

	public void setLifePoints(int lifePoints);
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target);
	
	public void defenseAttempt(int attackRate);
	
	public Strategy attackSuccess(final InterfaceCharacters target);
	
	public void defenseSuccess();
	
	public Strategy attackCriticalSuccess(final InterfaceCharacters target);
	
	public void defenseCriticalSuccess();
	
	public Strategy attackFailure();
	
	public void defenseFailure();
	
	public Strategy attackCriticalFailure();
	
	public void defenseCriticalFailure();
	
	public void takeDamage(int damageTaken);	
	
}
