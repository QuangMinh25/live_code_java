package learn.oop;

public class OOP {
    public static void main(String[] args) {
        Person person = new Person("Minh", 30);
        person.setAge(20);
        person.setName("Minh");
        Student student = new Student("Hoc", 20, "Computer Science");
        Teacher teacher = new Teacher("Nghia", 35, "Mathematics");

        person.introduce();
        student.introduce();
        teacher.introduce();
    }
}
