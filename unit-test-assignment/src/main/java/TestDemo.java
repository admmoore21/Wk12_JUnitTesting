import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if (a > 0 &&  b > 0) {
			int sum = a + b;
			return sum;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		} 
	}
	
	public int randomNumberSquared() {
		int num = getRandomInt();
		return num * num;
	}
	
	public int getRandomInt() {
			Random random = new Random();
			return random.nextInt(10) + 1;
		}
	
}
