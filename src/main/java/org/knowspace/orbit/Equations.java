package org.knowspace.orbit;

public class Equations {
    
    public static double getCircularVelocity(double mu, double radius){
        /*
         * mu: gravitational parameter (km^3/s^2)
         * radius: distance from center of body (km)
         * returns: circular velocity (km/s)
         */
        return Math.sqrt(mu/radius);
    }

    public static double getPeriod(double sma, double velocity){
        /*
         * sma: semi-major axis (km)
         * velocity: velocity of orbiting body (km/s)
         * returns: period of orbit (seconds)
         */
        return 2*Math.PI*sma/velocity;
    }

    public static double getVelocity(double mu, double sma, double radius){
        /*
         * mu: gravitational parameter (km^3/s^2)
         * sma: semi-major axis (km)
         * radius: distance from center of body (km)
         * returns: velocity of orbiting body (km/s)
         */
        return Math.sqrt(mu*(2/radius - 1/sma)); // km/s
    }

}
