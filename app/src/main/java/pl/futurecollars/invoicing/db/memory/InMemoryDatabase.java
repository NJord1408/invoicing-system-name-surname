package pl.futurecollars.invoicing.db.memory;

//import jdk.internal.access.JavaSecurityAccess;
import pl.futurecollars.invoicing.db.Database;
import pl.futurecollars.invoicing.model.Invoice;


import java.util.*;

public class InMemoryDatabase implements Database {

    private final Map<Integer, Invoice> invoice = new HashMap<>();
    private int nextId = 1;

    @Override
    public int save(Invoice invoice) {
        int id = nextId++;
        invoice.setId(id); //Assigning a generated ID to the invoice
        return id;
    }

    @Override
    public Optional<Invoice> getById(int id) {
        return Optional.ofNullable(invoice.get(id));
    }

    @Override
    public List<Invoice> getAll() {
        return new ArrayList<>(invoice.values());
    }

    @Override
    public void update(int id, Invoice updatedInvoice) {
        if (invoice.containsKey(id)) {
            invoice.put(id, updatedInvoice);
        }

    }

    @Override
    public void delete(int id) {
        invoice.remove(id);

    }
}
