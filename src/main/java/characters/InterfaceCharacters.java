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
	
	public void attackAttempt(int attackRate, final InterfaceCharacters target);
	
	public void defenseAttempt(int attackRate);
	
	public AttackChoiceStrategy attackSuccess(final InterfaceCharacters target);
	
	public DefenseChoiceStrategy defenseSuccess();
	
	public AttackChoiceStrategy attackCriticalSuccess(final InterfaceCharacters target);
	
	public DefenseChoiceStrategy defenseCriticalSuccess();
	
	public AttackChoiceStrategy attackFailure();
	
	public DefenseChoiceStrategy defenseFailure();
	
	public AttackChoiceStrategy attackCriticalFailure();
	
	public DefenseChoiceStrategy defenseCriticalFailure();
	
	public void takeDamage(int damageTaken);	
	
}
