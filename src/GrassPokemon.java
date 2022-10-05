import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
// Variabelen
    private static final String type = "Grass";
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

// Constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

// Methodes
public void attackFactor(Pokemon name, Pokemon enemy, int attackHp, String attackName) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attackName + ".");
    int factor = switch (enemy.getType()) {
        case "Grass" -> 1;
        case "Water" -> 2;
        case "Fire" -> 3;
        case "Electric" -> 4;
        default -> 0;
    };
    int minHp = attackHp * factor;
    if (attackName == "Leechseed") {
        System.out.println(enemy.getName() + " loses " + minHp + " hp and " + name.getName() + " gained it.");
        enemy.setHp(enemy.getHp() - minHp);
        name.setHp(enemy.getHp() + minHp);
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left and " + name.getName() + " " + name.getHp() + "hp.");
    } else {
        System.out.println(enemy.getName() + " loses " + minHp + " hp.");
        enemy.setHp(enemy.getHp() - minHp);
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + "hp left.");
    }
}

    public void leafStorm(Pokemon name, Pokemon enemy) {
        int attackHp = 3;
        String attackName = "Leafstorm";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        int attackHp = 10;
        String attackName = "Solarbeam";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        int attackHp = 4;
        String attackName = "Leechseed";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        int attackHp = 7;
        String attackName = "Leaveblade";
        attackFactor(name, enemy, attackHp, attackName);
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
