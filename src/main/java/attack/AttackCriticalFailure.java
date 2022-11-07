package attack;

import characters.InterfaceCharacters;
import dices.Strategy;

public class AttackCriticalFailure implements Attack{

	@Override
	public Strategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackCriticalFailure.attack()");
		return player.attackCriticalFailure();

	}
	
}
