public class Example1 {
    public static void main(String[] args){
    byte b = 122;  // -128 to 127
    short s = 22000; // -32768 to 32767
    int i = 52; // -2.1 billion to 2.1 billion
    long l = 8000000000L; // -9.1 * 10^18 to 9.1 * 10^18
    float f = 3.14f; //6-7 digits of precison
    double d = 3.0423432423; // 15-16 digits of precision
    char c = 'J'; // 0  to 65335 unicode
    boolean flag = false; // true or false


    System.out.println("byte:    " + b);
    System.out.println("short:   " + s);
    System.out.println("Int:   " + i);
    System.out.println("Long:   " + l);
    System.out.println("Float:   " + f);
    System.out.println("Double:   " + d);
    System.out.println("char:   " + c);
    System.out.println("boolean:   " + flag);



   System.out.println(7 / 2);
   System.out.println(7.0 / 2);
   System.out.println('A' + 1);
   System.out.println("A" + 1);
   System.out.println(1 + 2 + "3");
   System.out.println("1" + 2 + 3);

    }
}