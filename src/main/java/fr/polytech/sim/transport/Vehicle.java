package fr.polytech.sim.transport;

import fr.polytech.sim.log.ConsoleLogger;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.log.LoggerFactory;

import java.util.*;

/**
 * Vehicle abstraction.
 */
public abstract class Vehicle implements MobileObject {

    private final Logger logger = LoggerFactory.getLogger(LoggerFactory.LoggerType.CONSOLE, "Vehicle");
    protected final List<MobileObject> components = new ArrayList<>();

    /**
     * Force applied to push the vehicle.
     *
     * @return  push force.
     */
    public abstract double getPush();

    /**
     * Calculate and return vehicle's velocity based on individual velocities of
     * its components.
     *
     * @return vehicle speed
     */
    @Override
    public double getVelocity() {
        double sumPonderedVelocities = 0;
        double sumMass = 0;
        for (MobileObject item : components) {
            sumPonderedVelocities += item.getVelocity() * item.getMass();
            sumMass += item.getMass();
        }
        double velocity = sumMass == 0 ? 0 : sumPonderedVelocities / sumMass;
        this.logger.log("Velocity %.2f Km/h.", velocity);
        return velocity;
    }

    /**
     * Calculate and return vehicle's mass as the sum of individual masses of
     * its components.
     *
     * @return vehicle mass
     */
    @Override
    public double getMass() {
        return this.components.stream()
                .mapToDouble(MobileObject::getMass)
                .sum();
    }
}
