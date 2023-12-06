package br.com.cod3r.forum.controller.dto;

import br.com.cod3r.forum.modelo.Topico;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public static Page<TopicoDto> converter(Page<Topico> topicos) {
        // TODO Auto-generated method stub
        return topicos.map(TopicoDto::new);
    }

    public static TopicoDto converter(Topico topico) {
        // TODO Auto-generated method stub
        TopicoDto dto = new TopicoDto(topico);
        return dto;
    }


}
