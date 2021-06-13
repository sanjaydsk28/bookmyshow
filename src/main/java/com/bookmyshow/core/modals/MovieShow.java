package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movieshows")
public class MovieShow extends Auditable {
    //attribs
    @Getter @Setter
    private Date timingStart;

    @Getter @Setter
    private Date timingEng;

    // Relationships
    @OneToMany(mappedBy = "movieShow")
    @Getter @Setter
    private List<Booking> bookings = new ArrayList<>();


    @ManyToOne
    @Getter @Setter
    private Hall hall;

    @ManyToOne
    @Getter @Setter
    private Movie movie;
}
