package kyocoolcool;

/**
 * @ClassName Some1
 * 
 * @Author Chris Chen
 * @Date 2019/11/24 11:34 PM
 * @Version 1.0
 **/

public class Some1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //Case1.直接載入靜態區塊
//        try {
//
//            System.out.println("載入Some");
//            Class c = Class.forName("kyocoolcool.Some");
//            System.out.println("使用Some宣告參考名聲");
//            Some test = null;
//
//            System.out.println("使用kyocoolcool.Some建 立物件");
//            test = new Some();
//        } catch (ClassNotFoundException e) {
//            System.out.println("找不到指定的類別");
//        }
        //Case2.產生物件時才執行靜態區塊
        try {
            System.out.println("載入kyocoolcool.Some");
            Class c = Class.forName("kyocoolcool.Some",
                    false, // 載入類別時不執行靜態方法
                    Thread.currentThread().getContextClassLoader());

//            final Some o = (Some) c.newInstance();
//            System.out.println(o.name);
//            final Some some = Some.class.newInstance();
//            System.out.println(some.name);

            System.out.println("使用kyocoolcool.Some宣告參考名稱");
            Some test = null;

            System.out.println("使用kyocoolcool.Some建 立物件");
            test = new Some();
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        }
    }
}