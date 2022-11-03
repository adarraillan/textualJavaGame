package dices;
import characters.*;

public enum Strategy {
	
	
	ATTACK_SUCCESS{
		@Override
		void execute() {
			System.out.println("couciu");
			//attackSuccess(target);
		}
	},
	
	ATTACK_CRITICAL_SUCCESS{
		@Override
		void execute() {
			//attackCriticalSuccess();
		}
	},
	
	ATTACK_FAILURE{
		@Override
		void execute() {
			System.out.println("Attack failure");
			//attackFailure();
		}
	},
	
	ATTACK_CRITICAL_FAILURE{
		@Override
		void execute() {
			//attackCriticalFailure();
		}
	};
	
	public int getAttackRate() {
		return this.attackRate;
	}
	
	abstract void execute();
}
