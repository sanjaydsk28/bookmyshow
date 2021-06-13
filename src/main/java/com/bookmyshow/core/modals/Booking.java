package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking extends Auditable {
    // Atributes
    @Getter @Setter
    private double totalPrice = 0;


    // RelationShip
    @ManyToOne
    @Getter @Setter
    private MovieShow movieShow;

    @OneToMany(mappedBy = "booking")
    @Getter @Setter
    private List<ShowSeat> seats = new ArrayList<>();

    @OneToMany(mappedBy = "booking")
    @Getter @Setter
    private List<Transaction> transactions = new ArrayList<>();


    @ManyToOne
    @Getter @Setter
    private Coupon coupon;

    @ManyToOne
    @Getter @Setter
    private User user;
}
