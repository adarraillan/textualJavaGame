package defense;

import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

@FunctionalInterface
public interface Defense {
	
	DefenseChoiceStrategy defense(InterfaceCharacters player);

}
