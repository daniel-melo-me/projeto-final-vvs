package br.com.cod3r.forum.model;

import br.com.cod3r.forum.modelo.Perfil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfilTest {

    @Test
    public void testGetAuthority() {
        Perfil perfil = new Perfil();
        perfil.setNome("ROLE_USER");
        assertEquals("ROLE_USER", perfil.getAuthority());
    }


    @Test
    public void testIdGeneration() {
        Perfil perfil = new Perfil();
        perfil.setId(1L);
        assertEquals(1L, perfil.getId());
    }

    @Test
    public void testSetNome() {
        Perfil perfil = new Perfil();
        perfil.setNome("ROLE_ADMIN");
        assertEquals("ROLE_ADMIN", perfil.getNome());
    }

}
