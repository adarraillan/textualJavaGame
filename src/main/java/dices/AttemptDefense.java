package dices;

import characters.InterfaceCharacters;

public class AttemptDefense {


/*	private final int defenseRate;

	public AttemptDefense(int defenseRate) {
		this.defenseRate = defenseRate;
	}*/

	public static DefenseChoiceStrategy attemptDefense(int defenseRate, InterfaceCharacters player) {
		System.out.println("Je suis dans Attempt.attemptDefense()");
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			System.out.println("defense critique!");
			return DefenseChoiceStrategy.DEFENSE_CRITICAL_SUCCESS.defense(player);
		}else if(diceResult <= defenseRate) {
			System.out.println("defense réussie!");
			return DefenseChoiceStrategy.DEFENSE_SUCCESS.defense(player);
		}else if(diceResult < 10) {
			System.out.println("defense ratée!");
			return DefenseChoiceStrategy.DEFENSE_FAILURE.defense(player);
		}else {
			System.out.println("defense critique ratée!");
			return DefenseChoiceStrategy.DEFENSE_CRITICAL_FAILURE.defense(player);
		}
	}


}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat