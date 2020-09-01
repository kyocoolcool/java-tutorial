package ocajp.extend;

/**
 * @ClassName SmsSender
 * 
 * @Author Chris Chen
 * @Date 2019-05-30 14:33
 * @Version 1.0
 **/

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }

    @Override
    public void Good() {
        System.out.println("MailSender Good");

    }

    @Override
    public void good() {
        System.out.println("MailSender good");
    }
}