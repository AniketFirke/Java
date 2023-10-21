

package example_gradebook_paraconst;

public class Example_GradeBook_ParaConst {

    public static void main(String[] args) {
        
        GradeBook gradeBook1 = new GradeBook("OOP with Java");
        GradeBook gradeBook2 = new GradeBook("Maths-IV");
        
        System.out.println("GradeBook1 course name =" + gradeBook1.getCourseName());
        System.out.println("GradeBook2 course name =" + gradeBook2.getCourseName());
    }
}
