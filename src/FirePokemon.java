import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {

    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }

    List attacks;
    List<String> getAttacks() {
        return attacks;
    }
}
