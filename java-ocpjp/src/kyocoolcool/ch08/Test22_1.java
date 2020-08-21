package kyocoolcool.ch08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test22_1
 * @description
 * @date 2020/8/7 2:06 PM
 **/

public class Test22_1 extends Test22 implements Serializable{
//     String name;

    {
        this.name = "CCC";
    }

    public Test22_1() {
    }

    public Test22_1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test22_1{" +
                "name='" + name + '\'' +
                '}';
    }

    public static List<Test22_1> getAnimal(File file) throws IOException {
        final ArrayList<Test22_1> lists = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                if (o instanceof Test22_1) {
                    lists.add((Test22_1) o);
                }
            }
        } catch (Exception e) {
            System.out.println("ClassNotFoundException");
        }
        return lists;
    }

    public static void createAnimalFile(List<Test22_1> list, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Test22_1 test22_1 : list) {
                oos.writeObject(test22_1);
            }
        } catch (IOException e) {
            System.out.println("error at createAnimalFile");
        }
    }

    public static void main(String[] args) throws IOException {
        final Test22_1 test22 = new Test22_1("XXXXX");
        final ArrayList list2 = new ArrayList();
        list2.add(test22);
        File file = new File("/Users/chris/git/java-tutorial/java-ocpjp/resources/test2.data");
        createAnimalFile(list2, file);
        System.out.println(getAnimal(file));
    }
}
