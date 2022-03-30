package edu.lunhu.taxi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Data
@Entity(name = "client_classes")
public class ClientClass extends Audit {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer minTripsNumber;

    private Float discount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientClass clientClass = (ClientClass) o;
        return id.equals(clientClass.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
