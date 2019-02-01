/*
The parent class for instantiating all of the class objects
You can never have "a shape", but it is used to give a structure
to the squares, circles, and triangles.
 */
public abstract class Shape{
    protected String shapeString;
    private final int numSides;
    private final String shapeName;

    Shape(String shapeName, int numSides){
        this.shapeName = shapeName;
        this.numSides = numSides;
        System.out.println("You made a " + shapeName + " object!");
    }

    public void printShape(){
        System.out.println("Printing a " + shapeName + " object:");
        System.out.println(this.shapeString);
    }

    public int getSides(){
        return numSides;
    }
}