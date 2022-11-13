class String4Demo{

	public static void main(String[] args){
	
			String str="anianiy";
			char[] ch=str.toCharArray();
			int i=0;
			
			
			for(i=0;i<str.length();i++){
				
				int count=0;
				
				for(int j=0;j<str.length();j++){
					
					if(ch[i]==ch[j]){
						
							count++;
						
					}
					
				}
				if(count==1){
					
					System.out.println(ch[i]);
					break;
					
				}
				
			}
			
			
			
	
	}

}