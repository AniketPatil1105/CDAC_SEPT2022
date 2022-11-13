public class Array15Demo{
	
	static int[] arr={1,2,3,4,5};
	static int i;
	static int number=1;
	static int compare=1;
	static int counter;
	
	static int missingNumber(){
		
		for(i=counter;i<arr.length;i++){
			counter++;
			try{
				if(arr[i]!=compare){
					counter--;
					break;
				}
			}
		catch(ArrayIndexOutOfBoundsException ae){}
			++compare;
		}
		number=compare;
		++compare;
		return number;
		
		
	}
 
	public static void main(String[] args){
		try{
			for(int j=0;i<arr.length;j++)
			System.out.println("Missing number is "+missingNumber());
		}
		catch(ArrayIndexOutOfBoundsException ae){}
	}
 
 }