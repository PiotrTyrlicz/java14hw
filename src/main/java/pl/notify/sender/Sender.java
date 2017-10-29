package pl.notify.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

@Component

public interface Sender {

     void send(Notification notification);
}
