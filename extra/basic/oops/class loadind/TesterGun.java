class TesterGun{
	public static void main(String[] args){
		System.out.println("main method started.... ");
		
		Gun gun=new Gun();
		gun.modelName="Revolver";
		gun.distance=100;
		gun.automatic=false;
		gun.price=15000;
		
		Bullet bullet=new Bullet();
		bullet.Shape="triangle";
		bullet.Length=25;
		bullet.numOfBullet=6;
		
		gun.bullet=bullet; //HAS-A at runtime
		
		System.out.println("NumofBullet of bullet"+gun.bullet.numOfBullet);
		System.out.println("Length of bullet"+gun.bullet.Length);
		System.out.println("shape of bullet"+gun.bullet.Shape);
		System.out.println("main method ended.... ");
	}
}

class Gun{
	String brand;
	String modelName;
	double distance;
	boolean automatic;
	double price;
	Bullet bullet; //HAS-A at compilation
	
	
}

class Bullet{
	int numOfBullet;
	String Shape;
	double Length;
}