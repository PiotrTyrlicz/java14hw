package pl.notify.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

@Component

public class SmsNotificationSender implements Sender  {

    public void send(Notification notification) {
        System.out.println("Sending SMS to " + notification.getTelephone());
    }
}
