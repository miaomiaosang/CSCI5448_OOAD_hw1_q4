package shape_display;

public class Display {
	
	public Display(Shape shape, int z, int x, int y) {
							//x,y represents location
		if(shape instanceof Circle)
			System.out.format("Circle displayed, z index = %d, location x:%d, y:%d\n",z,x,y);
		else if(shape instanceof Square)
			System.out.format("Square displayed, z index = %d, location x:%d, y:%d\n",z,x,y);
		else if(shape instanceof Triangle)
			System.out.format("Triangle displayed, z index = %d, location x:%d, y:%d\n",z,x,y);

	}

}
