package attack;

import characters.InterfaceCharacters;
import dices.Strategy;

public class AttackSuccess implements Attack{

	@Override
	public Strategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackSuccess.attack()");
		return player.attackSuccess(target);

	}
	
}
