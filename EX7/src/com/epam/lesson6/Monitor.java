package com.epam.lesson6;

public class Monitor extends Device {
    private int x;
    private int y;

    public Monitor(String serialNumber, String manufacturer, double price, int x, int y) {
        super(serialNumber, manufacturer, price);
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return super.toString() +
                ", x=" + x + ", y=" + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Monitor other = (Monitor) obj;
        return this.x == other.x &&
                this.y == other.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
