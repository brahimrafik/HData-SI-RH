package controllers;

import cors.CorsAction;
import dao.UnknownUsername;
import dao.UserDAO;
import model.User;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import security.Auth;

public class AuthController extends Controller {

    //Takes username and password and returns JWT
    @With(CorsAction.class)
    public Result login(String username,String password) {
        User user = null;
        try {
            user = new UserDAO().getByUsername(username);
        } catch (UnknownUsername unknownUsername) {
            return unauthorized("unknown_username");
        }
        Auth auth = new Auth();
        if( auth.authentify(user,password) == false ) return unauthorized("wrong_credentials");
        else return ok(auth.generateJWT(user));
    }

}
