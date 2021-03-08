package data;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 602800),
    PLUTO("Pluto", 90000);

    private final String displayName;
    private final long yearLength;

    Planets(String displayName, long yearLength){
        this.displayName=displayName;
        this.yearLength = yearLength;
    }

    public String getDisplayName() {
        return displayName;
    }

    public long getYearLength() {
        return yearLength;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "displayName='" + displayName + '\'' +
                ", yearLength=" + yearLength +
                '}';
    }
}
