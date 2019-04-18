package pl.waw.sgh.Shapes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOfShapes {

    public static void main(String[] args) {
        Set<Shape> mySetShapes = new HashSet<>();
        mySetShapes.add(new Cricle(6));
        mySetShapes.add(new Rectangle(3,5));
        mySetShapes.add(new Cricle(9));

        //mySetShapes.
        for (Shape sh : mySetShapes) {
            System.out.println(sh + " surf: " + sh.calcSurface());
        }
        System.out.println();
        Set<Shape> myTreeSet = new TreeSet<>(new ShapeComperator());
        myTreeSet.add(new Rectangle(4,4));
        myTreeSet.addAll(mySetShapes);
        for (Shape sh : myTreeSet) {
            System.out.println(sh + " surf: " + sh.calcSurface());
        }


    }
}