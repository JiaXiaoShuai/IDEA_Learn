package test_generic;

public class Rectangle implements Comparable<Rectangle>{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" +area()+
                ", perimeter="+perimeter()+
                '}';
    }

    public double area(){
        return width*length;
    }

    public double perimeter(){
        return 2*(width+length);
    }

    @Override
    public int compareTo(Rectangle o) {
        int result = Double.compare(this.perimeter(),o.perimeter());
        return result == 0 ? Double.compare(this.area(),o.area()) : result;
    }
}
