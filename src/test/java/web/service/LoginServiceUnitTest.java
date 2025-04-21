package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginServiceUnitTest {

    @Test
    public void testValidLogin() {
        assertTrue(LoginService.login("ahsan", "ahsan_pass", "2000-01-01"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(LoginService.login("wrong_user", "ahsan_pass", "2000-01-01"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(LoginService.login("ahsan", "wrong_pass", "2000-01-01"));
    }

    @Test
    public void testInvalidDob() {
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "1999-12-31"));
    }

    @Test
    public void testAllInvalid() {
        assertFalse(LoginService.login("user", "pass", "1990-01-01"));
    }
}
