package Concurrent23;

/**
 * @ClassName Singleton3
 * @Description 多thread安全單例模式(LazyLoad + Synchronized) 優化力度
 * @Author kyocoolcool
 * @Date 2019-08-04 15:58
 * @Version 1.0
 **/

public class Singleton3 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Singleton3 singleton = Singleton3.getInstance();
        singleton.setName("小白");
        System.out.println(singleton);
        System.out.println("---------------------");
        for (int i = 0; i < 10; i++) {
            var ii=i;
            new Thread(()->{
                if(ii==5){
                    singleton.setName("小黑");
                }
                if(ii==8){
                    singleton.setName("小黃");
                }
                System.out.println(Singleton3.getInstance());
            }).start();
        }
    }
}