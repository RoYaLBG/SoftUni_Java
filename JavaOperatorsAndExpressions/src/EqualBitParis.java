import java.util.Scanner;


public class EqualBitParis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[] aToBin = String.format("%10s", Integer.toBinaryString(a)).toCharArray();
		int length = aToBin.length;
		for (int i = 0; i < aToBin.length; i++) {
			if (aToBin[i] == '1') {
				length = i;
				break;
			}
		}
		int count = 0;
		for (int i = length; i < aToBin.length; i++) {
			if(i < aToBin.length-1) {
				if (aToBin[i] == aToBin[i+1]) count++;
			}
		}
		System.out.println(count);
	}

}
