package edu.lunhu.taxi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Data
@Entity(name = "tariffs")
public class Tariff extends Audit {

    @Id
    private Long id;
    private String name;
    private Float minPrice;
    private Float pricePerKilometer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return id.equals(tariff.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
