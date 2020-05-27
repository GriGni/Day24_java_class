package org.comstudy21.day24;

import java.util.Enumeration;
import java.util.Hashtable;

public class Day24Ex01 {
	
	public static void main(String[] args) {
		
		Hashtable<String, String> friends = new Hashtable<String, String>();
		friends.put("홍길동", "010-2343-1111");
		friends.put("김길동", "010-2343-2222");
		friends.put("박길동", "010-2343-3333");
		friends.put("이길동", "010-2343-4444");
		friends.put("김길동", "010-2343-5555"); // 키값이 같으면 덮엊써진다.
		
		System.out.println(friends.size());
		System.out.println(friends);
		
		Enumeration<String> keys = friends.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + " : " + friends.get(key));
			
		}
		System.out.println("김길동의 전화번호: " + friends.get("김길동")); // 위의 예와 비교하면 위에는 한번에 전체를 가져오는 것이고 이것은 한개만 뽑을 경우
		
	}
}
