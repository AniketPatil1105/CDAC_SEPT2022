class Array4Demo{

	public static void main(String[] args){
	
			int[] arr={1,2,3,4,5,6,7,8};
			
			for(int i=0,j=(arr.length)-1;i<(arr.length)/2;i++,j--){
				
				int temp=0;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
			for(int i=0;i<arr.length;i++){
				
				System.out.println(arr[i]);
			
			}
	}

}