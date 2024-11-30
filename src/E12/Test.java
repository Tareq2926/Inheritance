package E12;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tarek",2002);
        Student student = new Student("Ahmed",2001,"CSE");
        Instructor instructor = new Instructor("Tasnim",2000,3000);

        System.out.println(person);
        System.out.println(student);
        System.out.println(instructor);
    }
}
