package tv03;

public class Tv {
	//tv 속성
	String company; //기본값 default : null
	String model;
	int channel; //기본값 default : 0
	int volume;
	boolean power; //기본값 default : false
	
	//method 기능
	void power( ) {
		power = !power;
		if(power == true)
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");
	}
	void channelUp() {
		++channel;
	}
	void channerDown() {
		--channel;
	}
	void volumeUp() {
		++volume;
	}
	void volumeDown() {
		--volume;
	}
}
