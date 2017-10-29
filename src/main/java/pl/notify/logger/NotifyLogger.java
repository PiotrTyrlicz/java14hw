package pl.notify.logger;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by slawekludw on 26/10/2017.
 */
public interface NotifyLogger {

    void log(String message);
}
