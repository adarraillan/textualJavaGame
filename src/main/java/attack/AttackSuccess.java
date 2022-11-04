package attack;

import characters.InterfaceCharacters;

public class AttackSuccess implements Attack{

	@Override
	public void attack(InterfaceCharacters player, InterfaceCharacters target) {
		player.attackSuccess(target);
	}
	
}
