public class p6 {

	public static void main(String[] args) {
		RacingCar2 rccar2 = new RacingCar2(1234,20.5,5);
	}
}

class Car2{
	private int num;
	private double gas;

	public Car2(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car2(int n,double g){
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������" + num + "�A�T�o�q��" + gas + "�����l");
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

class  RacingCar2 extends Car2{
	private int course;
	
	public RacingCar2(){
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	
	
	public RacingCar2(int n,double g,int c){
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����" + course + "���ɨ�");
	}	
	
	public void setCourse(int c){
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);			
	}
}