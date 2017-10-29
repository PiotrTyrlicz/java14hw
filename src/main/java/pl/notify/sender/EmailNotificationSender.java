package pl.notify.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

@Component
@Primary
public class EmailNotificationSender implements Sender {

    public void send(Notification notification) {
        System.out.println("Sending email to " + notification.getEmail());
    }

}
