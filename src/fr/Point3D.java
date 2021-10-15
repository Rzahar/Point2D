package fr;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D () {}
	
	public Point3D (int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void translate (int X, int Y, int Z) {
		super.translate(X, Y);
		this.z += Z;
	}
	
	public void afficher () {
		System.out.println(this.getX()+ " ; "+ this.getY() + "; " + this.getZ());
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}

	
}
