package com.nadan.java.city.hospital;

import com.nadan.java.city.design.People;

public class Patient extends People{
	
	//������ �ڵ����� �ο��ϴ� �޼ҵ�
	public void gender(){
		int gen = (int) (Math.random()*10);
		int cas = 0;
		if(gen%2 == 0){
			cas = 0;
		} else if(gen%2 == 1){
			cas = 1;
		}
		switch(cas){
			case 0 : gender = "��"; break; //break�� �� �ɾ��༭ �ϳ� �� �Ծ���.
			case 1 : gender = "��";break;
		}
		System.out.print(gender+" ");
	}
	
	//�Ǻλ��� �ڵ����� �ο��ϴ� �޼ҵ�
	public void skinColor(){
		int skin = (int) (Math.random()*10);
		int sk = 0;
		if(skin%3 == 0){
			sk = 0;
		}else if(skin%3 == 1){
			sk = 1;
		}else if(skin%3 == 2){
			sk = 2;
		}
		switch(sk){
		case 0:skinColor = "����"; break;
		case 1:skinColor = "Ȳ��";break;
		case 2:skinColor = "����";break;
		}
		System.out.print(skinColor+" ");
	}

	//Ű�� �ڵ����� �ο��ϴ� �޼ҵ�
	public void height(){
		int h = (int) (Math.random()*100) + 100;;
		height = h+"";
		System.out.print(height+" ");
		}

	//�̸��� �ڵ����� �ο��ϴ� �޼ҵ�
	public void name(){
		int nam = (int) (Math.random()*10);
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
		skinColor();
		height();
		name();
		System.out.println();
	}
}
