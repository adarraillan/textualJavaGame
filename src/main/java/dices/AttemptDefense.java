package dices;

import characters.InterfaceCharacters;

public class AttemptDefense {


/*	private final int defenseRate;

	public AttemptDefense(int defenseRate) {
		this.defenseRate = defenseRate;
	}*/

	public static void attemptDefense(int defenseRate, InterfaceCharacters player, int damageTaken) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			DefenseChoiceStrategy.DEFENSE_CRITICAL_SUCCESS.defense(player, damageTaken);
		}else if(diceResult <= defenseRate) {
			DefenseChoiceStrategy.DEFENSE_SUCCESS.defense(player, damageTaken);
		}else if(diceResult < 10) {
			DefenseChoiceStrategy.DEFENSE_FAILURE.defense(player, damageTaken);
		}else {
			DefenseChoiceStrategy.DEFENSE_CRITICAL_FAILURE.defense(player, damageTaken);
		}
	}


}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat