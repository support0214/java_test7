package tv03;

public class Tv3 {
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
	int channelUp() {
		++channel;
		return channel;
	}
	int channerDown() {
		--channel;
		return channel;
	}
	int volume(int volume1) {
		volume = volume1;
		return volume;
	}
	int volumeUp(int volume1) {
		volume += volume1;
		return volume;
	}
	int volumeDown(int volume1) {
		volume -= volume1;
		return volume;
	}
	}
