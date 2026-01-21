//Write a Java program where:
//password is private
//allow password change only after validation
//password cannot be displayed directly

package encapsulation;

public class PasswordProtection {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean changePassword(String currentPassword, String newPassword) {
		if (this.password != null && this.password.equals(currentPassword)) {
			setPassword(newPassword);
			return true;
		}
		return false;
	}

}
