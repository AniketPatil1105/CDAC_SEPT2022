public class SpecialCoding13{

	static String decode(int n,String str1){
		
		String str2="";
		String str3="";
		String str4="";
		
		for(int i=0;i<str1.length();i++){
			
			char ch=str1.charAt(i);
			
			str2=str3=String.valueOf(ch);
			
			
			for(int j=0;j<n-1;j++){
				
				str2=str2.concat(str3);
				//System.out.println(str2);
				
			}
			str4=str4.concat(str2);
			//System.out.println(str2);
			str2=str3=null;
		}
		return str4;
		
		
	}

	public static void main(String[] args){
	
		String str="aniket";
		
		System.out.println(decode(5,str));
		
	}	

}		