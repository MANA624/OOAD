/*
Just declares what shape it is and how many sides it has,
as well as how to draw itself. Note that the number of
sides is just an approximation, since there is no infinity
in Java programming :p
 */
public class Circle extends Shape{
    Circle(){
        super("circle", 99999);
        this.shapeString =
                "        . -- ~~~ -- .\n" +
                "    .-~               ~-.\n" +
                "   /                     \\\n" +
                "  /                       \\\n" +
                " |                         |\n" +
                " |                         |\n" +
                " |                         |\n" +
                "  \\                       /\n" +
                "   \\                     /\n" +
                "    `-.               .-'\n" +
                "        ~- . ___ . -~\n";
    }
}