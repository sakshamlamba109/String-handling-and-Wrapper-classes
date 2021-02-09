public class ConvertToCapital{
public static void main(String[] args) {
// TODO Auto-generated method stub
StringBuffer buff = new StringBuffer("jAva IS a GReat LAnguage");
int len1=buff.length();
String str1= "";
for(int i=0;i<len1;i++)
{
int a = buff.charAt(i);
if (a > 96 && a < 123){
a -= 32;
}
str1+=(char)a;
}
System.out.println("The converted string is:" + str1);
}
}