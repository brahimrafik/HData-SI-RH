package model;

import java.util.List;

/**
 * Created by root on 23/03/16.
 */
public class User {
    private String username,hash;
    private List<String> roles;

    public User() {
    }

    public User(String username, String hash, List<String> roles) {
        this.username = username;
        this.hash = hash;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (hash != null ? !hash.equals(user.hash) : user.hash != null) return false;
        return roles != null ? roles.equals(user.roles) : user.roles == null;

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (hash != null ? hash.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", hash='" + hash + '\'' +
                ", roles=" + roles +
                '}';
    }
}
