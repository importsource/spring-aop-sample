package aop.proxy.hello;

/**
 * Created by yoyojyv on 2014. 2. 27..
 *
 * World 메시지만 화면에 출력해 주는 별 것? 없는 클래스.
 */
public class MessageWriter {

    public void writeMessage() {
        System.out.print("World");
    }

    public void writeMessage(String message) {
        System.out.print(message);
    }

}
