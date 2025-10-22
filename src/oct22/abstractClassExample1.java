package oct22;

// Abstract parent class
abstract class Animal {
    abstract String forest();
    abstract String home();
}

// Abstract child class
abstract class Tiger extends Animal {

    String forest() {
        return "I'm a wild Tiger";
    }
    // home() is not implemented here, so Tiger remains abstract
}

// Concrete class extending abstract Tiger
class BabyTiger extends Tiger {
    String home() {
        return "I can also be in a zoo or a reserve";
    }
}

// Another concrete class extending Animal
class Dog extends Animal {
    String forest() {
        return "I'm a Dog, wild sometimes";
    }

    String home() {
        return "I can also be a Domestic Animal";
    }
}

class Cat extends Animal {
    String forest() {
        return "I'm a Cat, wild animal";
    }

    String home() {
        return "I can also be a Domestic Animal";
    }
}

// Main class
public class abstractClassExample1 {
    public static void main(String[] args) {
        BabyTiger tiger = new BabyTiger();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(tiger.forest());
        System.out.println(tiger.home());

        System.out.println(dog.forest());
        System.out.println(dog.home());

        System.out.println(cat.forest());
        System.out.println(cat.home());
    }
}
