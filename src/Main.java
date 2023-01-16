public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marco");
        System.out.println(student1.name);

        Teacher teacher = new Teacher();
        teacher.assignGrade(student1, 30);

        System.out.println(student1.grade);

        System.out.println(Teacher.somma(5, 8));
    }
}