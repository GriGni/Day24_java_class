package org.comstudy21.day24;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void show();
}

class Input implements View {
	public void show() {
		System.out.println("=== �Է±�� ===");
	}
}

class Output implements View {
	public void show() {
		System.out.println("=== ��±�� ===");
	}
}

class Search implements View {
	public void show() {
		System.out.println("=== �˻���� ===");
	}
}

class End implements View {
	public void show() {
		System.out.println("=== ������ ===");
		System.exit(0);
	}
}

public class Day24Ex02 {

	static Scanner scan = new Scanner(System.in);
	static Hashtable<Integer, View> map = new Hashtable<Integer, View>();
	static { // Ŭ���� �ʱ�ȭ��.
		map.put(1, new Input());
		map.put(2, new Output());
		map.put(3, new Search());
		map.put(4, new End());
	}

	public static void main(String[] args) {
		// map���� �־� ���� �������� (switch��ó��)
		System.out.println("1. �Է� 2. ��� 3. �˻� 4. ����");
		System.out.print("����:  ");
		int no = scan.nextInt();

		try {
			View view = map.get(no);
			view.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�ش����� �ʴ� ��ȣ�Դϴ�");
		}
		// �ݺ��ǰ� �����
//		if(no == 4) return; //4�� ������ ����
//		else main(null); // �ƴ� ��� �ݺ�
		main(null);

	}
}
