public class Array10Demo{

	public static void main(String[] args){
		
		int[] arr={10,20,30,40,50};
		int ascending=0;
		int descending=0;
		
		for(int i=0;i<(arr.length)-1;i++){
			
			if(arr[i]<arr[i+1]){
				
				ascending++;
				
			}else if(arr[i]>arr[i+1]){
				
				descending++;
				
			}else if(arr[i]==arr[i+1]){
				
				ascending++;
				descending++;
				
			}
			
		}
		if(ascending==(arr.length-1)){
			
			System.out.println("Ascending");
			
		}else if(descending==(arr.length-1)){
			
			System.out.println("Descending");
			
		}else{
			
			System.out.println("Random");
			
		}
	
			
	}		

}