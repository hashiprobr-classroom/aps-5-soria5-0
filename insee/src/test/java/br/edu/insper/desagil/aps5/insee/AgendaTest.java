package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {

    private Agenda a;

    @BeforeEach
    void setUp() {
        a = new Agenda();
    }

    private Evento eventoValido() {
        Evento ev = mock(Evento.class);
        when(ev.valido()).thenReturn(true);
        return ev;
    }

    private Evento eventoInvalido() {
        Evento ev = mock(Evento.class);
        when(ev.valido()).thenReturn(false);
        return ev;
    }

    @Test
    void constroi() {
        assertEquals(0, a.getEventos().size());
        // ou
        assertTrue(a.getEventos().isEmpty());
    }

    @Test
    void adicionaInvalido() {
        Evento evento = eventoInvalido();

    }
}
