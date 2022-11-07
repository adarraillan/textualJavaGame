package attack;

import characters.InterfaceCharacters;
import dices.Strategy;

@FunctionalInterface
public interface Attack {
	
	Strategy attack(InterfaceCharacters player, InterfaceCharacters target);

}
