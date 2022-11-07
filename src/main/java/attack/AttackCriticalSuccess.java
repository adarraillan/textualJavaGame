package attack;

import characters.InterfaceCharacters;

public class AttackCriticalSuccess  implements Attack{

	@Override
	public void attack(InterfaceCharacters player, InterfaceCharacters target) {
		player.attackCriticalSuccess(target, player.getDamage());

	}
	

	
}
