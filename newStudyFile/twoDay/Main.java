package newStudyFile.twoDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품 타입 = ");
        String wareStr = sc.next();
        System.out.print("배송 방식 = ");
        String deliveryStr = sc.next();
        
        sc.close();

        WareFactory factory = new WareFactory();
        Ware ware = factory.makeWareFactory(wareStr);
        DeliveryFactory dFactory = new DeliveryFactory();
        DeliveryStrategy delivery = dFactory.createDelivery(deliveryStr);

        ware.getWare();
        delivery.delivery();
    }
}
