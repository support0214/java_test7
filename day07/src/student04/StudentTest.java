package student04;

public class StudentTest {

	public static void main(String[] args) {
		Student St = new Student();
		St.ob("공공융합");
		System.out.println("강좌명 : " + St.ob);
		
		int grade = St.grUp();
		System.out.println("학년 : " + grade);
		
		St.name("뚱땡이");
		System.out.println("이름 : " + St.name);
		
		St.num = 2021;
		St.cla = "수학과";
		System.out.println("학번 : " + St.num);
		System.out.println("학과 : " + St.cla);
		
		 // 100개 배열 반복문
		String[] str = new String[100];
		int[] num = new int [100];
		Student[] st = new Student[100];
		
		
		for(int i = 0; i<st.length; i++) {
			st[i] = new Student();
			st[i].num = 20230101+i;
			System.out.println(st[i].num);
		}
		
	}

}
