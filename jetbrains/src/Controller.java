

public class Controller {


    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOimpl();
        for(Student student : studentDAO.getAllStudents()){
            System.out.println("Student: [RollNo : " + student.getRollNo() + "Name : " + student.getName() + " ]");
        }
        //update student
        Student student =studentDAO.getAllStudents().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        //get the student
        studentDAO.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

        //delete from database
        studentDAO.getStudent(1);
        studentDAO.deleteStudent(student);
    }
}






