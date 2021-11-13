package pokemons;

import moves.*;

public class Duosion extends Solosis {
    public Duosion(String name, int level) {
        super(name, level);
        setStats(65, 40, 50, 125, 60, 30);
        addMove(new ShadowPunch());
    }
}
