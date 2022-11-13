 class Array14Demo{
 
	public static void main(String[] args){
	
		int[] arr1={10,20,30,40};
		int[] arr2={10,20,50,40};
		int count=0;
		if(arr1.length==arr2.length){
			
			for(int i=0;i<arr1.length && i<arr2.length;i++){
				
			
					if(arr1[i]!=arr2[i]){
						count++;
					}
				
			}
			if(count>0){
				
				System.out.println("Arrays are not equal");
				
			}else{
				
				System.out.println("Arrays are equal");

			}
				System.out.println("Both have same length");
		}else{
			
			System.out.println("Arrays are not equal");
			System.out.println("Both have different length");
		}
	
	}
 
 }