package Concurrent23;

/**
 * @ClassName Singleton
 * @Description 多thread安全單例模式(無LazyLoad)
 * @Author kyocoolcool
 * @Date 2019-08-04 15:58
 * @Version 1.0
 **/

public class Singleton {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }

    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setName("小白");
        System.out.println(singleton);
        System.out.println("---------------------");
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);
    }
}