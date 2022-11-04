package dices;

public class Attempt {
	private int result;
	
	public Attempt() {
		this.result = Dice.roll10();
	}
	
	public static void main(String[] args) {
		Attempt att = new Attempt();
		att.perform(Strategy.attemptAttack(5));
		att.perform(Strategy.ATTACK_FAILURE);
	}
	
	private void perform(Strategy strat) {
		strat.execute();
	}
	
	public static Strategy attemptAttack(int attackRate) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			return Strategy.ATTACK_CRITICAL_SUCCESS;
		}else if(diceResult <= attackRate) {
			return "attackSuccess";
		}else if(diceResult < 10) {
			return "attackFailure";
		}else {
			return "attackCriticalFailure";
		}
	}
}
//classe game qui gère les lancers de dés et les succès
//changer nom enum strat