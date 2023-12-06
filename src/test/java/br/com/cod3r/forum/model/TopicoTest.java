package br.com.cod3r.forum.model;

import br.com.cod3r.forum.modelo.Resposta;
import br.com.cod3r.forum.modelo.Topico;
import br.com.cod3r.forum.modelo.Usuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TopicoTest {

    @Test
    public void testGetId() {
        Resposta resposta = new Resposta();
        resposta.setId(1L);
        assertEquals(1L, resposta.getId());
    }

    @Test
    public void testSetId() {
        Resposta resposta = new Resposta();
        resposta.setId(2L);
        assertEquals(2L, resposta.getId());
    }

    @Test
    public void testGetMensagem() {
        Resposta resposta = new Resposta();
        resposta.setMensagem("Exemplo de resposta.");
        assertEquals("Exemplo de resposta.", resposta.getMensagem());
    }

    @Test
    public void testSetMensagem() {
        Resposta resposta = new Resposta();
        resposta.setMensagem("Outro exemplo de resposta.");
        assertEquals("Outro exemplo de resposta.", resposta.getMensagem());
    }

    @Test
    public void testGetTopico() {
        Topico topico = new Topico();
        Resposta resposta = new Resposta();
        resposta.setTopico(topico);
        assertEquals(topico, resposta.getTopico());
    }

    @Test
    public void testSetTopico() {
        Topico topico = new Topico();
        Resposta resposta = new Resposta();
        resposta.setTopico(topico);
        assertEquals(topico, resposta.getTopico());
    }

    @Test
    public void testGetDataCriacao() {
        Resposta resposta = new Resposta();
        assertNotNull(resposta.getDataCriacao());
    }

    @Test
    public void testSetDataCriacao() {
        Resposta resposta = new Resposta();
        LocalDateTime dataCriacao = LocalDateTime.of(2023, 1, 1, 12, 0);
        resposta.setDataCriacao(dataCriacao);
        assertEquals(dataCriacao, resposta.getDataCriacao());
    }

    @Test
    public void testGetAutor() {
        Usuario autor = new Usuario();
        Resposta resposta = new Resposta();
        resposta.setAutor(autor);
        assertEquals(autor, resposta.getAutor());
    }

    @Test
    public void testSetAutor() {
        Usuario autor = new Usuario();
        Resposta resposta = new Resposta();
        resposta.setAutor(autor);
        assertEquals(autor, resposta.getAutor());
    }

    @Test
    public void testGetSolucao() {
        Resposta resposta = new Resposta();
        assertFalse(resposta.getSolucao());
    }

    @Test
    public void testSetSolucao() {
        Resposta resposta = new Resposta();
        resposta.setSolucao(true);
        assertTrue(resposta.getSolucao());
    }
}
