package dices;
import attack.*;
import characters.InterfaceCharacters;

//change name, avoid override
public enum Strategy {
	
	ATTACK_SUCCESS(new AttackSuccess()),
	ATTACK_CRITICAL_SUCCESS(new AttackCriticalSuccess()),
	ATTACK_FAILURE(new AttackFailure()),
	ATTACK_CRITICAL_FAILURE(new AttackCriticalFailure());
	
	private Attack attackType;
	
	private Strategy(Attack attack) {
		this.attackType = attack;
	}
	
	public void attack(InterfaceCharacters player, InterfaceCharacters target) {
		attackType.attack(player, target);
	}
	
}
