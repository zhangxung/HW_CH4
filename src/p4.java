public class p4 {

	public static void main(String[] args) {		
		RacingCar1 rccar1 = new RacingCar1();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}
}

class Car1{
	int num;
	double gas;

	public Car1(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
		
	public void show(){
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}

class  RacingCar1 extends Car1{
	private int course;
	
	public RacingCar1(){
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	
	
	public void setCourse(int c){
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);			
	}
	
	
}