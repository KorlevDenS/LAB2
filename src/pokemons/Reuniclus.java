package pokemons;

import moves.*;

public class Reuniclus extends Duosion {
    public Reuniclus(String name, int level) {
        super(name, level);
        setStats(110, 65, 75, 125, 85, 30);
        addMove(new Liquidation());
    }
}
