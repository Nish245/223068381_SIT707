package web.service;

/**
 * Business logic to handle login functions.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     */
    public static boolean login(String username, String password, String dob) {
        return "ahsan".equals(username) && 
               "ahsan_pass".equals(password) && 
               "2000-01-01".equals(dob);
    }
}
