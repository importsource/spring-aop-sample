package aop.schema;

public class HelloByeAspect {

    public void helloBeforeAdvice() {
        System.out.println("안녕하세요.");
    }

    public void byeAfterAdvice() {
        System.out.println("안녕히가세요.");
    }

}
