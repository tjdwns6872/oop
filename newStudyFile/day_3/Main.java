package newStudyFile.day_3;

import java.util.Scanner;

import newStudyFile.day_3.Payment.PaymentContext;
import newStudyFile.day_3.Payment.PaymentFactory;
import newStudyFile.day_3.notification.NotificationContext;
import newStudyFile.day_3.notification.NotificationFactory;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품: ");
        String ware = sc.next();

        System.out.print("결제 방식: ");
        String pay = sc.next();

        System.out.print("알림 방식: ");
        String notification = sc.next();

        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentContext paymentContext = new PaymentContext(paymentFactory.createPay(pay));

        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationContext notificationContext = new NotificationContext(notificationFactory.createNotification(notification));

        System.out.println("[상품] "+ware);
        paymentContext.execute();
        notificationContext.execute();
    }
}
