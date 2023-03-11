import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    List<String> attacks = Arrays.asList(/*voer de aanvallen hier in*/);

    //WaterPokemon Attacks
    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
