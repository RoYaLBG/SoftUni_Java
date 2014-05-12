import java.util.Scanner;


public class FormattingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String aToHex = Integer.toHexString(a).toUpperCase();
        String aToBin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        String format = "|%-10s|%s|%10.2f|%-10.3f|";
        if ((c == Math.floor(c)) && !Double.isInfinite(c)) {
        	format = "|%-10s|%s|%10.2f|%-10.0f|";
        }
        System.out.printf(format,aToHex,aToBin,b,c);
        

	}

}
