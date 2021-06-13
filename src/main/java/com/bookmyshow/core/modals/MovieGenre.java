package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "genres")
public class MovieGenre extends Auditable{
    private String name;

    @ManyToMany(mappedBy = "movieGenreList")
    @Getter @Setter
    private List<Movie> movieList;
}
