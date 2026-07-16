package Udemy.CursoJavaCompleto.exercicios.cap12;

import Udemy.CursoJavaCompleto.exercicios.cap12.entities.enums.OrdeStatus;
import Udemy.CursoJavaCompleto.exercicios.cap12.entities1.Order;

import java.util.Date;

public class Program {
public static void main(String [] args){


    Order order = new Order(1080,new Date(), OrdeStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrdeStatus os1 = OrdeStatus.DELIVERED;
    OrdeStatus os2 = OrdeStatus.valueOf("DELIVERED");
    System.out.println(os1);
    System.out.println(os2);
}
}
