package shape_display;

public class Square extends Shape {
	
	public Square(int z, int x_loc, int y_loc) {
		this.order=z;	//shape order
		this.x_location = x_loc;
		this.y_location = y_loc;// shape location
	}
	
	public void display() {
		Display displayer = new Display(2,order,x_location,y_location); //in the class display,
	}										// The first parameter 2
}											//represents a square 
