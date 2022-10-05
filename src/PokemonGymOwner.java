import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

    private String village;

    public PokemonGymOwner(String name, String village) {
        super(name);
        this.village = village;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

}
