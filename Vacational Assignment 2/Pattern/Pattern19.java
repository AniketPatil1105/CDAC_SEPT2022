class Pattern19{

public static void main(String args[]){
int k=0;
for(int i=0;i<7;i++)
{
 k=1;
for(int j=0; j<(7+i); j++)
{
if(j<(7-i-1))
{
//System.out.println();
}
else
{
System.out.print(" "+k);
if(j<(7-1))
{
k++;
}
else
{ 
k--;
}
}
}
System.out.println("  ");
}

}
}

