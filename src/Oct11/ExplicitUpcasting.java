package Oct11;

class Animal {
    public void MakeSound() {
        System.out.println("Animal makes Sound");
    }
}
    class Dog extends Animal {
        public void Barks() {
            System.out.println("Dog Barks");
        }

        public void fetches() {
            System.out.println("Dog fetches the ball");
        }
        @Override
        public void MakeSound() {
            System.out.println("Dog Barks");  // override parent method
        }
    }

    class lion extends Animal{
        public void roar() {
            System.out.println("Lion Roars");
        }

        public void captaincy() {
            System.out.println("Lion is the team leader");
        }
        @Override
        public void MakeSound() {
            System.out.println("Lion Roars");  // override parent method
        }
    }

    class cat extends Animal {
        public void meow() {
            System.out.println("cat Meows");
        }

        public void sleep() {
            System.out.println("sleeping master");
        }
        @Override
        public void MakeSound() {
            System.out.println("cat Meows");  // override parent method
        }
    }

    // main method
    public class ExplicitUpcasting{
        public static void main(String[] args) {
            //obj creation
            Animal a1 = new Dog();
            Animal a2 = new lion();
            Animal a3 = new cat();

            a1.MakeSound();
            a2.MakeSound();
            a3.MakeSound();

        }
}