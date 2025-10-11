package Oct11;

class Company{
    public void work(){
        System.out.println("Employers do they wrk");
    }
}
class Designer extends Company {
    public void UiUx(){
        System.out.println("Plan their work");
    }
    public void Adobe() {
        System.out.println("Use Adobe illustrator");
    }

    @Override
    public void work() {
        System.out.println("Plan their work");
    }
}
class Developer extends Company{
    public void Program(){
        System.out.println("Contribute by coding program");
    }
    public void CodeEditor(){
        System.out.println("Use VsCode , IDE");
    }
    @Override
    public void work() {
        System.out.println("Contribute by coding program");

    }
}

class Testing extends Company{
    public void test(){
        System.out.println("find the bug like Mother-in-law");
    }
    public void Maven(){
        System.out.println("check the code");
    }
    @Override
    public void work() {
        System.out.println("find the bug like Mother-in-law");
    }
}
// main
public class ExplicitDowncasting {
    public static void main(String[] args) {
        // obj creation
        System.out.println("Guess Who I'm I");
        System.out.println("----------------------------------------");

        Company c1 = new Designer();
        Company c2 = new Developer();
        Company c3 = new Testing();

        // c1 → Designer check
        if (c1 instanceof Designer) {
            Designer d1 = (Designer) c1; // safe downcasting
            c1.work();      // calls overridden method
            d1.Adobe();     // child-only method
        }

        // c2 → Developer check
        if (c2 instanceof Developer) {
            Developer d2 = (Developer) c2; // safe downcasting
            c2.work();
            d2.CodeEditor();
        }

        // c3 → Testing check
        if (c3 instanceof Testing) {
            Testing t1 = (Testing) c3; // safe downcasting
            c3.work();
            t1.Maven();
        }
    }
}
