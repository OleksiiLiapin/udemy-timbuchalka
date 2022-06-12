package timbuchalka.demy.appartment;

public class Room {
    private String name;
    private double height;
    private double width;
    private double length;
    private TheWindow theWindow;

    public Room(String name, double height, double width, double length, TheWindow theWindow) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
        this.theWindow = theWindow;
    }

    public double getArea (){
        return height*width;
    }
}
