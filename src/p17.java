public class p17 {

	public static void main(String[] args) {
		Car6 cars[] = new Car6[2];
		cars[0] = new Car6();
		cars[0].setCar(1234,20.5);
		
		cars[1] = new RacingCar6();
		cars[1].setCar(4567,30.5);
		
		for(int i = 0; i < cars.length; i++)
			cars[i].show();
	}
}

class Car6{
	protected int num;
	protected double gas;

	public Car6(){
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

class RacingCar6 extends Car6{
	private int course;
	
	public RacingCar6(){
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	

	public void setCourse(int c){
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);			
	}
	
	public void show(){
		System.out.println("�ɨ��������O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O"+ course);
	}
	
}