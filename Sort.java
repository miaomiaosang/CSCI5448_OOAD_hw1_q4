package shape_display;

import java.util.List;

public class Sort {
	public void sort(List<Shape> shapeList) {
		shapeList.sort(new ShapeComparator()); //sort the shape using java comparator
	}
}


