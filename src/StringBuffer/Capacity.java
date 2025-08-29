package StringBuffer;

public class Capacity {
    public static void main(String [] args){
      StringBuffer gayu  = new StringBuffer();
      gayu.append("Happy Girl");
      System.out.println(gayu.capacity());
      gayu.append(" ");
      System.out.println(gayu.capacity());
      gayu.append("She Loves Java More Than Python ");
        System.out.println(gayu.capacity());

    }
}
