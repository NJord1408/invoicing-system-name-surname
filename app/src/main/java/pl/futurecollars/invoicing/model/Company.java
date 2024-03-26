package pl.futurecollars.invoicing.model;

import lombok.Data;

@Data
public class Company {

    private String name;
    private String address;
    private String taxIdentificationNumber;
}
