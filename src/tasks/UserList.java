package tasks;

import java.util.ArrayList;

public class UserList {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Anna", 18));
        users.add(new User("Sergey", 20));
        users.add(new User("Max", 17));

        for (User user : users){
            if (user.age > 18){
                System.out.println(user);
            }
        }

    }

}
