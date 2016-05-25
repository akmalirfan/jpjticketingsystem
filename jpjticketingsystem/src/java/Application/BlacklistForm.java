package Application;

import Business.User;
//import Middleware.mainDB;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Akmal Irfan
 * @version 1.0
 * @created 21-Apr-2016 09:43:48
 */
public class BlacklistForm extends HttpServlet {
        private static final long serialVersionUID = 1L;

	public BlacklistForm() {
            super();
        }

	public void finalize() throws Throwable {

	}

	public void refresh(){

	}

	public void showForm(){

	}

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            User[] users = mainDB.getBlacklistedUsers(response);
        }
}