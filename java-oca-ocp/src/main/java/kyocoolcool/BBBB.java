package kyocoolcool;

/**
 * @ClassName BBBB
 * 
 * @Author Chris Chen
 * @Date 2019/11/13 4:49 PM
 * @Version 1.0
 **/

class BBBB {
    public BBBB() {
        System.out.println("66666");
    }

    Integer age;

    {
        System.out.println("hey you");
    }

    {
        System.out.println();
    }

    {
        System.out.println("age1:" + age);
    }

    {
        age = 10_0_00_0;
        System.out.println("age2:" + age);
    }


    public int eat(int number) {
        if (number > 10) {
            int a = 0;
            {
                int b = 5;
                a = b;
                System.out.println(b);
            }
            System.out.println(a);
            return 5;
        }
        return 40;
    }

    public static void main(String[] args) {
        final BBBB AAAAA = new BBBB();
        AAAAA.eat(20);

    }
}

class H {

}