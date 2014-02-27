package aop.base;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class ExcellentEmployee implements Employee {

    @Override
    public void work() {
        System.out.println("일을 열심히 합니다.");
    }

    @Override
    public void playGame() {
        System.out.println("게임은 하지 않습니다.");
    }
}
