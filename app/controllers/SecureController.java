package controllers;

import cors.CorsAction;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import security.Secure;

/**
 * Created by root on 23/03/16.
 */
@With(CorsAction.class)
@Secure({"superadmin"})
public class SecureController extends Controller {

    public Result secure() {

        return ok("secure action");
    }
}
