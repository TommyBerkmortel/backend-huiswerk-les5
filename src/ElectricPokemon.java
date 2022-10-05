import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
// Variabelen
    private static final String type = "Electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

// Constructor
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


// Methodes
public void attackFactor(Pokemon name, Pokemon enemy, int attackHp, String attackName) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attackName + ".");
    int factor = switch (enemy.getType()) {
        case "Electric" -> 1;
        case "Fire" -> 2;
        case "Grass" -> 3;
        case "Water" -> 4;
        default -> 0;
    };
    int minHp = attackHp * factor;
    System.out.println(enemy.getName() + " loses " + minHp + " hp.");
    enemy.setHp(enemy.getHp() - minHp);
    System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
}

public void attackExtra(Pokemon enemy, String attackName) {
    System.out.println(attackName + " gives a hp boost of 25 to electric pokemons!");
    enemy.setHp(enemy.getHp() + 25);
    System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
}

    void thunderPunch(Pokemon name, Pokemon enemy) {
        int attackHp = 3;
        String attackName = "Thunderpunch";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        int attackHp = 5;
        String attackName = "Electroball";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        int attackHp = 10;
        String attackName = "Thunder";
        if (enemy.getType() == "Electric") {
            attackExtra(enemy, attackName);
        } else {
            attackFactor(name, enemy, attackHp, attackName);
        }
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        int attackHp = 4;
        String attackName = "Volttackle";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
