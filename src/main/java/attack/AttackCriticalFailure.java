package attack;

import characters.InterfaceCharacters;

public class AttackCriticalFailure implements Attack{

	@Override
	public void attack(InterfaceCharacters player, InterfaceCharacters target) {
		player.attackCriticalFailure();

	}
	
}
