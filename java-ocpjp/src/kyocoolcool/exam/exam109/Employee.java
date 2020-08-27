package kyocoolcool.exam.exam109;

import java.util.Optional;

/**
 * @author Chris Chen https://blog.kyocoolcool.com
 * @version 1.0
 * @since 2020/8/27 3:10 PM
 **/
public class Employee {
    Optional<Address> address;

    Employee(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Address address = new Address();
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        System.out.println(eAddress);
    }
}
class Address {
    String city = "New York";

    public String getCity() {

        return city;}

    public String toString() {
        return city;
    }
}
