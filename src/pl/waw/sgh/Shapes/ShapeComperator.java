/*
package pl.waw.sgh.Shapes;
import java.util.Comparator;

public class ShapeComperator implements Comparator <Shape> {

    @Override
    public int compare (Shape o1, Shape o2){
       Double sumParso1 = Double.valueOf(o1.parA+o1.parB) ;
        Double sumParso2 = Double.valueOf(o2.parA+o2.parB) ;

        return sumParso1.compareTo(sumParso2);
    }


}
*/

package pl.waw.sgh.Shapes;

import java.util.Comparator;

public class ShapeComperator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        Double sumPars1 = Double.valueOf(shape1.parA+shape1.parB);
        Double sumPars2 = Double.valueOf(shape2.parA+shape2.parB);
        return sumPars1.compareTo(sumPars2);
    }
}
