package Oct11;
//interface
interface Details{
    //abstract Method
    void StudentDetails();
}

//class implements interface
class StudentInfo implements Details{
    String Name ;
    int [] marks ;
    char Grade ;

    //constructor
    StudentInfo(String Name , int[] marks , char Grade ){
        this.Name=Name;
        this.marks=marks;
        this.Grade=Grade;
    }
    //interface implements method
    public void StudentDetails() {
        System.out.println("Name :" + Name);
        System.out.println("Marks :" + " ");

        int total = 0;  // Step 1: Initialize total
        for (int mark : marks) {  // Step 2: Loop through each mark
            System.out.println("Mark: " + mark );  // print each mark
            total += mark;  // Step 3: Add to total
        }

// Step 4: Calculate average
        double average = (double) total / marks.length;

// Step 5: Print results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("A");
        }
        else if (average >= 75) {
            System.out.println("B");
        }
        else if (average >= 55) {
            System.out.println("C");
        }
        else if (average >= 35) {
            System.out.println("D");
        }
        else {
            System.out.println("fail");
        }
        System.out.println("----------------------");
    }
}

//main method
        public class Student{
           public static void main(String [] args){
               int[] m1 = {99,78,67,90,89,50};
               int[] m2 = {90,78,96,45,90,34};
               int[] m3 = {67,56,89,45,34,89};

               StudentInfo s1 = new StudentInfo("Gayathiri",m1,'A' );
               StudentInfo s2 = new StudentInfo("Ganesh",m2,'B' );
               StudentInfo s3 = new StudentInfo("Girish",m3,'C' );

               s1.StudentDetails();
               s2.StudentDetails();
               s3.StudentDetails();
           }
        }
