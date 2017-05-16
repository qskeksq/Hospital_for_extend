package com.nadan.java.city.hospital;

import com.nadan.java.city.design.People;

public class Patient extends People{
	
	//성별을 자동으로 부여하는 메소드
	public void gender(){
		int gen = (int) (Math.random()*10);
		int cas = 0;
		if(gen%2 == 0){
			cas = 0;
		} else if(gen%2 == 1){
			cas = 1;
		}
		switch(cas){
			case 0 : gender = "남"; break; //break를 안 걸어줘서 꽤나 애 먹었다.
			case 1 : gender = "여";break;
		}
		System.out.print(gender+" ");
	}
	
	//피부색을 자동으로 부여하는 메소드
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
		case 0:skinColor = "백인"; break;
		case 1:skinColor = "황인";break;
		case 2:skinColor = "흑인";break;
		}
		System.out.print(skinColor+" ");
	}

	//키를 자동으로 부여하는 메소드
	public void height(){
		int h = (int) (Math.random()*100) + 100;;
		height = h+"";
		System.out.print(height+" ");
		}

	//이름을 자동으로 부여하는 메소드
	public void name(){
		int nam = (int) (Math.random()*10);
		switch(nam){
		case 0: name = "홍";break;
		case 1: name = "김";break;
		case 2: name = "조";break;
		case 3: name = "박";break;
		case 4: name = "이";break;
		case 5: name = "최";break;
		case 6: name = "오";break;
		case 7: name = "고";break;
		case 8: name = "맹";break;
		case 9: name = "황";break;
		}
		System.out.print(name+" ");
	}

	//위 메소드들을 한꺼번에 실행하는 메소드
	public void auto(){
		gender();
		skinColor();
		height();
		name();
		System.out.println();
	}
}
