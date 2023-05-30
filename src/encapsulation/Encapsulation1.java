package encapsulation;

public class Encapsulation1 {
    private String name;
    private int age;
    private String gender;

    public Encapsulation1() {
        System.out.println("osman");
        this.name = "John";
        this.age = 35;
        this.gender = "Male";
    }

    public Encapsulation1(String name, int age, String gender) {
        this();
        System.out.println(getName());
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}
