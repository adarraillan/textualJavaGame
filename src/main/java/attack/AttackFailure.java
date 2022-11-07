package attack;

import characters.InterfaceCharacters;
import dices.AttackChoiceStrategy;

public class AttackFailure implements Attack{

	@Override
	public AttackChoiceStrategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackFailure.attack()");
		return player.attackFailure();

	}
	
}
