package aop.prospring.secure;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class UserInfo {
    private String username;
    private String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
