package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cinemas")
public class Cinema  extends  Auditable {
    @Getter @Setter
    private String name;

    @Getter @Setter @NonNull
    private String address;

    @Getter @Setter
    private Boolean hasParking = true;

    @ManyToOne
    @Getter @Setter
    private City city;

    @OneToMany(mappedBy = "cinema")
    @Getter @Setter
    private List<Hall> halls;
}
