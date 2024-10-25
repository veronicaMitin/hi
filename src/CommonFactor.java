/**
//purpose: takes integer values f, n, and m and returns true if f is a factor of n and m
 * First method takes 3 integer values, f, n, and m, and returns true if n and m share a common factor with f
 * Second method counts the total difference between n and m 
 * @author Veronica Mitin
 *
 */
public class CommonFactor {
	/**
	 * 
	 * @param f
	 * @param n
	 * @param m
	 * @return
	 */
	public static boolean isCommonFactor(int f, int n, int m) {
		boolean factor1 = n % f == 0;
		boolean factor2 = m % f == 0;
		return factor1 && factor2;
	}
	/**
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static int gcf(int n, int m) {
		int count = n;
		while(!isCommonFactor(count, n, m)) {
			count --;
		}
		return count;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isCommonFactor(5,10,15));
		System.out.println(isCommonFactor(3000,222,876));
		System.out.println(isCommonFactor(3,12,333));
		System.out.println(isCommonFactor(7,8176,16));
		
		System.out.println(gcf(5,10));
		System.out.println(gcf(15,12));
		System.out.println(gcf(1479,1711));
		System.out.println(gcf(969,1197));
	}
}
