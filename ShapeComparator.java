package shape_display;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    public int compare(Shape a, Shape b) {
        if(a.order > b.order) {
            return 1;
        }
        else if (a.order < b.order){
            return -1;
        }
        else {
            return 0;
        }
    }
}
