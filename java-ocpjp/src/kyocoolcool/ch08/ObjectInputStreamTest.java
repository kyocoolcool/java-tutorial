package kyocoolcool.ch08;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className ObjectInputStreamTest
 * @description
 * @date 2020/8/6 10:07 AM
 **/

public class ObjectInputStreamTest {
    public static List<Animal> getAnimal(File file) throws IOException {
        final ArrayList<Animal> animals = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                if (o instanceof Animal) {
                    animals.add((Animal) o);
                }
            }
        } catch (Exception e) {
            System.out.println("ClassNotFoundException");
        }
        return animals;
    }

    public static void createAnimalFile(List<Animal> animalLiast, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Animal animal : animalLiast) {
                oos.writeObject(animal);
            }
        } catch (IOException e) {
            System.out.println("error at createAnimalFile");
        }
    }

    public static void main(String[] args) throws IOException {
        final ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("happy", 10));
//        final ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog("happy"));
        animals.add(new Animal("very", 20));
        File file = new File("/Users/chris/git/java-tutorial/java-ocpjp/resources/animal.data");
        createAnimalFile(animals, file);
        System.out.println(getAnimal(file));

        System.out.println(System.getProperty("line.separator").toString());


    }


}
