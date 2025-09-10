import java.io.*;
public class Numbers {
    private int a;
    private int b;

    public void setA(int a ){this.a=a;}
        public void setB(int b){this.b=b;}

    public void sum (){ System.out.println(a+b);}
    public void sub () {System.out.println(a-b);}

public static void main(String [] args){
        Numbers num = new Numbers();
        num.setA(10);
        num.setB(20);

        num.sum();
        num.sub();

        class Gayu {
            public static void main(String args []){
                System.out.println("GAYATHIRI");
            }
        }
}
}
