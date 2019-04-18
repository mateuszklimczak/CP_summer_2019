package pl.waw.sgh.Shapes;

import javafx.scene.shape.Circle;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOfShapes {
    public static void main(String[] args) {
        Map<String, Shape> myMapShape = new HashMap<>();
        myMapShape.put("C1", new Cricle(5));
        myMapShape.put("R1", new Rectangle(7, 8));
        myMapShape.put("C2", new Cricle(6));

        Cricle c2 = (Cricle)myMapShape.get("C2");
        System.out.println("c2: " + c2);

        System.out.println();
        for (String k : myMapShape.keySet()){
            System.out.println( k + " is " +myMapShape.get(k));
        }

        Collection Shapes = myMapShape.values();

    }
}


//take any text file with text write a program that count how meny times every word apper in the text like "in"
//hint: use a map it is really simple, replace comma with empty
// hint: turn everything to lowercase by tolower