public class UserManager {
    public void login(User user) {
        System.out.println(user.getFullName() + "giriş yapıldı.");
    }

    public void logins(User[] users) {
        for (User user : users) {
            login(user);
        }
    }
}
