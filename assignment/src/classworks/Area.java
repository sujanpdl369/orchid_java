package classworks;

public class Area {
//	Function overloading
	static double area(double r) {
		return (22/7)*r*r;
	}
	static int area(int len) {
		return len*len;
	}
	static double area(double len, double bred) {
		return 0.5*len*bred;
	}
	public static void main(String [] args) {
		double triangle_len = 22.5, triangle_bred =35.0;
		double radius = 22.1;
		int length = 51;
		double area_triangle = Area.area(triangle_len, triangle_bred);
		int area_square = Area.area(length);
		double area_circle = Area.area(radius);
		System.out.println("Area Triangle:"+area_triangle+"\nArea Square: "+area_square+"\nArea Circle: "+area_circle);
	}

}
