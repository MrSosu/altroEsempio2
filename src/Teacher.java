public class Teacher {

    public String teacherName;

    public Teacher() {
        System.out.println("il prof è stato creato");
    }

    public void assignGrade(Student student, int finalGrade) {
        student.grade = finalGrade;
    }

    public static int somma(int x, int y) {
        return x+y;
    }

    public static int somma(int x, int y, int z) {
        return x+y+z;
    }

    public static double somma(double x, double y) {
        return x+y;
    }

}
