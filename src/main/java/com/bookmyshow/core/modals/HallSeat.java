package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hallseats")
public class HallSeat extends Auditable {

    @ManyToOne
    @Getter @Setter
    private Hall hall;
}
