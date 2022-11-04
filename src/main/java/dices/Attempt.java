package dices;

import characters.InterfaceCharacters;

public class Attempt {


	public Attempt(int attackRate, InterfaceCharacters target){
		this.attackRate = attackRate;
		this.target = target;
	}


	public static Strategy attemptAttack(int attackRate) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {

			return Strategy.ATTACK_CRITICAL_SUCCESS;
		}else if(diceResult <= attackRate) {
			return Strategy.ATTACK_SUCCESS;
		}else if(diceResult < 10) {
			return Strategy.ATTACK_FAILURE;
		}else {
			return Strategy.ATTACK_CRITICAL_FAILURE;
		}
	}
}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat