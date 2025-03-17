package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    @Test
    public void teste() {
        Data d = new Data();
        d.atualiza(2024, 9, 26);
        assertEquals(19978, d.comoInteiro());
    }
}
