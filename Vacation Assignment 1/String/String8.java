import java.util.Scanner;

public class String8{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String str="abcaaaa";
		System.out.println("Enter the character");
		char character=sc.next().charAt(0);
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++){
			
			if(character==ch[i]){
				
				count++;
				
			}
		}	
			
		System.out.println("Given character occured "+count+" times.");
			
			
	}

}