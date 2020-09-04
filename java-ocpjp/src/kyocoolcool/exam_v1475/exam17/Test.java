package kyocoolcool.exam_v1475.exam17;

import lombok.extern.java.Log;

import java.util.ArrayDeque;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 4:28 PM
 **/
@Log
public class Test {
    public static void main(String[] args) {
        final ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Susan");
        deque.add("Allan");
        deque.push("hello");
        deque.add("David");
        log.info(deque.pop());
        log.info(deque.remove());
        log.info(deque.toString());

    }
}
