package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction extends Auditable{

    @ManyToOne
    @Getter @Setter
    private Booking booking;
}
