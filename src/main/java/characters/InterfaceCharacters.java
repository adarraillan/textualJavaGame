package characters;

import dices.AttackChoiceStrategy;
import dices.DefenseChoiceStrategy;

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
	
	public AttackChoiceStrategy attackSuccess(final InterfaceCharacters target, int damage);
	
	public DefenseChoiceStrategy defenseSuccess(int damageTaken);
	
	public AttackChoiceStrategy attackCriticalSuccess(final InterfaceCharacters target, int damage);
	
	public DefenseChoiceStrategy defenseCriticalSuccess();
	
	public AttackChoiceStrategy attackFailure();
	
	public DefenseChoiceStrategy defenseFailure(int damageTaken);
	
	public AttackChoiceStrategy attackCriticalFailure();
	
	public DefenseChoiceStrategy defenseCriticalFailure(int damageTaken);
	
	public void takeDamage(int damageTaken);

	String toStringHP();
}
