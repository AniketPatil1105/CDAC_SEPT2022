class Array2Demo{

	public static void main(String[] args){
	
			int[] arr1={10,20,30};
			int[] arr2={10,20,30};
			int[] arr3={10,20,40};
			
			int count=0;
			
			for(int i=0;i<arr1.length;i++){
				
				if(arr1[i]!=arr3[i]){
					
					count++;
					
				}
				
			}
			
			if(count==0)
				System.out.println("Arrays are equal");
			else
				System.out.println("Arrays are not equal");
			
			
	
	}

}