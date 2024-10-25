package randomMath;

public class math {
	public static int random(int lowerBound, int upperBound){
		int range = upperBound - lowerBound;
		double temp = Math.random();
			temp = temp * range;
			temp = temp + lowerBound;
			return (int)temp;
	}
	public static void main(String[] args) {
}
