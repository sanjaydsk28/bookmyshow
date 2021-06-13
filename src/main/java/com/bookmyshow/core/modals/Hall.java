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
@Table(name = "halls")
public class Hall extends Auditable {
    //attribs
    @Getter @Setter
    private String name;

    @Getter @Setter
    private boolean hasAirConditioning = true;

    @Getter @Setter
    private Boolean supports3D = true;

    //Relationships
    @ManyToOne
    @Getter @Setter
    private Cinema cinema;

    @OneToMany(mappedBy = "hall")
    @Getter @Setter
    private List<HallSeat> hallSeatList;

    @OneToMany(mappedBy = "hall")
    @Getter @Setter
    private List<MovieShow> movieShowList = new ArrayList<>();
}
