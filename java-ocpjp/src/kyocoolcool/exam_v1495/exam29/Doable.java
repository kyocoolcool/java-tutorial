package kyocoolcool.exam_v1495.exam29;

public interface Doable {
    public void doSomething(String s);

    public abstract class Task implements Doable {
        public void doSomethingElse(String s) {
        }
    }

//        public abstract class Work implements Doable {
//
//        public abstract void doSomething(String s) {
//        }
//
//        public void doYourThing(Boolean b) {
//        }
//    }
//public class Job implements Doable {public void doSomething(Integer i) { }}
//    public class Action implements Doable {
//
//        public void doSomething(Integer i) {
//        }
//
//        public String
//        doThis(Integer j) {
//        }
//    }

//    public class Do implements Doable {
//        public void doSomething(Integer i) {
//        }
//
//        public void doSomething(String s) {
//        }
//
//        public void doThat(String s) {
//        }
//    }

    public class He extends Task {
        @Override
        public void doSomething(String s) {

        }
    }

}
