public class SpecialCoding11{

	public static void main(String[] args){
	
		String s="abc";
		String t="lmnopq";
		
		char[] ch=new char[s.length() + t.length()];
		int i=0;
		int j=0;
		while(i<s.length() || i<t.length()){
			
			if(i<s.length()){
				
				ch[j]=s.charAt(i);
				j++;
				
				
			}
			
			if(i<t.length()){
				
				ch[j]=t.charAt(i);
				j++;
				
				
			}
			i++;
			
			
		}
		
		String str=new String(ch);
		System.out.println(str);
		
	}

}