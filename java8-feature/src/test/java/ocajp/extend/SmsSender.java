package ocajp.extend;

/**
 * @ClassName SmsSender
 * 
 * @Author Chris Chen
 * @Date 2019-05-30 14:33
 * @Version 1.0
 **/

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }

    public void Hi() {
        System.out.println("hi");
    }

    @Override
    public void Good() {
        System.out.println("SmsSender Good");
    }

    @Override
    public void good() {
        System.out.println("SmsSender Good");
    }
}