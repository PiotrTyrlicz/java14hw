package pl.notify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.notify.app.NotificationFacade;
import pl.notify.logger.ConsoleLogger;
import pl.notify.logger.FileLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.ConsolNotificationReader;
import pl.notify.reader.FileNotificationReader;
import pl.notify.reader.Reader;
import pl.notify.sender.EmailNotificationSender;
import pl.notify.sender.Sender;
import pl.notify.sender.SmsNotificationSender;

//@Configuration
public class AppConfig {

//    @Bean
//    public NotifyLogger logger() {
//        FileLogger fileLogger = new FileLogger();
//        return fileLogger;
//    }
    @Bean
    public NotifyLogger logger() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        return consoleLogger;
    }



    @Bean
    public Reader reader1() {
        FileNotificationReader fileNotificationReader = new FileNotificationReader();
        return fileNotificationReader;
    }

    @Bean
    public Reader reader() {
        ConsolNotificationReader consolNotificationReader = new ConsolNotificationReader();
        return consolNotificationReader;
    }


//    @Bean
//    public EmailNotificationSender sender() {
//        EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
//        return new EmailNotificationSender();
//    }


    @Bean
    public SmsNotificationSender sender() {
        SmsNotificationSender emailNotificationSender = new SmsNotificationSender();
        return new SmsNotificationSender();
    }


    @Bean
    public NotificationFacade facade(NotifyLogger logger, Reader reader, Sender sender) {
        NotificationFacade notificationFacade = new NotificationFacade(reader, sender, logger);
        return notificationFacade;
    }

}
