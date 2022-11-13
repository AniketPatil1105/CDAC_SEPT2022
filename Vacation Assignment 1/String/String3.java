class String3{

	public static void main(String[] args){
	
		String str1="race";
		String str2="care";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		int anagrams=0;
		
		if(str1.length()!=str2.length()){
			
			System.out.println("False");
			return;
		}
		
		for(int i=0;i<str1.length();i++){
			int count=0;
			for(int j=0;j<str2.length();j++){
				
				if(ch1[i]==ch2[j]){
					
					count++;
					
				}
				
			}
			if(count>0){
				
				anagrams++;
				
			}
		}
		if(anagrams==str1.length()){
			
			System.out.println("True");
			
		}else{
			
			System.out.println("False");
			
		}
	}

}