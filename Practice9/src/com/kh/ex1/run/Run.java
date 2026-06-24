package com.kh.ex1.run;

import com.kh.ex1.model.vo.Audio;
import com.kh.ex1.model.vo.RemoteControl;
import com.kh.ex1.model.vo.Television;

public class Run {

	public static void main(String[] args) {

		// 다형성을 활용하여 TV, Audio 객체를 생성 및 제어
		// => 부모 타입: RemoteControl
		// => 자식 타입: Television, Audio
		/*
		RemoteControl p1 = new Television();
		RemoteControl p2 = new Audio();
		
		p1.turnOn();
		p1.setVolume(7);
		p1.turnOff();
		System.out.println("----");
		p2.turnOn();
		p2.setVolume(5);
		p2.turnOff();
		*/
		
		RemoteControl[] remote = new RemoteControl[2];
		remote[0] = new Television();
		remote[1] = new Audio();
		
		for(RemoteControl rc : remote) {
			
			rc.turnOn();
			
			if (rc instanceof Television) {
				
				rc.setVolume(7);
			} else if (rc instanceof Audio) {
				
				rc.setVolume(5);
			}
			
			rc.turnOff();
			
		}
	}

}



