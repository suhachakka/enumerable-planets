package data;

import java.math.BigInteger;

public enum Planets {
    MERCURY("Mercury", 88,5.427),
    VENUS("Venus", 225,5.243),
    EARTH("Earth", 365,5.513),
    MARS("Mars", 687,3.93),
    JUPITER("Jupiter", 4333,1.33),
    SATURN("Saturn", 10759,0.687),
    URANUS("Uranus", 30687,1.27),
    NEPTUNE("Neptune", 602800,1.64),
    PLUTO("Pluto", 90530,1.88);

    private final String displayName;
    private final long yearLength;
    //bonus
    private final double density;

    Planets(String displayName, long yearLength,  double density){
        this.displayName=displayName;
        this.yearLength=yearLength;
        this.density=density;
    }

    public String getDisplayName() {
        return displayName;
    }

    public long getYearLength() {
        return yearLength;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "displayName='" + displayName + '\'' +
                ", yearLength=" + yearLength +
                ", density=" + density +
                '}';
    }
}
