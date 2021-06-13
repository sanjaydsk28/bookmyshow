package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie extends Auditable {
    @Getter @Setter
    private String name;

    @Getter @Setter
    private int totalDuration;

    @Getter @Setter
    private MPAARating mpaaRating;

    @OneToMany(mappedBy = "movie")
    @Getter @Setter
    private List<MovieShow> movieShowList = new ArrayList<>();

    @ManyToMany
    @Getter @Setter
    private List<MovieGenre> movieGenreList = new ArrayList<>();
}
