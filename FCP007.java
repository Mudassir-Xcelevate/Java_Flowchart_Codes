import java.util.Scanner;
public class FCP007{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float farenheit = 0;

		farenheit = (float)((c/5)*9)+32;
		System.out.println(farenheit);
	}
}