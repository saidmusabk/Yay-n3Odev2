public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFullName("Ahmet");
        instructor.setInstructorNumber(1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);
        instructorManager.addCourse();

        Student student = new Student();
        student.setId(2);
        student.setFullName("Said");
        student.setUserNumber(1);

        StudentManager studentManager = new StudentManager();
        studentManager.login(student);
        studentManager.chooseCourse();

        UserManager userManager = new UserManager();
        User[] users = {instructor, student};
        userManager.logins(users);
    }
}
