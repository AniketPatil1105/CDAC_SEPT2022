class Pattern13{

public static void main(String args[]){

for(char i='A'; i <='F';i++)

{
for(char j='F'; j>=i ; j--)
{
System.out.print(" ");
}

for(char j='A'; j<=i; j++)

{
//System.out.print(i+" ");

System.out.print(j+" ");


}

System.out.println();
}

}
}

