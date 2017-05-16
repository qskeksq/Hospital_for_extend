package com.nadan.java.city.design;

public abstract class Building {
	
	public int door;
	public String color;
	public String floor;
	public int size;
	public int price;

	//설계를 할 때는 이렇게 카테고라이즈 한다. 나중에 경찰서를 만들 때 상속 받아서 만들면 되잖아
	//이게 바로 설계한다는 뜻이다.
}
