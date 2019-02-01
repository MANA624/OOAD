import java.util.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Instantiate a "database" object. Then return shapes
        Database database = new Database();
        Shape shapeArr[] = database.getObjects();

        // Sort our shapes, then go through and have each shape print itself out
        shapeArr = sortShapes(shapeArr);
        for(Shape shape : shapeArr) {
            shape.printShape();
        }
    }

    // This is a method that takes in an array of shapes and sorts it based
    // on the number of sides that the shape has.
    private static Shape[] sortShapes(Shape[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j].getSides() > arr[j+1].getSides()){
                    Shape temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

