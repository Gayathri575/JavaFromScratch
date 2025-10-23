package oct23;

public class Person {

    // Private members (hidden from outside)
    private int socialID;
    private String name;

    // Constructor
    public Person(String name, int id)
    {
        this.name = name;
        this.socialID = id;
    }

    // Getter for name
    public String getName() { return name; }

    // Setter for name
    public void setName(String newName)
    {
        this.name = newName;
    }

    // Validates the socialID
    public boolean validateID()
    {
        return socialID >= 0 && socialID <= 1001;
    }

    public static void main(String[] args)
    {
        Person p1 = new Person("Geek", 503);

        if (!p1.validateID()) {
            System.out.println("Invalid SocialID");
        }

        System.out.println("Name: " + p1.getName());
    }
}