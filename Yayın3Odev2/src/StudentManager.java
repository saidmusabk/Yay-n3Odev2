public class StudentManager extends UserManager {
    @Override
    public void login(User user) {
        System.out.println(user.getFullName() + "giriş yapıldı.");
    }

    public void chooseCourse() {
        System.out.println("Kurs Seçildi.");
    }

}

