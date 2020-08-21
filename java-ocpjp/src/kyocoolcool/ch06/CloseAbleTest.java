package kyocoolcool.ch06;


import java.io.Closeable;
import java.net.SocketException;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className CloseAbleTest
 * @description
 * @date 2020/7/27 11:17 AM
 **/

public class CloseAbleTest implements Closeable {

    @Override
    public void close() throws SocketException {
        System.out.println("closing");
        throw new SocketException();
    }

    public static void main(String[] args) {
        try (final CloseAbleTest closeAbleTest = new CloseAbleTest()){
            System.out.println("starting");
        } catch (SocketException e) {
            System.out.println("catch ioException");
        }
    }
}
