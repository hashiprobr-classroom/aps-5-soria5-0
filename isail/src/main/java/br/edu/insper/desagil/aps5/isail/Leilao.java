package br.edu.insper.desagil.aps5.isail;

import java.time.LocalDate;
import java.util.List;

public class Leilao {
    private LocalDate date;
    private List<Item> items;

    public Leilao(LocalDate date, List<Item> items) {
        this.date = date;
        this.items = items;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void imprimeMelhoresLances() {
        for (Item item : items) {
            item.imprimeMelhorLance();
        }
    }
}
