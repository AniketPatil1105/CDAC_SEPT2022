import java.util.*;
class String21
{
   static StringBuffer remove(String s,char c)
   {
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<s.length();i++)
      {
           if(s.charAt(i)!=c)
               sb.append(s.charAt(i));
      }
     return sb;
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the String");
      String s=sc.nextLine();   
      System.out.println("Enter the char");
      char c=sc.next().charAt(0);
      
      System.out.println(remove(s,c));
   }
}