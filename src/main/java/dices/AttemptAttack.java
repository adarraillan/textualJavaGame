package dices;

import characters.InterfaceCharacters;

public class AttemptAttack {


	/*private final int attackRate;
	private final InterfaceCharacters target;

	public AttemptAttack(int attackRate, InterfaceCharacters target){
		this.attackRate = attackRate;
		this.target = target;
	}*/

	public  AttackChoiceStrategy selectAttack(int attackRate) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			return AttackChoiceStrategy.ATTACK_CRITICAL_SUCCESS;
		}else if(diceResult <= attackRate) {
			return AttackChoiceStrategy.ATTACK_SUCCESS;
		}else if(diceResult < 10) {
			return  AttackChoiceStrategy.ATTACK_FAILURE;
		}else {
			return AttackChoiceStrategy.ATTACK_CRITICAL_FAILURE;
		}
	}
	/**créer une seconde méthode qui sépare les if else, des appels de la stratégie*/
	public  void attemptAttack(int attackRate, InterfaceCharacters player, InterfaceCharacters target) {
		AttackChoiceStrategy attackType = selectAttack(attackRate);
		attackType.attack(player, target);
	}


}