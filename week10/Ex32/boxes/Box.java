package week10.Ex32.boxes;

import java.util.Collection;
import week9.Ex18.moving.domain.Thing;

public abstract class Box {

    public abstract void add(Thing thing);

    public void add(Collection<Thing> things) {
        for (Thing thing : things) {
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}