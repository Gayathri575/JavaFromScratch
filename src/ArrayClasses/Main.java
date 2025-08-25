package ArrayClasses;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    int age;
    String Name, Address;

    Student(int age, String Name, String Address) {
        this.age = age;
        this.Name = Name;
        this.Address = Address;
    }

    public String toString() {
        return this.age + " " + this.Name + " " + this.Address;
    }
}

class comparatorSorting implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.age - b.age; // age la ascending order sort
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] arr = {
                new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")
        };

        System.out.println("Before sorting:");
        for (Student s : arr) {
            System.out.println(s);
        }

        Arrays.sort(arr, new comparatorSorting());

        System.out.println("\nAfter sorting by age:");
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
