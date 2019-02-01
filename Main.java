package shape_display;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Shape> shapeList = new ArrayList<>();
		
		Shape circle1 = new Circle(3,4,5);
        shapeList.add(circle1);
        
        Shape square = new Square(1,10,-4);
        shapeList.add(square);
        
        Shape circle2 = new Circle(10,6,3);
        shapeList.add(circle2);
        
        Shape triangle = new Triangle(5,-7,3);
        shapeList.add(triangle);
        
        Shape square2 = new Square(7,15,1);
        shapeList.add(square2);
        
        System.out.format("The shape database has %d shapes.\n",shapeList.size());
        // output how many shapes are there in the database
        
        Sort sort = new Sort();
        sort.sort(shapeList); //sort the shape according to the assigned order
        
        for(int i = 0; i<shapeList.size();i++) {
        	shapeList.get(i).display();
        }
	}

}
