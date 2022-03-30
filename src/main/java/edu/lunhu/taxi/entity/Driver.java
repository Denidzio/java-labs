package edu.lunhu.taxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
@Entity(name = "drivers")
public class Driver extends Audit {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;

    private LocalDate birthDate;

    private String license;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToMany
    private List<Tariff> tariffs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return id.equals(driver.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
