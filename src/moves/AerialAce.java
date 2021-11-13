package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 100);
    }

    protected String describe() {
        return "использует Aerial Ace";
    }
}
