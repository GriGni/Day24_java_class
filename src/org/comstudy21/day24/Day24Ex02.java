package org.comstudy21.day24;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void show();
}

class Input implements View {
	public void show() {
		System.out.println("=== 입력기능 ===");
	}
}

class Output implements View {
	public void show() {
		System.out.println("=== 출력기능 ===");
	}
}

class Search implements View {
	public void show() {
		System.out.println("=== 검색기능 ===");
	}
}

class End implements View {
	public void show() {
		System.out.println("=== 종료기능 ===");
		System.exit(0);
	}
}

public class Day24Ex02 {

	static Scanner scan = new Scanner(System.in);
	static Hashtable<Integer, View> map = new Hashtable<Integer, View>();
	static { // 클래스 초기화문.
		map.put(1, new Input());
		map.put(2, new Output());
		map.put(3, new Search());
		map.put(4, new End());
	}

	public static void main(String[] args) {
		// map에다 넣어 놓고 가져오기 (switch문처럼)
		System.out.println("1. 입력 2. 출력 3. 검색 4. 종료");
		System.out.print("선택:  ");
		int no = scan.nextInt();

		try {
			View view = map.get(no);
			view.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("해당하지 않는 번호입니다");
		}
		// 반복되게 만들기
//		if(no == 4) return; //4를 누르면 종료
//		else main(null); // 아닐 경우 반복
		main(null);

	}
}
