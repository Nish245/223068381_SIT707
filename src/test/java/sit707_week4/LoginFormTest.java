package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "223068381";
		Assert.assertNotNull("223068381", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Nishant Khamkar";
		Assert.assertNotNull("Nishant Khamkar", studentName);
	}
	
	@Test
    public void testEmptyUsernameAndPassword() {
        LoginStatus status = LoginForm.login("", "");
        Assert.assertFalse("Empty username and password should fail", status.isLoginSuccess());
        Assert.assertEquals("Empty Username", status.getErrorMsg());
    }

    @Test
    public void testEmptyUsernameWrongPassword() {
        LoginStatus status = LoginForm.login("", "wrong");
        Assert.assertFalse("Empty username should fail", status.isLoginSuccess());
        Assert.assertEquals("Empty Username", status.getErrorMsg());
    }

    @Test
    public void testWrongUsernameAndPassword() {
        LoginStatus status = LoginForm.login("wrong", "wrong");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    @Test
    public void testCorrectUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login("admin", "");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Empty Password", status.getErrorMsg());
    }

    @Test
    public void testCorrectUsernameWrongPassword() {
        LoginStatus status = LoginForm.login("admin", "wrong");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    @Test
    public void testWrongUsernameCorrectPassword() {
        LoginStatus status = LoginForm.login("wrong", "admin@123");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    @Test
    public void testCorrectLogin() {
        LoginStatus status = LoginForm.login("admin", "admin@123");
        Assert.assertTrue(status.isLoginSuccess());
        Assert.assertEquals("123456", status.getErrorMsg()); // validation code
    }

    @Test
    public void testValidateCode_Correct() {
        LoginForm.login("admin", "admin@123");
        Assert.assertTrue(LoginForm.validateCode("123456"));
    }

    @Test
    public void testValidateCode_Wrong() {
        LoginForm.login("admin", "admin@123");
        Assert.assertFalse(LoginForm.validateCode("000000"));
    }
}