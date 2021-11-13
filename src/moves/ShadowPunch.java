package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove {
    public ShadowPunch() {
        super(Type.GHOST, 60, 100);
    }

    protected String describe() {
        return "использует Shadow Punch";
    }
}
