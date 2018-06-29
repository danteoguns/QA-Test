public abstract class Direction extends Compass {

    double direction;
    public double north;
    public double east;
    public double south;
    public double west;

    public void setNorth(){
        direction = -0.5;
    }

    public void setSouth(){
        direction = +0.5;
    }

    public void setEast(){
        direction = +1.5;
    }

    public void setWest(){
        direction = -1.5;
    }

    public double getNorth(){
        return north;
    }

    public double getEast(){
        return east;
    }

    public double getSouth(){
        return south;
    }

    public double getWest(){
        return west;
    }
}
