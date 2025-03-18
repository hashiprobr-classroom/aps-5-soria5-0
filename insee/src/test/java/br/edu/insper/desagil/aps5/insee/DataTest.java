package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    private Data d;

    @BeforeEach
    void setUp() {
        d = new Data();
    }

    @Test
    void constroi() {
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1970, d.getAno());
    }

    @Test
    void naoAtualizaMenor() {
        d.atualiza(1969, 0, 0);
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1970, d.getAno());
    }

    @Test
    void atualizaMaior() {
        d.atualiza(2024, 13, 32);
        assertEquals(31, d.getDia());
        assertEquals(12, d.getMes());
        assertEquals(2024, d.getAno());
    }

    @Test
    void atualiza() {
        d.atualiza(2024, 9, 26);
        assertEquals(26, d.getDia());
        assertEquals(9, d.getMes());
        assertEquals(2024, d.getAno());
    }

    @Test
    void comoZero() {
        assertEquals(0, d.comoInteiro());
    }

    @Test
    void comoAgora() {
        d.atualiza(2024, 9, 26);
        assertEquals(19978, d.comoInteiro());
    }
}
