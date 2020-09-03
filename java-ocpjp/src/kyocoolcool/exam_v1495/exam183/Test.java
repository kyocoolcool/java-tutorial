package kyocoolcool.exam_v1495.exam183;

import java.io.File;
import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 08:52
 **/


public class Test {
    public static void recDelete(String dirName) throws IOException {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0){
            for (File aFile : listOfFiles) {
                if (!aFile.isDirectory()) {
                    if (aFile.getName().endsWith(".class"))
                        aFile.delete();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Test.recDelete("ttt");
    }
}