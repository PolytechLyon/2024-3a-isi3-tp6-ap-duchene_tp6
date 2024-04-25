package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.MobileObject;
import fr.polytech.sim.transport.Vehicle;

public class TagAlongBike extends Bike {

    public TagAlongBike() {
        this(new SimpleBike());
    }

    public TagAlongBike(SimpleBike simpleBike) {
        super.components.add(simpleBike);
    }
}
