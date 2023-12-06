package br.com.cod3r.forum.util;

import br.com.cod3r.forum.modelo.Curso;
import br.com.cod3r.forum.modelo.Topico;

import java.util.Arrays;
import java.util.List;

public class TestDataUtil {

    public static List<Topico> createSampleTopics() {
        // Crie e retorne uma lista de tópicos de exemplo para seus testes
        return Arrays.asList(
                new Topico(1L, "Tópico 1", "Conteúdo do Tópico 1", new Curso("1L", "Curso 1")),
                new Topico(2L, "Tópico 2", "Conteúdo do Tópico 2", new Curso("2L", "Curso 2")),
                new Topico(3L, "Tópico 3", "Conteúdo do Tópico 3", new Curso("1L", "Curso 1"))
        );
    }

    public static Curso createSampleCourse() {
        // Crie e retorne um curso de exemplo para seus testes
        return new Curso("teste", "Curso de Exemplo");
    }
}
