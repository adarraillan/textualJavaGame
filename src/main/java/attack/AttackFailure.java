package attack;

import characters.InterfaceCharacters;
import dices.Strategy;

public class AttackFailure implements Attack{

	@Override
	public Strategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackFailure.attack()");
		return player.attackFailure();

	}
	
}
