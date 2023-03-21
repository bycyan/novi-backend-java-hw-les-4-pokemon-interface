import java.util.ArrayList;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private final String town;
    public PokemonGymOwner(String name, String town) {
        super(name);
        this.town = town;
    }

    public String getTown() {
        return town;
    }
}
