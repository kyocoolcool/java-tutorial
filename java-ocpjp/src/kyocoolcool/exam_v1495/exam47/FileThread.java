package kyocoolcool.exam_v1495.exam47;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/25 6:02 PM
 **/
public class FileThread implements Runnable {
    String fName;

    public FileThread(String fName) {
        this.fName = fName;
    }

    public void run() {
        System.out.println(fName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("/Users/chris/git/java-tutorial/java-ocpjp/src/kyocoolcool/exam/exam47"));
        listOfFiles.forEach(line -> {
            executor.execute(new
                    FileThread(line.getFileName().toString())); // line n1
        });
        executor.shutdown();
        final boolean b = executor.awaitTermination(3, TimeUnit.SECONDS);// line n2
        System.out.println(b);
    }
}
