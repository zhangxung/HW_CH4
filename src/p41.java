public class p41 {

	public static void main(String[] args) {
		Car13 car = new Car13(1234,20.5);
		
		car.vshow();
		car.mshow();
	}
}

interface iVehicle1{
	void vshow();
}

interface iMaterial{
	void mshow();
}

class Car13 implements iVehicle1,iMaterial{
	private int num;
	private double gas;
	
	public Car13(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas + "的車子");
	}
	
	public void vshow(){
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	public void mshow(){
		System.out.println("車的材質是鐵");
	}
}