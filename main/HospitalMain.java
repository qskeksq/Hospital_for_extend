package com.nadan.java.extend;

import java.util.ArrayList;

import com.nadan.java.city.creature.Airplain;
import com.nadan.java.city.creature.Car;
import com.nadan.java.city.creature.Human;
import com.nadan.java.city.hospital.Doctor;
import com.nadan.java.city.hospital.Hospital;
import com.nadan.java.city.hospital.Nurs;
import com.nadan.java.city.hospital.Patient;

public class HospitalMain {

	public static void main(String[] args) {
		//병원을 객체 하나 만들기
		Hospital hospital1 = new Hospital();
		hospital1.color = "white";
		hospital1.door = 100;
		hospital1.floor = "10F";
		hospital1.price = 100000000;
		hospital1.doctor = 3;
		hospital1.nurs = 6;
		hospital1.patient = 21;
		System.out.println("병원 Grand Open");
		System.out.println();

		//의사를 3명 객체 생성
		Doctor doc1 = new Doctor();
		doc1.name = "Dr.홍";
		doc1.gender = "남";
		doc1.height = "210";
		doc1.age = 90;
		System.out.println(doc1.name+" 출격");
		Doctor doc2 = new Doctor();
		doc2.name = "Dr.박";
		doc2.gender = "여";
		doc2.height = "190";
		doc2.age = 95;
		System.out.println(doc2.name+" 출격");
		Doctor doc3 = new Doctor();
		doc3.name = "Dr.서";
		doc3.gender = "남";
		doc3.height = "230";
		doc3.age = 120;
		System.out.println(doc3.name+" 출격");
		System.out.println();
		
		//각각 다른 방향으로 움직이는 간호사 6명 객체
		Nurs nurs1 = new Nurs();
		nurs1.name = "mr.양";
		nurs1.gender = "남";
		nurs1.hairColor = "주황";
		System.out.print("간호사 1 : ");
		for(int i=0; i<20; i++){
			int dir = (int) (Math.random()*10);
			if(dir<=6){
				nurs1.move(dir);
			} else {
				dir = dir-4;
				nurs1.move(dir);
			}
		}
		System.out.println();
		
		Nurs nurs2 = new Nurs();
		nurs2.name = "mr.조";
		nurs2.gender = "여";
		nurs2.hairColor = "금색";
		System.out.print("간호사 2 : ");
		for(int i=0; i<20; i++){
			int dir = (int)(Math.random()*10);
			if(dir<=6){
				nurs2.move(dir);
			} else {
				dir = dir-4;
				nurs2.move(dir);
			}
		}
		System.out.println();
		
		Nurs nur3 = new Nurs();
		nur3.name = "mr.김";
		nur3.gender = "남";
		nur3.hairColor = "초록";
		System.out.print("간호사 3 : ");
		for(int i=0; i<20; i++){
			int dir = (int) (Math.random()*10);
			if(dir<=6){
				nurs2.move(dir);
			} else {
				dir = dir-4;
				nurs2.move(dir);
			}
		}
		System.out.println();
		
		Nurs nurs4 = new Nurs();
		nurs4.name = "mr.서";
		nurs4.gender = "남";
		nurs4.hairColor = "녹색";
		System.out.print("간호사 4 : ");
		for(int i=0; i<20; i++){
			int dir = (int) (Math.random()*10);
			if(dir<=6){
				nurs4.move(dir);
			} else {
				dir = dir-4;
				nurs4.move(dir);
			}
		}
		System.out.println();
		
		Nurs nurs5 = new Nurs();
		nurs5.name = "mr.최";
		nurs5.gender = "여";
		nurs5.hairColor = "흰색";
		System.out.print("간호사 5 : ");
		for(int i=0; i<20; i++){
			int dir = (int)(Math.random()*10);
			if(dir<=6){
				nurs5.move(dir);
			} else {
				dir = dir-4;
				nurs5.move(dir);
			}
		}
		System.out.println();
		
		Nurs nur6 = new Nurs();
		nur6.name = "mr.오";
		nur6.gender = "남";
		nur6.hairColor = "파란색";
		System.out.print("간호사 6 : ");
		for(int i=0; i<20; i++){
			int dir = (int) (Math.random()*10);
			if(dir<=6){
				nur6.move(dir);
			} else {
				dir = dir-4;
				nur6.move(dir);
			}
		}
		System.out.println();
		System.out.println();
		
		//각각 특성이 다른 환자 21명을 자동으로 생성하는 메소드
		ArrayList<Patient> list3 = new ArrayList<>();
		for(int i=0; i<21; i++){
			Patient p = new Patient();
			System.out.print("환자"+(i+1)+" : ");
			p.auto();
			list3.add(p);
		}
		System.out.println();
		
		//각 의사가 환자를 7명씨 진찰하는 프로그램을
		for(int i=0; i<7; i++){
			doc1.diganosis(doc1.name ,list3.get(i), i+1);
		}
		System.out.println();
		
		for(int i=7; i<14; i++){
			doc2.diganosis(doc2.name ,list3.get(i), i+1);
		}
		System.out.println();
		
		for(int i=14; i<21; i++){
			doc3.diganosis(doc3.name ,list3.get(i), i+1);
		}
		System.out.println();

		
	}

}
