public class p24 {

	public static void main(String[] args) {
		Car7 car = new Car7();
		car.setCar(1234,20.5);
		System.out.println(car);
	}
}

class Car7{
	protected int num;
	protected double gas;

	public Car7(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}

	public void setCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
		
	public String toString(){
		String str = "����:" + num + ";�T�o�q:" +gas;
		return str;
	}
}