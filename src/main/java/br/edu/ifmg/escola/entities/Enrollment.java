package br.edu.ifmg.escola.entities;

import br.edu.ifmg.escola.entities.pk.EnrollmentPk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

    @EmbeddedId
    private EnrollmentPk id = new EnrollmentPk();

    private Instant enrollmentMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyupdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessons_done = new HashSet<>();

    @OneToMany(mappedBy = "enrollment")
    private List<Deliver> delivers = new ArrayList<>();


    public User getUser() {
        return id.getUser();
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);
    }

    public Enrollment(User user, Offer offer, Instant enrollmentMoment, Instant refundMoment, boolean available, boolean onlyupdate) {
        this.id.setUser(user);
        this.id.setOffer(offer);
        this.enrollmentMoment = enrollmentMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyupdate = onlyupdate;
    }
}
