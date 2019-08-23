package Concurrent23;

/**
 * @ClassName Singleton2
 * @Description 多thread安全單例模式(LazyLoad + Synchronized)
 * @Author kyocoolcool
 * @Date 2019-08-04 15:58
 * @Version 1.0
 **/

public class Singleton2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static Singleton2 instance;


    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton2{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Singleton2 singleton = Singleton2.getInstance();
        singleton.setName("小白");
        System.out.println(singleton);
        System.out.println("---------------------");
        for (int i = 0; i < 10; i++) {
            var ii=i;
            new Thread(()->{
                if(ii==5)singleton.setName("小黑");
                System.out.println(Singleton2.getInstance());
            }).start();
        }
    }
}