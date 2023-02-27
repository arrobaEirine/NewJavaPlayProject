package dao;

import beans.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UserDAO {

    private static final Map<String, User> users = new HashMap<String,User>();

    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public UserDAO(){
        User user1 = new User("001", "Alex", 31);
        User user2 = new User("002", "Bernard", 32);
        User user3 = new User("003", "Charlie", 33);

        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
    }

    public static Future createUser(User user){
        return executor.submit(() -> users.put(user.getId(), user));
    }

    public static Future<User> readUser(String userId){
            return executor.submit(() -> users.get(userId));
    }

    public static Future updateUser(User user){
        return executor.submit(() -> users.put(user.getId(), user));
    }

    public static Future deleteUser(String userId){
        return executor.submit(() -> users.remove(userId));
    }


}
