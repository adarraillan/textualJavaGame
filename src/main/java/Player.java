import java.util.Scanner;
import characters.*;

public class Player {
    //method to select a character with user input
    public static InterfaceCharacters selectCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your character :");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return new Warrior.Builder().attackRate(7).defenseRate(5).lifePoints(20).maxLifePoints(20).damage(6).name("Warrior").build();
            case 2:
                return new Wizard.Builder().attackRate(5).defenseRate(4).lifePoints(15).maxLifePoints(15).damage(8).name("Wizard").build();
            default:
                System.out.println("Wrong choicechar selection");
                return selectCharacter();
        }
    }

    //method to select a target with user input
    public static void selectTarget(InterfaceCharacters hero, InterfaceCharacters target1, InterfaceCharacters target2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your target :");
        System.out.println("1. " + target1.getClass().getSimpleName());
        System.out.println("2. " + target2.getClass().getSimpleName());
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                hero.attackAttempt(hero.getAttackRate(), target1);
            case 2:
                hero.attackAttempt(hero.getAttackRate(), target2);
            default:
                System.out.println("Wrong choice of target");
                selectTarget(hero, target1, target2);
        }
    }

    //method to select an action with user input
    public static int selectAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your action :");
        System.out.println("1. Attack");
        System.out.println("2. Heal");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                System.out.println("Wrong choice of selection");
                return selectAction();
        }
    }

    //method for battle loop
    public static void battle(InterfaceCharacters hero, InterfaceCharacters target1, InterfaceCharacters target2) {
        while ((hero.getLifePoints() > 0) && (target1.getLifePoints() > 0) && (target2.getLifePoints() > 0)) {
            int action = 0;
            action = selectAction();
            if (action == 1) {
                selectTarget(hero, target1, target2);
            } else {
                hero.setLifePoints(hero.getLifePoints() + 10);
            }
            //print life points of hero, skeleton and zombie
            System.out.println(hero.getClass().getSimpleName() + " : " + hero.getLifePoints());
            System.out.println(target1.getClass().getSimpleName() + " : " + target1.getLifePoints());
            System.out.println(target2.getClass().getSimpleName() + " : " + target2.getLifePoints());

        }
    }
}
