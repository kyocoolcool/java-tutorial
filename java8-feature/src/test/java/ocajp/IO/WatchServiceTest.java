package ocajp.IO;

import java.io.IOException;
import java.nio.file.*;

/**
 * @ClassName WatchServiceTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-17 11:03
 * @Version 1.0
 **/

public class WatchServiceTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get("/Users/chris/Documents/Photos");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        path.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);
        while (true) {
            System.out.println("系統監聽中");
            WatchKey watchKey = watchService.take();
            for (WatchEvent<?> event : watchKey.pollEvents()) {
                System.out.println("事件:" + event.kind().name() + "," + "資源" + event.context().toString());
            }
            watchKey.reset();
        }
    }
}