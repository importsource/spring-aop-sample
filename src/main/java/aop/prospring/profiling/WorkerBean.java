package aop.prospring.profiling;

/**
 * Created by yoyojyv on 2014. 2. 27..
 */
public class WorkerBean {

    public void doSomeWork(int noOfTimes) {
        for (int x = 0; x < noOfTimes; x++) {
            work();
        }
    }

    private void work() {
        System.out.print("");
    }

}
