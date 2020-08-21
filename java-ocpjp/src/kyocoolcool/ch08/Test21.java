package kyocoolcool.ch08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className Test21
 * @description
 * @date 2020/8/7 11:47 AM
 **/

public class Test21 implements Serializable{
    private static final long serialUID = 1L;
    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    private List<Dog> friends =new ArrayList<>();
    private Object tail = null;

    {
        age = 10;
    }

    public Test21() {
        this.name = "Sophia";
    }

    public List<Dog> getFriends() {
        return friends;
    }

    public void setFriends(List<Dog> friends) {
        this.friends = friends;
    }

    public static List<Test21> getAnimal(File file) throws IOException {
        final ArrayList<Test21> lists = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                if (o instanceof Test21) {
                    lists.add((Test21) o);
                }
            }
        } catch (Exception e) {
            System.out.println("ClassNotFoundException");
        }
        return lists;
    }

    public static void createAnimalFile(List<Test21> list, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Test21 test21 : list) {
                oos.writeObject(test21);
            }
        } catch (IOException e) {
            System.out.println("error at createAnimalFile");
        }
    }

    public static void main(String[] args) throws IOException {
        final ArrayList<Test21> animals = new ArrayList<>();
        final Test21 test21 = new Test21();
        final ArrayList arrayList = new ArrayList();
        final Dog dog = new Dog(("hello"));
        arrayList.add(dog);
        test21.setFriends(arrayList);
        animals.add(test21);
        File file = new File("/Users/chris/git/java-tutorial/java-ocpjp/resources/test.data");
        createAnimalFile(animals, file);
        System.out.println(getAnimal(file));
    }

    @Override
    public String toString() {
        return "Test21{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                ", tail=" + tail +
                '}';
    }
}
