package aop.prospring;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class ErrorBean {

    public void errorProneMethod() throws Exception {
        throw new Exception("Foo");
    }

    public void otherErrorProneMethod() throws IllegalArgumentException {
        throw new IllegalArgumentException("Bar");
    }

}
