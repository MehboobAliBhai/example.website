public class Encapsulation {
    private String name1;
    private int age;
    private String gender;

    public void encapsulation() {
        this.name1 = "Goru Waseem";
        this.age = 34;
        this.gender = "Male";
    }
    public void encapsulation (String name, int age, String gender) {
        this.name1 = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name1;
    }
    public int getAge() {
        return age;
    }
    public String getGender(){
        return gender;
    }
}
