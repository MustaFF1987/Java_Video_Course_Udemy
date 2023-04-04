package basicLessons;

public class Student {
    double studentTicket;
    String name;
    String surname;
    double mathematicsMark;
    double economicsMark;
    double langugeMark;

    double avarageGrade(double mathematicsMark, double economicsMark, double langugeMark){
        return (mathematicsMark+economicsMark+langugeMark)/3;
    }

}

class StudentTest{
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Pavel_Yu";
        student.studentTicket = 12345;

        double average = student.avarageGrade(8.5,9.3,6.4);

        System.out.print("Student " + student.name);
        System.out.println(", ticket nr. " + (int)student.studentTicket);
        System.out.print("Stundent's average grade is: " + (int)average);

    }
}
