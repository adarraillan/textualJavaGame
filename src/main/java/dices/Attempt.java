package dices;

import attack.AttackCriticalSuccess;
import characters.InterfaceCharacters;

public class Attempt {


	private final int attackRate;
	private final InterfaceCharacters target;

	public Attempt(int attackRate, InterfaceCharacters target){
		this.attackRate = attackRate;
		this.target = target;
	}


	public static Strategy attemptAttack(int attackRate, InterfaceCharacters player, InterfaceCharacters target) {
		System.out.println("Je suis dans Attempt.attemptAttack()");
		int diceResult = Dice.roll10();
		if (diceResult==1) {	
			System.out.println("attaque critique!");
			return Strategy.ATTACK_CRITICAL_SUCCESS.attack(player , target);
		}else if(diceResult <= attackRate) {
			System.out.println("attaque réussie!");
			return Strategy.ATTACK_SUCCESS.attack(player , target);
		}else if(diceResult < 10) {
			System.out.println("attaque ratée!");
			return Strategy.ATTACK_FAILURE.attack(player , target);
		}else {
			System.out.println("attaque critique ratée!");
			return Strategy.ATTACK_CRITICAL_FAILURE.attack(player , target);
		}
	}


}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat