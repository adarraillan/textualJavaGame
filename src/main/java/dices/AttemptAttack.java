package dices;

import characters.InterfaceCharacters;

public class AttemptAttack {


	/*private final int attackRate;
	private final InterfaceCharacters target;

	public AttemptAttack(int attackRate, InterfaceCharacters target){
		this.attackRate = attackRate;
		this.target = target;
	}*/


	/**créer une seconde méthode qui sépare les if else, des appels de la stratégie*/
	public static void attemptAttack(int attackRate, InterfaceCharacters player, InterfaceCharacters target) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			AttackChoiceStrategy.ATTACK_CRITICAL_SUCCESS.attack(player , target);
		}else if(diceResult <= attackRate) {
			AttackChoiceStrategy.ATTACK_SUCCESS.attack(player , target);
		}else if(diceResult < 10) {
			AttackChoiceStrategy.ATTACK_FAILURE.attack(player , target);
		}else {
			AttackChoiceStrategy.ATTACK_CRITICAL_FAILURE.attack(player , target);
		}
	}


}