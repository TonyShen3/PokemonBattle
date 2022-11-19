import java.util.HashMap;

public abstract class Pokemon {
    public String type;
    public int HP;
    public int attack;
    public int defense;
    public int speed;
    public void generatePokemon() {

    }
    public int generateStat(int min, int max) {
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }
}
