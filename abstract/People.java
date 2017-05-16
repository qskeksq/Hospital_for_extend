package com.nadan.java.city.design;

public abstract class People {
	
	public String gender;
	public int age;
	public String skinColor;
	public String height;
	public String hairColor;
	public String name;
	
	public void move(int direction){
		switch(direction){
		case 0: System.out.print("대각선 "); break;
		case 1: System.out.print("앞 "); break;
		case 2: System.out.print("오른쪽 "); break;
		case 3: System.out.print("왼쪽 "); break;
		case 4: System.out.print("뒤 "); break;
		case 5: System.out.print("위 "); break;
		case 6: System.out.print("아래 "); break;
		}
	}
	
	

	
	//속성은 다 private로 바꾼다고 생각하고 getter setter를 통해서 갑을 주고받자.
	//하지만 현업에서 는 이게 getter setter 때문에 퍼포가 0.00001초정도 느려진다.
	//취업하지 않는다면 
	
}
