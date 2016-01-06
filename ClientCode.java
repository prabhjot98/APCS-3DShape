//package Project3D;

import Project3D.ShapeMain.*;

public class ClientCode {
	public static void main(String[] args){
		Cube test1 = new Cube(2);
		System.out.println(test1.getVolume());
		System.out.println(test1.getSurfaceArea());
		RectangularPrism test2 = new RectangularPrism(1,2,3);
		System.out.println(test2.getVolume());
		System.out.println(test2.getSurfaceArea());
		Sphere test3 = new Sphere(4);
		System.out.println(test3.getVolume());
		System.out.println(test3.getSurfaceArea());
		TriangularPrism test4 = new TriangularPrism(1,2,3);
		System.out.println(test4.getVolume());
		System.out.println(test4.getSurfaceArea());
		Cylinder test5 = new Cylinder(2,3);
		System.out.println(test5.getVolume());
		System.out.println(test5.getTotalSurfaceArea());
		Cone test6 = new Cone(2,3);
		System.out.println(test6.getVolume());
		System.out.println(test6.getTotalSurfaceArea());
	}
}
