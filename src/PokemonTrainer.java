import java.util.List;

public abstract class PokemonTrainer{

    String name;
    List<Pokemon> pokemons;

    public PokemonTrainer (String name, List<Pokemon>pokemons){
        this.name = name;
        this.pokemons = pokemons;
    }

    protected List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName(){
        return name;
    }
}
