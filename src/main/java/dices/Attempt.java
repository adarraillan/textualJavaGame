package dices;

public class Attempt {
	private int result;
	
	public Attempt() {
		this.result = Dice.roll10();
	}
	
	public static void main(String[] args) {
		Attempt att = new Attempt();
		att.perform(Strategy.ATTACK_SUCCESS);
		att.perform(Strategy.ATTACK_FAILURE);
	}
	
	private void perform(Strategy strat) {
		strat.execute();
	}
	
	/**public static String attemptAttack(int attackRate) {
		int diceResult = Dice.roll10();
		if (diceResult==1) {
			return "attackCriticalSuccess";
		}else if(diceResult <= attackRate) {
			return "attackSuccess";
		}else if(diceResult < 10) {
			return "attackFailure";
		}else {
			return "attackCriticalFailure";
		}
	}*/
}
