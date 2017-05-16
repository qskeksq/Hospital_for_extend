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
		//������ ��ü �ϳ� �����
		Hospital hospital1 = new Hospital();
		hospital1.color = "white";
		hospital1.door = 100;
		hospital1.floor = "10F";
		hospital1.price = 100000000;
		hospital1.doctor = 3;
		hospital1.nurs = 6;
		hospital1.patient = 21;
		System.out.println("���� Grand Open");
		System.out.println();

		//�ǻ縦 3�� ��ü ����
		Doctor doc1 = new Doctor();
		doc1.name = "Dr.ȫ";
		doc1.gender = "��";
		doc1.height = "210";
		doc1.age = 90;
		System.out.println(doc1.name+" ���");
		Doctor doc2 = new Doctor();
		doc2.name = "Dr.��";
		doc2.gender = "��";
		doc2.height = "190";
		doc2.age = 95;
		System.out.println(doc2.name+" ���");
		Doctor doc3 = new Doctor();
		doc3.name = "Dr.��";
		doc3.gender = "��";
		doc3.height = "230";
		doc3.age = 120;
		System.out.println(doc3.name+" ���");
		System.out.println();
		
		//���� �ٸ� �������� �����̴� ��ȣ�� 6�� ��ü
		Nurs nurs1 = new Nurs();
		nurs1.name = "mr.��";
		nurs1.gender = "��";
		nurs1.hairColor = "��Ȳ";
		System.out.print("��ȣ�� 1 : ");
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
		nurs2.name = "mr.��";
		nurs2.gender = "��";
		nurs2.hairColor = "�ݻ�";
		System.out.print("��ȣ�� 2 : ");
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
		nur3.name = "mr.��";
		nur3.gender = "��";
		nur3.hairColor = "�ʷ�";
		System.out.print("��ȣ�� 3 : ");
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
		nurs4.name = "mr.��";
		nurs4.gender = "��";
		nurs4.hairColor = "���";
		System.out.print("��ȣ�� 4 : ");
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
		nurs5.name = "mr.��";
		nurs5.gender = "��";
		nurs5.hairColor = "���";
		System.out.print("��ȣ�� 5 : ");
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
		nur6.name = "mr.��";
		nur6.gender = "��";
		nur6.hairColor = "�Ķ���";
		System.out.print("��ȣ�� 6 : ");
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
		
		//���� Ư���� �ٸ� ȯ�� 21���� �ڵ����� �����ϴ� �޼ҵ�
		ArrayList<Patient> list3 = new ArrayList<>();
		for(int i=0; i<21; i++){
			Patient p = new Patient();
			System.out.print("ȯ��"+(i+1)+" : ");
			p.auto();
			list3.add(p);
		}
		System.out.println();
		
		//�� �ǻ簡 ȯ�ڸ� 7�� �����ϴ� ���α׷���
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
