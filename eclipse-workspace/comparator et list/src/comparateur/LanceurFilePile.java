package comparateur;

import java.util.Deque;
import java.util.LinkedList;

public class LanceurFilePile {

	public static void main(String[] args) {
		Deque<Integer>integers=new LinkedList<>();
		
		integers.push(10);
		integers.push(20);
		
		System.out.println(integers.pop());
	}
}
