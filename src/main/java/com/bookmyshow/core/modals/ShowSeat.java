package com.bookmyshow.core.modals;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "showseats")
public class ShowSeat extends Auditable{

    @ManyToOne
    private Booking booking;
}
