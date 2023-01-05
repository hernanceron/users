package org.sample.users.repository;

import org.sample.users.entidades.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<User> users = new ArrayList<User>();
    static {
        users.add(new User(1,"Hernan",39));
        users.add(new User(2, "Johanna", 33));
        users.add(new User(3, "Peggy", 11));
    }

    public List<User> findAllUsers(){
        return users;
    }
}
