import java.util.Scanner;
public class Array9Demo{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1,j=2;i<=num || j<=num;i=i+2,j=j+2){
			
			System.out.print((int)Math.pow(i,3)+" ");
			System.out.print((int)Math.pow(j,2)+" ");
			
		}
	
			
	}		

}