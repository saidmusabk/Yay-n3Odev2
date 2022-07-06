public class InstructorManager extends UserManager {
    @Override
    public void login(User user) {
        System.out.println(user.getFullName() + "giriş yapıldı.");
    }

    public void addCourse() {
        System.out.println("Kurs Eklendi");
    }

}
