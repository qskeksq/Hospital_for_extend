package com.nadan.java.city.design;

//�߻� Ŭ������ �����ϴ� ������ �� Ŭ������ ���� ������θ� ���̰�, ����� ���� �Ӽ��� ��� ���� Ŭ�����̱� �����̴�.
//�������̽��� ���� ���� ������ '�Ӽ�'�� ������ �� �ְ�, ������ �Ӽ��� �������� �ʾƵ� �Ǹ�, ������ �޼ҵ� �ȿ� �ڵ��� �ؾ� �ϱ� �����̴�.
public abstract class People {
	
	//������ ��� private�� �ܺο��� �������� ���ϰ� �ؾ� ������
	//���� ������ ��� �����ս� ����� ���� ������� �ʾƵ� �ȴ�.
	public String gender;
	public int age;
	public String skinColor;
	public String height;
	public String hairColor;
	public String name;
	
	public void move(int direction){
		switch(direction){
		case 0: System.out.print("�밢�� "); break;
		case 1: System.out.print("�� "); break;
		case 2: System.out.print("������ "); break;
		case 3: System.out.print("���� "); break;
		case 4: System.out.print("�� "); break;
		case 5: System.out.print("�� "); break;
		case 6: System.out.print("�Ʒ� "); break;
		}
	}
	
	

	
	//�Ӽ��� �� private�� �ٲ۴ٰ� �����ϰ� getter setter�� ���ؼ� ���� �ְ����.
	//������ �������� �� �̰� getter setter ������ ������ 0.00001������ ��������.
	//������� �ʴ´ٸ� 
	
}
