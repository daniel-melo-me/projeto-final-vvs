package br.com.cod3r.forum.model;

import br.com.cod3r.forum.modelo.Curso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoTest {

    @Test
    public void testGetId() {
        Curso curso = new Curso("Matemática", "Ciências");
        curso.setId(1L);
        assertEquals(1L, curso.getId());
    }

    @Test
    public void testSetId() {
        Curso curso = new Curso("Física", "Ciências");
        curso.setId(2L);
        assertEquals(2L, curso.getId());
    }

    @Test
    public void testGetNome() {
        Curso curso = new Curso("História", "Humanas");
        assertEquals("História", curso.getNome());
    }

    @Test
    public void testSetNome() {
        Curso curso = new Curso("Geografia", "Humanas");
        curso.setNome("Geografia Urbana");
        assertEquals("Geografia Urbana", curso.getNome());
    }

    @Test
    public void testGetCategoria() {
        Curso curso = new Curso("Inglês", "Linguagens");
        assertEquals("Linguagens", curso.getCategoria());
    }

    @Test
    public void testSetCategoria() {
        Curso curso = new Curso("Francês", "Linguagens");
        curso.setCategoria("Línguas Estrangeiras");
        assertEquals("Línguas Estrangeiras", curso.getCategoria());
    }

}
