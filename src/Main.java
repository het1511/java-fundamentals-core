public class Main {
    static void main(String[] args) {
        Person p1 = new Person("het", 22, "het987pat@gmail.com");
        System.out.println(p1);

        try {
            Person p2 = new Person("het", 22, "het987pat@gmail.com");
            p2.setAge(-23);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
