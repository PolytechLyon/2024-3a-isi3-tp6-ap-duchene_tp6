package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {
    private static Clock instance = null;
    private final int time;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private Clock() {
        // Initialize time with a random integer between 0 and 24 inclusive.
        this.time = new Random().nextInt(25);
    }

    /**
     * Returns the single instance of Clock.
     */
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    /**
     *
     * Returns the current time.
     */
    public int getTime() {
        return this.time;
    }
}
