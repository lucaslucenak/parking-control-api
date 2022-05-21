package com.api.parkingcontrol.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String carLicensePlate;
    @NotBlank
    private String carBrand;
    @NotBlank
    private String carModel;
    @NotBlank
    private String carColor;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartmentNumber;
    @NotBlank
    private String apartmentBlock;


}
