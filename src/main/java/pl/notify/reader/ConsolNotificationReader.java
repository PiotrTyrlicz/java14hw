package pl.notify.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Primary
public class ConsolNotificationReader implements Reader {
    @Autowired
    public List<Notification> getNotifications() throws IOException {
        String username;
        String email;
        String telephone;
        String content;

        List<Notification> notifications = new ArrayList<>();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj next albo exit");
        String linia=scan1.nextLine();
        while(!linia.equals("exit")) {
            System.out.println("Podaj login");
            username = scan1.nextLine();
            System.out.println("Podaj emial");
            email = scan1.nextLine();
            System.out.println("Podaj telefon");
            telephone = scan1.nextLine();
            System.out.println("Podaj tekst");
            content = scan1.nextLine();

            Notification notificaion = new Notification(username, email, telephone, content);
            notifications.add(notificaion);

            System.out.println("Podaj next albo exit");
            linia=scan1.nextLine();
        }



        return notifications;
    }
}
