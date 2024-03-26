package pl.futurecollars.invoicing.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvoiceEntry {

    private String description;
    private BigDecimal price;
    private BigDecimal vatValue;
    private Vat vatRate;
}
