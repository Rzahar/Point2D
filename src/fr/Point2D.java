package fr;

public class Point2D {
	private static int compteur = 0;
	private int x, y;


	public Point2D() {
	};

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void afficher () {
		System.out.println(this.getX()+ " ; "+ this.getY());
	}

	public void translate (int X, int Y) {
		this.x += X;
		this.y += Y;
	}
		
	
	public int compteur() {
	 int compteur = 1;
	 System.out.println(compteur);
	return compteur;
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
