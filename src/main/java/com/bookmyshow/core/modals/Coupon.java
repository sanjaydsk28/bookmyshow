package com.bookmyshow.core.modals;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "coupons")
public class Coupon extends Auditable {

    @OneToMany(mappedBy = "coupon")
    private List<Booking> bookings = new ArrayList<>();
}
