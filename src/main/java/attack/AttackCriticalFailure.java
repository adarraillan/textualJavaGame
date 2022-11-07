package attack;

import characters.InterfaceCharacters;
import dices.AttackChoiceStrategy;

public class AttackCriticalFailure implements Attack{

	@Override
	public AttackChoiceStrategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackCriticalFailure.attack()");
		return player.attackCriticalFailure();

	}
	
}
