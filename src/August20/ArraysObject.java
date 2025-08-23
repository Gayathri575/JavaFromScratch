package August20;

class Student {
    int marks;
    String names;

    // Constructor (String name, int marks)
    Student(String names, int marks) {
        this.marks = marks;
        this.names = names;
    }

    // toString method
    public String toString() {
        return names + " - " + marks;
    }
}

public class ArraysObject {
    public static void main(String[] args) {
        // Array of Student objects
        Student arr[] = new Student[5];

        arr[0] = new Student("Gayu", 1);
        arr[1] = new Student("Bala", 2);
        arr[2] = new Student("Jimmy", 3);
        arr[3] = new Student("Jacky", 4);
        arr[4] = new Student("Kamala", 5);

        // Print objects
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
