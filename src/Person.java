public class Person {
    //Data
    private String name;
    private int age;
    private String email;

    //Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Methods

    @Override
    public String toString() {
        return "Person{name='" + this.name + "', age=" + this.age + "}";
    }
}
