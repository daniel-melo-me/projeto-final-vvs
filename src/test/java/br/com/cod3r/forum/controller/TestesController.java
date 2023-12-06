package br.com.cod3r.forum.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@WebMvcTest(controllers = {AutenticacaoController.class, HelloCod3r.class})
public class TestesController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deveriaDevolver403CasoDadosAuthIncorretos() throws Exception {
        URI uri = new URI("/auth");
        String json = "{\"email\": \"invalido@email.com\", \"senha\":\"123456\"}";

        mockMvc
                .perform(MockMvcRequestBuilders.post(uri)
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(403));
    }

    @Test
    @WithMockUser(username = "user@example.com", password = "password", roles = "USER")
    public void testHelloEndpointWithAuthentication() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello"));
    }

    @Test
    public void testHelloEndpointWithoutAuthentication() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }
}
