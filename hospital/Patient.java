package com.nadan.java.city.hospital;

import com.nadan.java.city.design.People;

public class Patient extends People{
	
	//성별을 자동으로 부여하는 메소드
	public void gender(){
		int gen = (int) (Math.random()*10); //난수생성을 통해 0부터 9까지 정수를 리턴한다
		int cas = 0;
		if(gen%2 == 0){ //2로 나눠 짝수면 남자
			cas = 0;
		} else if(gen%2 == 1){ //홀수면 여자로 지정한다
			cas = 1;
		}
		switch(cas){
			case 0 : gender = "남"; break; //break를 안 걸어줘서 꽤나 애 먹었다.
			case 1 : gender = "여"; break;
		}
		System.out.print(gender+" ");
	}


	//키를 자동으로 부여하는 메소드
	public void height(){
		//난수 생성으로 0부터 99까지 만든 후 다시 100을 더해 어린아이부터 성인까지의 키를 구한다.
		int h = (int) (Math.random()*100) + 100;
		height = h+"";
		System.out.print(height+" ");
		}

	//이름을 자동으로 부여하는 메소드
	public void name(){
		int nam = (int) (Math.random()*10);  //난수생성으로 0부터 9까지 리턴하면 각각 다른 성을 부여한다.
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
		height();
		name();
		System.out.println();
	}
}
