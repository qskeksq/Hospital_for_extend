package com.nadan.java.city.design;

//추상 클래스로 지정하는 이유는 이 클래스가 오직 상속으로만 쓰이고, 사람의 공통 속성을 모아 놓은 클래스이기 때문이다.
//인터페이스로 쓰지 않은 이유도 '속성'을 지정할 수 있고, 움직임 속성을 강제하지 않아도 되며, 움직임 메소드 안에 코딩을 해야 하기 때문이다.
public abstract class People {
	
	//협업할 경우 private로 외부에서 접근하지 못하게 해야 하지만
	//개인 개발일 경우 퍼포먼스 향상을 위해 사용하지 않아도 된다.
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
