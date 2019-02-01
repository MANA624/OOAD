/*
Just declares what shape it is and how many sides it has,
as well as how to draw itself
 */
public class Square extends Shape{
    Square(){
        super("square", 4);
        this.shapeString = "" +
                " _____________________   \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                " |                    |  \n" +
                "  --------------------     ";
    }
}