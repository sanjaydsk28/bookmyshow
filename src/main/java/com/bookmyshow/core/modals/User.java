package com.bookmyshow.core.modals;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends Auditable {
    @Getter @Setter
    private String name;

    @NotNull
    @Column(unique = true)
    @Getter @Setter
    private String email;


    // Create strong encryption hashed pssword - SHA256. No MD5, base64
    private String saltedHashedPassword;

    @OneToOne
    @Getter @Setter
    private Profile profile;

    @OneToMany(mappedBy = "user")
    @Getter @Setter
    private List<Booking> bookingList;

    @ManyToMany(mappedBy = "userList")
    @Getter @Setter
    private List<Role> roles = new ArrayList<>();
}
