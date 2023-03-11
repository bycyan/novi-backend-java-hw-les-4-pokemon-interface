import java.util.List;
import java.util.Objects;

public class PokemonGymOwner {
    String name;
    String town;

    List pokemons;

    public PokemonGymOwner (String name, String town, List pokemons){
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }
    public String getTown() {
        return town;
    }

    public String getName(){
        return name;
    }

    public List getPokemons() {
        return pokemons;
    }
}
