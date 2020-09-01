package ocajp.extend;

/**
 * @ClassName SendFactory
 *
 * @Author Chris Chen
 * @Date 2019-05-30 14:57
 * @Version 1.0
 **/

public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            return null;
        }
    }
}