package kyocoolcool.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className FileOwnerTest
 * @description
 * @date 2020/8/11 3:33 PM
 **/

public class FileOwnerTest {
    public static void main(String[] args) {
        try {
// Read owner of file
            Path path = Paths.get("/Users/chris/Documents/技能樹.PNG");
            System.out.println(Files.getOwner(path).getName());
// Change owner of file
            UserPrincipal owner = path.getFileSystem()
                    .getUserPrincipalLookupService().lookupPrincipalByName("chris");
            Files.setOwner(path, owner);
// Output the updated owner information
            System.out.println(Files.getOwner(path).getName());
        } catch (IOException e) {
            System.out.println("error");
// Handle file I/O exception...
        }
    }
}
