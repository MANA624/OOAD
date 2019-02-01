/*
Just declares what shape it is and how many sides it has,
as well as how to draw itself
 */
public class Triangle extends Shape{
    Triangle(){
        super("triangle", 3);
        this.shapeString = "" +
                "            ^           \n" +
                "           / \\         \n" +
                "          /   \\        \n" +
                "         /     \\       \n" +
                "        /       \\      \n" +
                "       /         \\     \n" +
                "      /           \\    \n" +
                "     /             \\   \n" +
                "    /               \\  \n" +
                "   /                 \\ \n" +
                "  /                   \\\n" +
                "  ---------------------";
    }
}
