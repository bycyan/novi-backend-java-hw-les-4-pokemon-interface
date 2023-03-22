import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    //WaterPokemon Attacks
    public void surf(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks with " + attacks.get(0) +" on "+ enemy.getName());
            switch (enemy.getType()){
                case "fire" -> {
                    System.out.println(enemy.getName() + "loses 40 hp");
                    enemy.setHp(enemy.getHp() -40);
                }
                case "electric" -> {
                    System.out.println(enemy.getName() + "loses 30 hp");
                    enemy.setHp(enemy.getHp() -30);
                }
                case "grass" -> {
                    System.out.println(enemy.getName() + "loses 20 hp");
                    enemy.setHp(enemy.getHp() -20);
                }
                case "water" -> {
                    System.out.println(enemy.getName() + "loses 10 hp");
                    enemy.setHp(enemy.getHp() -10);
                }
            }
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(1) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(2) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }
    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks with " + attacks.get(3) +" on "+ enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "electric" -> {
                System.out.println("has no effect on " + enemy.getName());
                enemy.setHp(enemy.getHp() -30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + "gaines 20 hp");
                enemy.setHp(enemy.getHp() +20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left!");
    }

    public List<String> getAttacks(){
        return attacks;
    }
}
