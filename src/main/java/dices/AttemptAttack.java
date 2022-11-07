package dices;

import characters.InterfaceCharacters;

public class AttemptAttack {


	private final int attackRate;
	private final InterfaceCharacters target;

	public AttemptAttack(int attackRate, InterfaceCharacters target){
		this.attackRate = attackRate;
		this.target = target;
	}



	public static AttackChoiceStrategy attemptAttack(int attackRate, InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans Attempt.attemptAttack()");
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			System.out.println("attaque critique!");
			return AttackChoiceStrategy.ATTACK_CRITICAL_SUCCESS.attack(player , target);
		}else if(diceResult <= attackRate) {
			System.out.println("attaque réussie!");
			return AttackChoiceStrategy.ATTACK_SUCCESS.attack(player , target);
		}else if(diceResult < 10) {
			System.out.println("attaque ratée!");
			return AttackChoiceStrategy.ATTACK_FAILURE.attack(player , target);
		}else {
			System.out.println("attaque critique ratée!");
			return AttackChoiceStrategy.ATTACK_CRITICAL_FAILURE.attack(player , target);
		}
	}

}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat