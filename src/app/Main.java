package app;


import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int searchId = 99;
        String searchEmail = "third.user@gmail.com";
        String falsySearchEmail = "falsy@gmail.com";
        List<User> users = new UserRepository().getUsers();
        UserHandler handler = new UserHandler();
        UIOperator UI = new UIOperator();

        Optional<User> optionalUserById = handler.findUserById(searchId, users);
        Optional<User> optionalUserByEamil = handler.findUserByEmail(searchEmail, users);
        Optional<User> optionalUserByFalsyEamil = handler.findUserByEmail(falsySearchEmail, users);
        Optional<List<User>> allUsers = handler.findAllUsers(users);

        if (optionalUserById.isPresent()) {
            UI.getExistingOutput(optionalUserById.get().toString());
        } else {
            UI.getEmptyOutput(String.valueOf(searchId));
        }

        if (optionalUserByEamil.isPresent()) {
            UI.getExistingOutput(optionalUserByEamil.get().toString());
        } else {
            UI.getEmptyOutput(searchEmail);
        }

        if (optionalUserByFalsyEamil.isPresent()) {
            UI.getExistingOutput(optionalUserByFalsyEamil.get().toString());
        } else {
            UI.getEmptyOutput(falsySearchEmail);
        }

        if (allUsers.isPresent()) {
            UI.getExistingOutput(allUsers.get().toString());
        } else {
            UI.getEmptyOutput("Users not found");
        }

    }
}
