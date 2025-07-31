import java.util.Scanner;
public class FCP025{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n; i++){
			int a = sc.nextInt();
			int sum =0;
			for(int j=0; j<a; j++){
				if(j%2==1){
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}
	}	
}

				
				
								
			
			
		
