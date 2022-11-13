public class Array8Demo{

	public static void main(String[] args){
		int[] arr={10,20,30};
		int avg;
		for(int i=0;i<(arr.length-2);i++){
			
			if(arr.length<3)
				continue;
			int sum=arr[i]+arr[i+1]+arr[i+2];
			avg=sum/3;
			System.out.println(avg);
		}
			
			
	}		

}