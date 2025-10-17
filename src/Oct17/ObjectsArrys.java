package Oct17;

class Student {
    String name;
    int age;

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to display details
    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// main class should be outside the Student class
public class ObjectsArrys {
    public static void main(String[] args) {

        // array of Student objects
        Student[] learners = new Student[3];

        // assigning values
        learners[0] = new Student("Guru", 22);
        learners[1] = new Student("Gayu", 20);
        learners[2] = new Student("Kavin", 18);

        // looping through array and displaying data
        for (int i = 0; i < learners.length; i++) {
            learners[i].display();
        }
    }
}
