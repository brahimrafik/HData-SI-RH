package dao;

import model.User;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by root on 23/03/16.
 */
public class UserDAO{
    public User getByUsername(String username) throws UnknownUsername{
        return new User(username,"xxx", Arrays.asList("admin","user"));
    }
}
