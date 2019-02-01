/*
* A hand-wavy "database" of information
* Actually returns some arbitrary data
* */
public class Database {
    Database(){
        System.out.println("Creating database!");
    }

    public Shape[] getObjects(){
        Shape arr[] = {new Triangle(), new Circle(), new Triangle(), new Square(), new Circle(), new Triangle()};
        return arr;
    }


}
