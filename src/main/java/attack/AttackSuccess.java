package attack;

import characters.InterfaceCharacters;
import dices.AttackChoiceStrategy;

public class AttackSuccess implements Attack{

	@Override
	public AttackChoiceStrategy attack(InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans AttackSuccess.attack()");
		return player.attackSuccess(target);

	}
	
}
