import java.awt.Rectangle;

class RectangleTester extends Rectangle{

	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(15, 10);
		
		System.out.println("Width = " + rectangle.width + ", Height = " + rectangle.height);
		print(false, rectangle);
		print(true, rectangle);
	}
	
	public static int getPerimeter(Rectangle rectangle){
		return rectangle.width*2 + rectangle.height*2;
	}
	
	public static int getArea(Rectangle rectangle){
		return rectangle.width * rectangle.height;
	}
	
	public static void print(boolean b, Rectangle rectangle){
		if(b == false)
			System.out.println("Perimeter = " + getPerimeter(rectangle));
		else
			System.out.println("Area = " + getArea(rectangle));
	}
}
