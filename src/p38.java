public class p38 {

	public static void main(String[] args) {
		iVehicle[] ivc = new iVehicle[2];
		
		ivc[0] = new Car12(1234,20.5);
		ivc[1] = new Plane1(232);
	
		for(int i = 0; i < ivc.length;i++){
			ivc[i].show();
		}
	}
}

interface iVehicle{
	int weight = 1000;
	void show();
}

class Car12 implements iVehicle{
	private int num;
	private double gas;
	
	public Car12(int n,double g){
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas + "�����l");
	}
	
	public void show(){
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}

class Plane1 implements iVehicle{
	private int flight;
	
	public Plane1(int f){
		flight = f;
		System.out.println("�Ͳ��F" + flight + "�Z��������");
	}
	
	public void show(){
		System.out.println("�������Z���O" + flight);
	}
}