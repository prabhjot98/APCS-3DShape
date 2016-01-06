//package Project3D;
public interface ShapeMain{
	public class Shape {
		private static String ShapeName;
		public static String getShapeName(){
			return ShapeName;
		}
		public static int getVolume(){
			return 0;
		}
		public static int getSurfaceArea(){
			return 0;
		}
	}
	public class Cube extends Shape{
		private static int X;
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
		public static int getVolume(){
			return x*y*z;
		}
		public static int getSurfaceArea(){
			return 2*(x*y+y*z+x*z);
		}
	}
	public class Sphere extends Shape{
		private static int r;
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
		public static int getVolume(){
			return length*width*height/2;
		}
		public static int getSurfaceArea(){
			return 2*length*width+(2*(length+width)*height);
		}
	}
}
