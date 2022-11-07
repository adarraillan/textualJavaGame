package attack;

import characters.InterfaceCharacters;

public class AttackFailure implements Attack{

	@Override
	public void attack(InterfaceCharacters player, InterfaceCharacters target) {
		player.attackFailure();

	}
	
}
