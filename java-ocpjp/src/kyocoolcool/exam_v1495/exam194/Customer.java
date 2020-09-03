package kyocoolcool.exam_v1495.exam194;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/9/1 下午 11:08
 **/
public class Customer {
    private String fName;
    private String lName;
    private static int count;
    String aa;

    public Customer(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    {
     aa="hello";
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }

    public String getA() {
        return aa;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Larry", "Smith");
        Customer c2 = new Customer("Pedro", "Gonzales");
        Customer c3 = new Customer("Penny", "Jones");
        Customer c4 = new Customer("Lars", "Svenson");
        c4 = null;
        c3 = c2;
        System.out.println(Customer.getCount());
        System.out.println(c1.aa);
    }
}