package edu.lunhu.taxi.dto;

import lombok.Data;

@Data
public class ClientOrderDto {

    private Long id;
    private String driverName;
    private String carModel;
    private String tariffName;
    private Float waitingTime;
    private Float price;

}
