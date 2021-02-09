import java.util.Scanner;
public class Calculation {
Scanner sc=new Scanner(System.in);
String str;
int n;
void input() {System.out.print("Enter the string"); System.out.print(" ");
str=sc.nextLine();
}
void convert()
{
for(int i=0;i<str.length();i++)
{if(str.charAt(i)>=97&&str.charAt(i)<=122)
{
n=str.charAt(i)-32;
System.out.print((char)n);
}
else
System.out.print(str.charAt(i));
}
}
}
public class LowToUp {
public static void main(String[] args) {
// TODO Auto-generated method stub
Calculation c=new Calculation();
c.input();
c.convert();
}
}