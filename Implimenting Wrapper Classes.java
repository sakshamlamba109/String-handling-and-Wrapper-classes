public class WrapperDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
int num=20;
Integer obj=new Integer(num);
System.out.println("int to Integer "+obj);
String str = obj.toString();
System.out.println("Integer to String "+str);
int num_1=Integer.parseInt(str);
System.out.println("String to int "+num_1);
String s=String.valueOf(num_1);
System.out.println("int to String "+s);
Integer obj1 = null;
obj1=Integer.valueOf(s);
System.out.println("String to Integer "+obj1);
int num_3=obj1.intValue();
System.out.println("Integer to int "+num_3);
}
}