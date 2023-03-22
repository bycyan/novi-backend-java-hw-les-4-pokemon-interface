import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(0) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(1) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(2) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "electric", "fire", "water", "grass" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
                System.out.println(name.getName() + "gaines 40 hp");
                name.setHp(name.getHp() +40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(3) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "electric" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public List<String> getAttacks() {
        return attacks;
    }

}
