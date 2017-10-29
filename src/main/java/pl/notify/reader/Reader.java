package pl.notify.reader;

import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

import java.io.IOException;
import java.util.List;


public interface Reader {
    List<Notification> getNotifications() throws IOException;
}
