package attack;

import characters.InterfaceCharacters;
import dices.Strategy;

public class AttackCriticalSuccess  implements Attack{

	@Override
	public Strategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackCriticalSuccess.attack()");
		return player.attackCriticalSuccess(target);

	}
	

	
}
