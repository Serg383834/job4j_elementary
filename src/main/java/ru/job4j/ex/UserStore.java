package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        // findUser - если пользователя не нашли в списке,
        // то кинуть исключение UserNotFoundException
        User rsl = null;
        for (User i: users) {
            if (i.getUsername().equals(login)) {
                rsl = i;
                break;
            }
        }
        if (rsl == null) {
            throw  new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        //validate - если пользователь не валидный или если имя пользователя состоит
        // из менее трех символов, то кинуть исключение UserInvalidException
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("the number of characters in the username field is less than 3");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

