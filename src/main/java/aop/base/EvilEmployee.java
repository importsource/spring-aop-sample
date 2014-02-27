package aop.base;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class EvilEmployee implements Employee {

    @Override
    public void work() {
        System.out.println("일을 대충합니다. 아 졸려~");
    }

    @Override
    public void playGame() {
        System.out.println("몰래 게임을 합니다.");
    }
}
