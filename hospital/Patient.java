package com.nadan.java.city.hospital;

import com.nadan.java.city.design.People;

public class Patient extends People{
	
	//������ �ڵ����� �ο��ϴ� �޼ҵ�
	public void gender(){
		int gen = (int) (Math.random()*10); //���������� ���� 0���� 9���� ������ �����Ѵ�
		int cas = 0;
		if(gen%2 == 0){ //2�� ���� ¦���� ����
			cas = 0;
		} else if(gen%2 == 1){ //Ȧ���� ���ڷ� �����Ѵ�
			cas = 1;
		}
		switch(cas){
			case 0 : gender = "��"; break; //break�� �� �ɾ��༭ �ϳ� �� �Ծ���.
			case 1 : gender = "��"; break;
		}
		System.out.print(gender+" ");
	}


	//Ű�� �ڵ����� �ο��ϴ� �޼ҵ�
	public void height(){
		//���� �������� 0���� 99���� ���� �� �ٽ� 100�� ���� ����̺��� ���α����� Ű�� ���Ѵ�.
		int h = (int) (Math.random()*100) + 100;
		height = h+"";
		System.out.print(height+" ");
		}

	//�̸��� �ڵ����� �ο��ϴ� �޼ҵ�
	public void name(){
		int nam = (int) (Math.random()*10);  //������������ 0���� 9���� �����ϸ� ���� �ٸ� ���� �ο��Ѵ�.
		switch(nam){
		case 0: name = "ȫ";break;
		case 1: name = "��";break;
		case 2: name = "��";break;
		case 3: name = "��";break;
		case 4: name = "��";break;
		case 5: name = "��";break;
		case 6: name = "��";break;
		case 7: name = "��";break;
		case 8: name = "��";break;
		case 9: name = "Ȳ";break;
		}
		System.out.print(name+" ");
	}

	//�� �޼ҵ���� �Ѳ����� �����ϴ� �޼ҵ�
	public void auto(){
		gender();
		height();
		name();
		System.out.println();
	}
}
