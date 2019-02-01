package shape_display;

public class Circle extends Shape {
	
	
	public Circle(int z, int x_loc, int y_loc) {
		this.order=z;//shape order	
		this.x_location = x_loc;
		this.y_location = y_loc;// shape location
	}
	
	public void display() {
		Display displayer = new Display(this,order,x_location,y_location); 
											//in the class display,
	}										// The first parameter 1
}											//represents a circle 
