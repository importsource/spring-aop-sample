package aop.prospring.secure;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * ThreadLocal 은 다음의 링크를 참조. http://javacan.tistory.com/entry/ThreadLocalUsage
 */
public class SecurityManager {

    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<UserInfo>();

    public void login(String username, String password) {
        // assumes that all credentials
        // are valid for a login
        threadLocal.set(new UserInfo(username, password));
    }

    public void logout() {
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }

}
