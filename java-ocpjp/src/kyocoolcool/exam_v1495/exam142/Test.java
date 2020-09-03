package kyocoolcool.exam_v1495.exam142;

import java.io.File;
import java.io.IOException;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/28 3:55 PM
 **/
public class Test {
    public static void recDelete(String dirName) throws IOException {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File aFile : listOfFiles) {
                if (aFile.isDirectory()) {
                    recDelete(aFile.getAbsolutePath());
                } else {
                    if (aFile.getName().endsWith(".java"))
                        aFile.delete();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        recDelete("/Users/chris/git/java-tutorial/java-ocpjp/src/special/exam140/test");
    }
}
