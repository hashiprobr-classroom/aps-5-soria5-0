package br.edu.insper.desagil.aps5.isail;

public class Item {
    private String nome;
    private Lance leilao;

    public Item(String nome, double minimo) {
        this.nome = nome;
        this.leilao = new Lance(minimo);
    }

    public String getNome() {
        return nome;
    }

    public void fazLance(Comprador comprador, double oferta) {
        leilao.fazLance(comprador, oferta);
    }

    public void imprimeMelhorLance() {
        leilao.imprimeMelhorLance();
    }
}