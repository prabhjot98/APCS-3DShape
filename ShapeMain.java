//package Project3D;
public interface ShapeMain{
	public class Shape {
		private static String ShapeName;
		public static void setShapeName(String Name){
			ShapeName=Name;
		}
		public static String getShapeName(){
			return ShapeName;
		}
	}
	public class Cube extends Shape{
		private static int X;
		public Cube(int i){
			X=i;
		}
		public static int getVolume(){
			return X*X*X;
		}
		public static int getSurfaceArea(){
			return 6*X*X;
		}
	}
	public class RectangularPrism extends Shape{
			private static int x;
			private static int y;
			private static int z;
			public RectangularPrism(int i,int j,int k){
				x=i;
				y=j;
				z=k;
			}
		public static int getVolume(){
			return x*y*z;
		}
		public static int getSurfaceArea(){
			return 2*(x*y+y*z+x*z);
		}
	}
	public class Sphere extends Shape{
		private static int r;
		public Sphere(int radius){
			r=radius;
		}

		public static int getVolume(){
			return (int)(r*r*r*Math.PI*4/3);
		}
		public static int getSurfaceArea(){
			return (int)(4*r*r*Math.PI);
		}
	}
	public class TriangularPrism extends Shape{
		public static int length;
		public static int width;
		public static int height;
		public TriangularPrism(int i,int j,int k){
			length = i;
			width = j;
			height = k;
		}
		public static int getVolume(){
			return length*width*height/2;
		}
		public static int getSurfaceArea(){
			return 2*length*width+(2*(length+width)*height);
		}
	}

	public class Cylinder extends Shape {
		public static int radius;
		public static int height;
		public Cylinder(int i, int j){
			radius = i;
			height = j;
		}
		public static int getCircumference() {
			return (int)(radius*2*Math.PI);
		}
		public static int getHeight() {
			return height;
		}
		public static int getRadius() {
			return radius;
		}
		public static int getDiameter() {
			return radius*2;
		}
		public static int getBaseSurfaceArea() {
			return (int)(radius*radius*Math.PI);
		}
		public static int getTotalSurfaceArea() {
			return (int)((2*radius*radius*Math.PI) + (radius*2*Math.PI*height));
		}
		public static int getVolume() {
			return (int)(radius*radius*Math.PI*height);
		}
	}

	public class Cone extends Shape {
		public static int radius;
		public static int height;
		public Cone(int i, int j){
			radius = i;
			height = j;
		}
		public static int getBaseCircumference() {
			return (int)(radius*2*Math.PI);
		}
		public static int getHeight() {
			return height;
		}
		public static int getRadius() {
			return radius;
		}
		public static int getDiameter() {
			return radius*2;
		}
		public static int getBaseSurfaceArea() {
			return (int)(radius*radius*Math.PI);
		}
		public static int getTotalSurfaceArea() {
			return (int)((radius*radius*Math.PI) + (radius*Math.PI*Math.sqrt(height*height + radius*radius)));
		}
		public static int getVolume() {
			return (int)(radius*radius*Math.PI*height/3);
		}
	}
}
