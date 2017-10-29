package pl.notify.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ConsoleLogger implements NotifyLogger {
    @Autowired
    public void log(String message) {
        System.out.println("LOG INFO " + System.currentTimeMillis() + " " + message);
    }

}
