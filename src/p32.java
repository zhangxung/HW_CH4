public class p32 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car10(1234,20.5);
		vc[1] = new Plane(232);
	
		for(int i = 0; i < vc.length;i++){
			if(vc[i] instanceof Car10)
				System.out.println("��" +(i+1) + "�Ӫ���OCar���O");
			else
				System.out.println("��" +(i+1) + "�Ӫ��󤣬OCar���O");
		}
	}
}