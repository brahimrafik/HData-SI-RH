package security;

import model.User;

import java.util.Date;

/**
 * Created by root on 24/03/16.
 */
public class JWT {

    private User user;
    private Date expirationDate;

    public JWT() {
    }

    public JWT(User user, Date expirationDate) {
        this.user = user;
        this.expirationDate = expirationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
