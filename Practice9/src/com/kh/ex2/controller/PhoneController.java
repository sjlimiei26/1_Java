package com.kh.ex2.controller;

import com.kh.ex2.model.GalaxyNote9;
import com.kh.ex2.model.Phone;
import com.kh.ex2.model.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		int index = 0; // 결과를 담을 result 배열에서 사용할 인덱스
		for(Phone p : phones) {
			
			// Phone 타입은 printInformation() 알 수 없음!!
			if (p instanceof GalaxyNote9) {
				
				result[index++] = ((GalaxyNote9)p).printInformation();
			} else if (p instanceof V40) {
				result[index++] = ((V40)p).printInformation();
			}
			
		}
		
		return result;
		
	}

}






