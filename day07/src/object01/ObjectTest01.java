package object01;

public class ObjectTest01 {

	public static void main(String[] args) {
		// 실행용 클래스
		
		Object01 ob1 = new Object01(); 
		
		System.out.println(ob1.name);
		
		ob1.tel = "02-3456-9098";
		System.out.println(ob1.tel);
		
		System.out.println(ob1.add);
		ob1.add = "경기도 시흥시 매화동";
		System.out.println(ob1.add);
		
		System.out.println(ob1.num);
		ob1.num = 7829;
		System.out.println(ob1.num);
		System.out.println("-----------------------");
		System.out.println("ob2객체의 주소 : " + ob1.add);
		System.out.println("ob2객체의 이름 : " + ob1.name);
		System.out.println("ob2객체의 전화 : " + ob1.tel);
		System.out.println("ob2객체의 숫자 : " + ob1.num);
		
		Object01 ob2 = new Object01();
		System.out.println("-----------------------");
		System.out.println("ob2객체의 주소 : " + ob2.add);
		System.out.println("ob2객체의 이름 : " + ob2.name);
		System.out.println("ob2객체의 전화 : " + ob2.tel);
		System.out.println("ob2객체의 숫자 : " + ob2.num);
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------");
		Car carinfor = new Car();
		System.out.println(carinfor.company);
		System.out.println(carinfor.carName);
		System.out.println(carinfor.color);
		System.out.println(carinfor.gear);
		System.out.println(carinfor.maxSpeed);
		System.out.println("색상 변경 후");
		carinfor.color = "White";
		System.out.println(carinfor.color);
	}
}