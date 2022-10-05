import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
// Variabelen
    private static final String type = "Fire";
    List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

// Constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

// Methodes
public void attackFactor(Pokemon name, Pokemon enemy, int attackHp, String attackName) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attackName + ".");
    int factor = switch (enemy.getType()) {
        case "Fire" -> 1;
        case "Electric" -> 2;
        case "Water" -> 3;
        case "Grass" -> 4;
        default -> 0;
    };
    int minHp = attackHp * factor;
    System.out.println(enemy.getName() + " loses " + minHp + " hp.");
    enemy.setHp(enemy.getHp() - minHp);
    System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
}

    void fireLash(Pokemon name, Pokemon enemy) {
        int attackHp = 3;
        String attackName = "Firelash";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        int attackHp = 6;
        String attackName = "Flamethrower";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        int attackHp = 4;
        String attackName = "Pyroball";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        int attackHp = 10;
        String attackName = "Inferno";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
