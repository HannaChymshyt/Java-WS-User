package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        initData();
    }

    private static void initData() {

        User builder = new User();
        builder.setName("Gloria");
        builder.setPhone("1-587-998-2856");
        builder.setGender(Gender.FEMALE);
        builder.setAge(33);

        users.put(builder.getName(), builder);


        User steward = new User();
        steward.setName("James");
        steward.setPhone("1-403-928-1347");
        steward.setGender(Gender.MALE);
        steward.setAge(60);

        users.put(steward.getName(), steward);


        User ranger = new User();
        ranger.setName("Georgiana");
        ranger.setPhone("1-587-217-8241");
        ranger.setGender(Gender.FEMALE);
        ranger.setAge(25);

        users.put(ranger.getName(), ranger);

    }

    public User findUser(String name) {
        return users.get(name);
    }

}
