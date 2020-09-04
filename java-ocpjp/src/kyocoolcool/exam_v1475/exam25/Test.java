package kyocoolcool.exam_v1475.exam25;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/4 5:17 PM
 **/
class DataConverter implements AutoCloseable{
    public void copyFlatFilesToTables() {

    }

    @Override
    public void close() throws Exception{
        throw new RuntimeException();
    }
}
public class Test {
    public static void main(String[] args) throws Exception {
        try (DataConverter dataConverter = new DataConverter()) {
            dataConverter.copyFlatFilesToTables();
        }

    }
}
