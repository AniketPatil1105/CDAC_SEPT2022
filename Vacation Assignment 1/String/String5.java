class String5{

	public static void main(String[] args){
	
		String str="911052a";
		int count=0;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)<='9'){
				
				count++;
				
			}
			
		}
		if(count==str.length()){
			
			System.out.println("String contains only Digits");
			
		}else{
			
			System.out.println("String doesn't contain only Digits");
			
		}
	
	}

}