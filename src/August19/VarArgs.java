package August19;

public class VarArgs {

    // Method to accept names + marks
    public static void KamalaClassTeacher(String[] names, int... marks) {
        for(int i = 0; i < names.length; i++) {
            int mark = (i < marks.length) ? marks[i] : 0; // If marks missing, 0 assign pannidum
            System.out.println("Name: " + names[i] + ", Marks: " + mark);
        }
        System.out.println();
    }

    public static void Class12(int... n) {
        for(int marks : n) {
            System.out.println(marks);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        KamalaClassTeacher(new String[]{"Gayu","Steve","Kumar","Vimal"}, 78, 89, 99, 90);
        KamalaClassTeacher(new String[]{"Gayu","Steve","Kumar","Vimal","Vijay"}, 78, 89, 99, 90, 100);
        Class12(78, 89, 99, 90, 100);
    }
}
