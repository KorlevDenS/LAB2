package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Mudbray extends Pokemon {
    public Mudbray(String name, int level) {
        super(name, level);
        setStats(70, 100, 70, 45, 55, 45);
        setType(Type.GROUND);
        setMove(new Confide(), new Rest(), new AerialAce());
    }
}
