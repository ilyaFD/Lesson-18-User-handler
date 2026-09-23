package app;

import java.util.List;
import java.util.Optional;

public class UserHandler {
    public Optional<User> findUserById(int id, List<User> users) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
    public Optional<User> findUserByEmail(String email, List<User> users) {

        return users.stream()
                .filter(user -> user.getEmail() == email)
                .findFirst();
    }
    public Optional<List<User>> findAllUsers(List<User> users) {
        if (users.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(users);
    }
}
