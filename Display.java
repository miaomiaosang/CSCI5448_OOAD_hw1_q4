package shape_display;

public class Display {
	
	public Display(int shape, int z, int x, int y) {
							//x,y represents location
		switch(shape) {
		case 1:
			System.out.format("Circle displayed, z index = %d, location x:%d, y:%d\n",z,x,y);
			break;
		case 2:
			System.out.format("Square displayed, z index = %d, location x:%d, y:%d\n",z,x,y);
			break;
		case 3:
			System.out.format("Triangle displayed, z index = %d, location x:%d, y:%d\n",z,x,y);
			break;
		default:
				break;
		}
	}

}
