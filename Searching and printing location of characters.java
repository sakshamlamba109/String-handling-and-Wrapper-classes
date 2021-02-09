public class StringNameDemo {
void strName()
{ int c=0;
String name="Saksham Lamba";
int l=name.length();
System.out.println("Length of the string is "+l);
for(int i=0;i<l;i++)
{
if(name.charAt(i)=='a')
{c++;
System.out.println("The character 'a' is present at location "+(i+1));
}
}
System.out.println("The number of times the character 'a' occurs in the string is "+c);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
StringNameDemo obj= new StringNameDemo();
obj.strName();
}
}