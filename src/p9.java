public class p9 {

	public static void main(String[] args) {
		RacingCar3 rccar3 = new RacingCar3();
		rccar3.newshow();
	}
}

class Car3{
	protected int num;
	protected double gas;

	public Car3(){
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

class RacingCar3 extends Car3{
	private int course;
	
	public RacingCar3(){
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	

	public void setCourse(int c){
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);			
	}
	
	public void newshow(){
		System.out.println("�ɨ��������O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O"+ course);
	}
}