package com.bookmyshow.core.modals;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile extends Auditable {
    @OneToOne
    private User user;
}
