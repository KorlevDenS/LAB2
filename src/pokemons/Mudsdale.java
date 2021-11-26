package pokemons;

import moves.*;

public class Mudsdale extends Mudbray {
    public Mudsdale(String name, int level) {
        super(name, level);
        setStats(100, 125, 100, 55, 85, 35);
        addMove(new RockSlide());
    }
}
