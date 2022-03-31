package edu.lunhu.taxi.dto;

import edu.lunhu.taxi.entity.Car;
import lombok.Data;

@Data
public class DriverDto {

    private Long id;

    private String fullName;

    private Car car;

}
