public abstract class Compass {

//    public double north = 0.5;
//    public double east = 1.5;
//    public double south = 1.5;
//    public double west = 0.5;

    public abstract double getNorth();
    public abstract double getEast();
    public abstract double getSouth();
    public abstract double getWest();

    public abstract void setNorth();
    public abstract void setEast();
    public abstract void setSouth();
    public abstract void setWest();

    public enum compassEnum {

        north,
        east,
        south,
        west
    }
}
