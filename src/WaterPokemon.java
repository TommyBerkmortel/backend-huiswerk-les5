import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
// Variabelen
    private static final String type = "Water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

// Constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

// Methodes
public void attackFactor(Pokemon name, Pokemon enemy, int attackHp, String attackName) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attackName + ".");
    int factor = switch (enemy.getType()) {
        case "Water" -> 1;
        case "Grass" -> 2;
        case "Electric" -> 3;
        case "Fire" -> 4;
        default -> 0;
    };
    int minHp = attackHp * factor;
    System.out.println(enemy.getName() + " loses " + minHp + " hp.");
    enemy.setHp(enemy.getHp() - minHp);
    System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
}

    void surf(Pokemon name, Pokemon enemy) {
        int attackHp = 3;
        String attackName = "Surf";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        int attackHp = 8;
        String attackName = "Hydropump";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        int attackHp = 10;
        String attackName = "Hydrocanon";
        attackFactor(name, enemy, attackHp, attackName);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        int attackHp = 4;
        String attackName = "Raindance";
        if (enemy.getType() == "Electric") {
            System.out.println("has no effect on " + enemy.getName());
        } else if (enemy.getType() == "Grass") {
            System.out.println(attackName + " gives a hp boost of 20 to grass pokemons!");
            enemy.setHp(enemy.getHp() + 20);
            System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
        } else {
            attackFactor(name, enemy, attackHp, attackName);
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
