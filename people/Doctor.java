package com.nadan.java.city.hospital;

import com.nadan.java.city.design.People;

public class Doctor extends People{
	
	//몇번 환자를 진료하는지 알려준다.
	public void diganosis(String doc, Patient patient, int i){
		System.out.println(doc+" "+i+"번 환자를 진찰한다");
	}

}
