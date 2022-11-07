import characters.*;

public class Main {

	public static void main(String[] args) {
		Warrior link = new Warrior.Builder().attackRate(5).defenseRate(5)
											.lifePoints(10).maxLifePoints(10)
											.name("Link").build();
		

		Warrior ganon = new Warrior.Builder().attackRate(7).defenseRate(3)
											 .lifePoints(15).maxLifePoints(15)
											 .name("Ganon").build();

		//InterfaceCharacters link = Player.selectCharacter();
		InterfaceCharacters skeske = new SkeletonArcher.Builder().attackRate(5).defenseRate(5)
											.lifePoints(10).speedPoints(1).dialogue().build();
		InterfaceCharacters zombhitler = new ZombieNazi.Builder().attackRate(5).defenseRate(5)
											.lifePoints(10).speedPoints(1).dialogue().build();

		//Player.battle(link, skeske, zombhitler);

		while ((ganon.getLifePoints() > 0) && (link.getLifePoints() > 0)) {
			System.out.println("Link attacks ganon");
			link.attackAttempt(link.getAttackRate(), ganon);
			System.out.println("### Il reste " + ganon.toStringHP()+ " HP à ganon ###");
			System.out.println("ganon attacks Link");
			skeske.attackAttempt(ganon.getAttackRate(), link);
			System.out.println("### Il reste " + link.toStringHP()+ " HP à Link ###");
		}


		if (link.getLifePoints() <= 0) {
			System.out.println("Link est décédé ("+link.toStringHP()+"), et il reste " + skeske.toStringHP() + " HP à skeske");
		}
		if (skeske.getLifePoints() <= 0) {
			System.out.println("skeske est décédé ("+skeske.toStringHP()+"), et il reste " + link.toStringHP() + " HP à Link");
		}
		
		
		/*SkeletonArcher skel = new SkeletonArcher.Builder().attackRate(1).defenseRate(0).speedPoints(0).lifePoints(0).dialogue().build();
		System.out.println(skel.getdialogue());

		GameLogic.printHeading("Test toto tata titi tutu");
		GameLogic.stopGameUntilInput();
		GameLogic.clearConsole();
		int input = GameLogic.readInputInt("Enter 1, 2 or 3 : ", 3);
		System.out.println("You have chosen number " + input);*/
		
	}

}
