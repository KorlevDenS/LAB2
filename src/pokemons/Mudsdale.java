package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Mudsdale extends Mudbray {
    public Mudsdale(String name, int level) {
        super(name, level);
        setStats(100, 125, 100, 55, 85, 35);
        setType(Type.GROUND);
        addMove(new RockSlide());
    }
}
