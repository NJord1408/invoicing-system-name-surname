package pl.futurecollars.invoicing.service;

import pl.futurecollars.invoicing.db.Database;
import pl.futurecollars.invoicing.model.Invoice;

import java.util.List;

public class InvoiceService {

    private final Database database;

    public InvoiceService(Database database) {
        this.database = database;
    }

    public int save(Invoice invoice) {
        database.save(invoice);
    }

    public void Optional(Invoice) getById(int id) {
        return database.getById(id);
    }

    public List<Invoice> getAll() {
        return database.getAll();
    }

    public void update(int id, Invoice updatedInvoice) {
        database.update(id, updatedInvoice);
    }

    public void delete(int id) {
        database.delete(id);
    }
}
