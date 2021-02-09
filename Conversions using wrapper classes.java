public class WrapperDemo_1
{
public static void main(String[] args) {
float f=3.5f;
Float F1=new Float(f1);
System.out.println("float to Float "+f);
String str=F1.toString();
System.out.println("Float to String "+str);
float f2=Float.parseFloat(str);
System.out.println("String to float "+f2);
String str2= String.valueOf(f2);
System.out.println("float to String "+str2);
Float F2=new Float(str2);
System.out.println("String to Float "+F2);
float f3= F2.floatValue();
System.out.println("Float to float "+f3);
}
}