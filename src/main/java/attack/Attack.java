package attack;

import characters.InterfaceCharacters;
import dices.AttackChoiceStrategy;

@FunctionalInterface
public interface Attack {
	
	AttackChoiceStrategy attack(InterfaceCharacters player, InterfaceCharacters target);

}
