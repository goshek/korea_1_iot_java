package chapter03;

import java.util.Arrays;

public class c_Array {

	public static void main(String[] args) {
		int[] numbers= {3, 2, 5, 4, 1};
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		System.out.println(Arrays.toString(numbers));
		int[] numbers2=  {3,2,5,4,1};
		System.out.println(numbers.equals(numbers2));
		Arrays.fill(numbers2, 10);
		System.out.println(Arrays.toString(numbers2));
	}

}
