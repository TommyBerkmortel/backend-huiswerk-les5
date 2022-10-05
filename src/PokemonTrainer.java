import java.util.List;

public class PokemonTrainer {
    ElectricPokemon raichu = new ElectricPokemon("Raichu", 2, 80, "thunders", "BOOOM");
    GrassPokemon venusaur = new GrassPokemon("Venusaur", 8, 88, "seeds", "grumble");
    GrassPokemon ditto = new GrassPokemon("Ditto", 3, 56, "trees", "sssssssh");
    FirePokemon charizard = new FirePokemon("Charizard", 5, 50, "lava", "rommeldebommel");
    WaterPokemon blastoise = new WaterPokemon("Blastoise", 3, 75, "hurricanes", "whoosh");
    WaterPokemon gyarados = new WaterPokemon("Gyarados", 5, 60, "cyclons", "what?");

    List<Pokemon> pokemons;

    private String name;

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }
}
