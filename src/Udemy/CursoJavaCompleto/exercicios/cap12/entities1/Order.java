package Udemy.CursoJavaCompleto.exercicios.cap12.entities1;

import Udemy.CursoJavaCompleto.exercicios.cap12.entities.enums.OrdeStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrdeStatus status;

    public Order(Integer id, Date moment, OrdeStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public OrdeStatus getStatus() {
        return status;
    }

    public void setStatus(OrdeStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}

