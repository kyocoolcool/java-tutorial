package kyocoolcool.ch07;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className CallableVSSupplier
 * @description
 * @date 2020/7/28 4:12 PM
 **/

public class CallableVSSupplier {
    public static void useCallable(Callable<Integer> callable) {
//        final Integer call = callable.call();
//        System.out.println(call);
        System.out.println("callable");
    }

    public static void useSupplier(Supplier<Integer> supplier) {
        System.out.println("supplier");
    }

    public static void use(Callable<Integer> callable) {
        System.out.println("callable2");
    }

    public static void use(Supplier<Integer> supplier) {
        System.out.println("supplier2");
    }


    public static void main(String[] args) {
//        CallableVSSupplier.useCallable(() -> {
//            int i = 1;
//            if (i != 0) {
//                throw new ArrayIndexOutOfBoundsException();
//            }
//            return 5;
//        });
//        CallableVSSupplier.useSupplier(()->{
//            throw new ArrayIndexOutOfBoundsException();
////            return null;
//        });
//
//        use((Callable<Integer>) ()->{
//            throw new IOException();
//        });
//
//        use((Supplier<Integer>) ()->{
//            try {
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("error");
//            }
//            return 2;
//        });
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
//        try {
//            final Future<Integer> submit = executorService.submit(() -> 13 + 10);
//            System.out.println(submit.get());
//        } catch (ExecutionException | InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            if (executorService != null)
//                executorService.shutdown();
//        }

        final Future<?> hello = executorService.submit(() -> {
            throw new IOException();
//            return null;
        });
//        System.out.println(hello.getClass());
    }
}
