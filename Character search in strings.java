import java.util.Scanner;
public class CharOccurence {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string ");
str=sc.nextLine();
System.out.println("Enter the character whose index you want to search");
char ch=sc.next().charAt(0);
int findex=str.indexOf(ch);
System.out.println("First occurrence of "+ch+" occurs at "+findex);
int lindex=str.lastIndexOf(ch);
System.out.println("Last occurrence of "+ch+" occurs at "+lindex);
}
}