package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E_Array {

	public static void main(String[] args) {
		ArrayList<String> items= new ArrayList<String>();
		items.add("사과");
		items.add("연필");
		items.add("책");
		items.add("시계");
		items.add("텀블러");
		
		Random r= new Random(50);
		String selectedIUtem= items.get(r.nextInt(items.size()));
		Scanner sc= new Scanner(System.in);
		String userGuess;
		while(true) {
			System.out.println("아이템을 맞춰보세요");
			userGuess= sc.nextLine();
			if(userGuess.equals(selectedIUtem)) {
				System.out.println("정답");
				break;
			}
			else if(userGuess== "종료") {
				break;
			}
			else {
				System.out.println("땡");
			}
		}
	}

}
