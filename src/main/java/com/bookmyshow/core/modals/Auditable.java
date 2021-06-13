package com.bookmyshow.core.modals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

// Copies the attributes to the child class
@MappedSuperclass
public abstract class Auditable {
    @Id
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence", allocationSize = 10)
    @Getter
    @Setter
    private Long id;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Getter @Setter
    private Date create_at = new Date();

    @Column(nullable = false, updatable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Getter @Setter
    private Date updated_at = new Date();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auditable)) return false;
        Auditable auditable = (Auditable) o;
        return getId() == auditable.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
