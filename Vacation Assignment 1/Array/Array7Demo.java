class Array7Demo{

	public static void main(String[] args){
	
			int[] arr1={1,2,3,4,5};
			int[] arr2={6,7,8,9,};
			int[] arr3=new int[arr1.length+arr2.length];
			
			for(int i=0,j=0;j<arr1.length;i++,j++){
				
				try{
					arr3[i]=arr1[j];
					if(j>arr2.length-1)
						continue;
					arr3[++i]=arr2[j];
				}
				catch(ArrayIndexOutOfBoundsException ae){}
			}
			
			for(int i=0;i<arr3.length;i++){
				
				System.out.println(arr3[i]);
				
			}
			
			
			
	}		

}