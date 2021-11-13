package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class JangmoO extends Pokemon {
    public JangmoO(String name, int level) {
        super(name, level);
        setStats(45, 55, 65, 45, 45, 45);
        setType(Type.DRAGON);
        setMove(new DoubleTeam(), new FireBlast(), new EnergyBall(), new Confusion());
    }
}
