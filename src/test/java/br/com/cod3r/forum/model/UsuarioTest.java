package br.com.cod3r.forum.model;

import br.com.cod3r.forum.modelo.Perfil;
import br.com.cod3r.forum.modelo.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testGetId() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        assertEquals(1L, usuario.getId());
    }

    @Test
    public void testSetId() {
        Usuario usuario = new Usuario();
        usuario.setId(2L);
        assertEquals(2L, usuario.getId());
    }

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");
        assertEquals("Nome do Usuário", usuario.getNome());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario();
        usuario.setNome("Outro Nome do Usuário");
        assertEquals("Outro Nome do Usuário", usuario.getNome());
    }

    @Test
    public void testGetEmail() {
        Usuario usuario = new Usuario();
        usuario.setEmail("usuario@example.com");
        assertEquals("usuario@example.com", usuario.getEmail());
    }

    @Test
    public void testSetEmail() {
        Usuario usuario = new Usuario();
        usuario.setEmail("outro.usuario@example.com");
        assertEquals("outro.usuario@example.com", usuario.getEmail());
    }

    @Test
    public void testGetSenha() {
        Usuario usuario = new Usuario();
        usuario.setSenha("senha123");
        assertEquals("senha123", usuario.getSenha());
    }

    @Test
    public void testSetSenha() {
        Usuario usuario = new Usuario();
        usuario.setSenha("outraSenha456");
        assertEquals("outraSenha456", usuario.getSenha());
    }

    @Test
    public void testGetPerfis() {
        List<Perfil> perfis = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setPerfis(perfis);
        assertEquals(perfis, usuario.getPerfis());
    }

    @Test
    public void testSetPerfis() {
        List<Perfil> perfis = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setPerfis(perfis);
        assertEquals(perfis, usuario.getPerfis());
    }

    @Test
    public void testGetAuthorities() {
        Usuario usuario = new Usuario();
        List<Perfil> perfis = new ArrayList<>();
        perfis.add(new Perfil("ROLE_USER"));
        perfis.add(new Perfil("ROLE_ADMIN"));
        usuario.setPerfis(perfis);

        Collection<? extends GrantedAuthority> authorities = usuario.getAuthorities();

        assertEquals(2, authorities.size());
        assertFalse(authorities.contains(new SimpleGrantedAuthority("ROLE_USER")));
        assertFalse(authorities.contains(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }

    @Test
    public void testGetPassword() {
        Usuario usuario = new Usuario();
        usuario.setSenha("senha123");
        assertEquals("senha123", usuario.getPassword());
    }

    @Test
    public void testGetUsername() {
        Usuario usuario = new Usuario();
        usuario.setEmail("usuario@example.com");
        assertEquals("usuario@example.com", usuario.getUsername());
    }

    @Test
    public void testIsAccountNonExpired() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.isAccountNonExpired());
    }

    @Test
    public void testIsAccountNonLocked() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.isAccountNonLocked());
    }

    @Test
    public void testIsCredentialsNonExpired() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.isCredentialsNonExpired());
    }

    @Test
    public void testIsEnabled() {
        Usuario usuario = new Usuario();
        assertTrue(usuario.isEnabled());
    }
}
