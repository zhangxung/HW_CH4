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
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas + "�����l");
	}
	
	public void vshow(){
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
	
	public void mshow(){
		System.out.println("��������O�K");
	}
}