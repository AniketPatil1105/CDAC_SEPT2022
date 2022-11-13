class Array5Demo{

	public static void main(String[] args){
	
			int[] arr={80,50,222,30,70};
			/*
			for(int i=0,j=1;j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
				
			}
			
			System.out.println("Smallest Number is "+arr[0]);
			
			for(int i=0,j=1;i<(arr.length)-1;i++,j++){
				
				if(arr[i]>arr[j]){
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
				
			}
			
			System.out.println("Largest Number is "+arr[(arr.length-1)]);
			*/
			
			for(int i=0;i<(arr.length)-1;i++){
				
				for(int j=i+1;j<arr.length;j++){
					
					if(arr[i]>arr[j]){
						
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						
					}
					
				}
				
			}
			
			System.out.println("Smallest number is "+arr[0]);
			System.out.println("Largest number is "+arr[(arr.length-1)]);
			
			
			
			
	}		

}