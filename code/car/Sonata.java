
import java.util.*;

/**
 * CASE: Computer Aided Software Engineering
 */
public class Sonata {

    /**
     * Default constructor
     */
    public Sonata() {
	this.speed=0;
    }

    /**
     * 
     */
    private int speed;

    /**
     * 
     */
    public void start() {
        // TODO implement here
	return this.speed
    }

    /**
     * 
     */
    public int getSpeed() {
        // TODO implement here
	return this.speed;
    }

    /**
     * 
     */
    public void accelerate() {
        // TODO implement here
	this.speed = this.speed +30;
    }

    /**
     * 
     */
    public void stop() {
        // TODO implement here
	this.speed = 0;
    }

}