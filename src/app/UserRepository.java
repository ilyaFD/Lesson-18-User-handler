package app;

import java.util.List;

public class UserRepository {
    private final List<User> users = List.of(
            new User(99, "First User", "first.user@gmail.com"),
            new User(86, "Secont User", "seconf.user@gmail.com"),
            new User(12, "Third User", "third.user@gmail.com")
    );
    public List<User> getUsers() {
        return this.users;
    }
}
