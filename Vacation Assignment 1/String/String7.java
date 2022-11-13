class String7{

	public static void main(String[] args){
	
		String str="programming";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length()-1;i++){
			
			int count=0;
			
			for(int j=i+1;j<str.length();j++){
				
				if(ch[i]==ch[j]){
					
					ch[j]='0';
					count++;
					
				}
				
			}
			if(ch[i]!='0' && count>0)
				System.out.println(ch[i]+" : "+(count+1));
			
		}
	
	}

}