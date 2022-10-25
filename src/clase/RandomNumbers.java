package clase;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int num = random.nextInt(3);
		
		System.out.println(num);

	}

}
