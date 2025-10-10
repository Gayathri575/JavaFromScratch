package Oct10;

// interface declaration
interface Animal {
    //abstarct method
    void sound();
}
    // class implements interface
    class Dog implements Animal {
        //method body
        public void sound(){
            System.out.println("Dog barks");
        }
    }
    class cat implements Animal{
        public void sound(){
            System.out.println("Cat meaw");
        }
    }
    class Cow implements Animal {
        public void sound(){
            System.out.println("Cow Mooo");
        }
    }
    public class Interface{
        public static void main(String [] args){
            //object creation
            Animal ani = new Dog();
            Animal ani1 = new cat();
            Animal ani2 = new Cow();

            ani.sound();
            ani1.sound();
            ani2.sound();

        }

    }
