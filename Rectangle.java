import java.util.Scanner;
public class Rectangle extends Shape{

	private double width = 0;
	private double height = 0;

	public Rectangle(){
		super("Rectangle");
	}
	public Rectangle(double width, double height){
		super("Rectangle");
		this.width = width;
		this.height = height;
	}

	//Methods
	public double computeArea(){
		return height * width;
	}
	
	public double computePerimeter(){
		return 2*height + 2*width;
	}
	public void readShapeData(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle");
		width = in.nextDouble();
		System.out.println("Enter the height of the rectangle");
		height = in.nextDouble();
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public String toString(){
		return super.toString() + ": width is " + width + ", height is " + height;
	}
}
