package attack;

import characters.InterfaceCharacters;
import dices.AttackChoiceStrategy;

public class AttackCriticalSuccess  implements Attack{

	@Override
	public AttackChoiceStrategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackCriticalSuccess.attack()");
		return player.attackCriticalSuccess(target, player.getDamage());

	}
	

	
}
