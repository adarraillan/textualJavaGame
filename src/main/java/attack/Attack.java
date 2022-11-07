package attack;

import characters.InterfaceCharacters;

@FunctionalInterface
public interface Attack {
	
	void attack(InterfaceCharacters player, InterfaceCharacters target);

}
