package student04;


public class Student {
	//학생 속성
String name ;
int num ;
int gr ;
String cla;
String ob;
	//메소드 기능
	
	int grUp(){
		++gr;
		return gr;
	}
	
	void ob(String ob1) {
		ob = ob1;
	}
		
	void name(String name1) {
		name = name1;
	}
	}


