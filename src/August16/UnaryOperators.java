package August16;

public class UnaryOperators {
    public static void main(String [] args){
        int a = 7;
        int b= 12;
        System.out.println("num1 :"+(a++));
        System.out.println("num2 :"+(--a));
        System.out.println("num1 :"+(b++));
        System.out.println("num2 :"+(--b));

        String str1 = "20";
        String str2 = "40";
        int c = Integer.parseInt(str1);
        int d = Integer.parseInt(str2);
        System.out.println(c++);
        System.out.println(--c);
        System.out.println(d++);
        System.out.println(--d);



    }
}
