package Oct21;

abstract class Vehicle {
    abstract void sound ();
    void drive(){
        System.out.println("must drive At km pr hr");
    }
}
class bike extends Vehicle {
    void sound(){
        System.out.println("Bike sounds Durrr Durrr");
    }
}
public class Abstract {
    public static void main(String [] args){
        Vehicle v = new bike();
        v.sound();
        v.drive();
    }
}
