package fr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D A = new Point2D(12,21);
		A.translate(5, 10);
		
		Point3D B = new Point3D (12,31,45);
		B.afficher();
		
		B.translate(10, 10, 10);
		B.afficher();
	}

}
