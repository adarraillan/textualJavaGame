package dices;

import defense.*;
import characters.InterfaceCharacters;

public enum DefenseChoiceStrategy {

    DEFENSE_SUCCESS(new DefenseSuccess()),
    DEFENSE_CRITICAL_SUCCESS(new DefenseCriticalSuccess()),
    DEFENSE_FAILURE(new DefenseFailure()),
    DEFENSE_CRITICAL_FAILURE(new DefenseCriticalFailure());

    private Defense defenseType;

    private DefenseChoiceStrategy(Defense defense) {
        this.defenseType = defense;
    }

    public void defense(InterfaceCharacters player, int damageTaken) {

        defenseType.defense(player, damageTaken);

    }
}
