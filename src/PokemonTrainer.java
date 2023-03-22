import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private final String name;
    private final FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private final WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private final GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private final GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private final ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private final WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");
    private List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }



}
