public class p25 {

	public static void main(String[] args) {
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		Car8 car3;
		car3 = car1;
		
		System.out.println("car1 �� car2 �ۦP" + car1.equals(car2));
		System.out.println("car1 �� car3 �ۦP" + car1.equals(car3));
	}
}

class Car8{
	protected int num;
	protected double gas;

	public Car8(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}
