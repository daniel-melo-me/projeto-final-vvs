
## Projeto forum-api

### Verificação Estática


A análise efetuada incidiu sobre a exigência de comentário na classe AutenticacaoService, especificamente na linha 15,
conforme indicado pelo PMD. Conforme a recomendação do PMD,
é imperativo incluir um comentário explicativo que descreva a finalidade da utilização da referida classe como solução.

### Testes Unitarios

1. Classe UsuarioTest

#### testGetId()
- Este teste verifica se o método getId da classe Usuario retorna corretamente o identificador do usuário.

Entrada:

```java
Usuario usuario = new Usuario();
        usuario.setId(1L);
```

Saída Esperada:

```java
assertEquals(1L, usuario.getId());
        testSetId
```

#### testSetId()
- Este teste verifica se o método setId da classe Usuario atribui corretamente o identificador do usuário.

Entrada:

```java
Usuario usuario = new Usuario();
        usuario.setId(2L);
```

Saída Esperada:

```java
assertEquals(2L, usuario.getId());
```

#### testGetNome()
- Este teste verifica se o método getNome da classe Usuario retorna corretamente o nome do usuário.

Entrada:

```java
Usuario usuario = new Usuario();
        usuario.setNome("Nome do Usuário");
```

Saída Esperada:

```java
assertEquals("Nome do Usuário", usuario.getNome());
```

#### testSetNome()
- Este teste verifica se o método setNome da classe Usuario atribui corretamente o nome do usuário.

Entrada:

```java
Usuario usuario = new Usuario();
        usuario.setNome("Outro Nome do Usuário");
```

Saída Esperada:

```java
assertEquals("Outro Nome do Usuário", usuario.getNome());
```

#### testGetEmail()
- Este teste verifica se o método getEmail da classe Usuario retorna corretamente o e-mail do usuário.

Entrada:

```java
Usuario usuario = new Usuario();
        usuario.setEmail("usuario@example.com");
```

Saída Esperada:

```java
assertEquals("usuario@example.com", usuario.getEmail());
```

### testSetEmail()
- Este teste verifica se o método setEmail da classe Usuario atribui corretamente o e-mail do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        usuario.setEmail("outro.usuario@example.com");
```
Saída Esperada:
```java
assertEquals("outro.usuario@example.com", usuario.getEmail());
```
### testGetSenha()
- Este teste verifica se o método getSenha da classe Usuario retorna corretamente a senha do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        usuario.setSenha("senha123");
```
Saída Esperada:
```java
assertEquals("senha123", usuario.getSenha());
```
### testSetSenha()
- Este teste verifica se o método setSenha da classe Usuario atribui corretamente a senha do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        usuario.setSenha("outraSenha456");
```

Saída Esperada:
```java
assertEquals("outraSenha456", usuario.getSenha());
        testGetPerfis
```

- Este teste verifica se o método getPerfis da classe Usuario retorna corretamente a lista de perfis do usuário.

Entrada:
```java
List<Perfil> perfis = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setPerfis(perfis);
```
Saída Esperada:
```java
assertEquals(perfis, usuario.getPerfis());
```
### testSetPerfis()
- Este teste verifica se o método setPerfis da classe Usuario atribui corretamente a lista de perfis do usuário.

Entrada:
```java
List<Perfil> perfis = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setPerfis(perfis);
```
Saída Esperada:
```java
assertEquals(perfis, usuario.getPerfis());
```

### testGetAuthorities()
- Este teste verifica se o método getAuthorities da classe Usuario retorna corretamente as autoridades do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        List<Perfil> perfis = new ArrayList<>();
        perfis.add(new Perfil("ROLE_USER"));
        perfis.add(new Perfil("ROLE_ADMIN"));
        usuario.setPerfis(perfis);
```
Saída Esperada:
```java
Collection<? extends GrantedAuthority> authorities = usuario.getAuthorities();
        assertEquals(2, authorities.size());
        assertFalse(authorities.contains(new SimpleGrantedAuthority("ROLE_USER")));
        assertTrue(authorities.contains(new SimpleGrantedAuthority("ROLE_ADMIN")));
```
### testGetPassword()
- Este teste verifica se o método getPassword da classe Usuario retorna corretamente a senha do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        usuario.setSenha("senha123");
```
Saída Esperada:
```java
assertEquals("senha123", usuario.getPassword());
```

### testGetUsername()
- Este teste verifica se o método getUsername da classe Usuario retorna corretamente o e-mail do usuário.

Entrada:
```java
Usuario usuario = new Usuario();
        usuario.setEmail("usuario@example.com");
```
Saída Esperada:
```java
assertEquals("usuario@example.com", usuario.getUsername());
```
### testIsAccountNonExpired()

- Este teste verifica se o método isAccountNonExpired da classe Usuario retorna corretamente a informação de conta não expirada.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isAccountNonExpired());
```
### testIsAccountNonLocked()

- Este teste verifica se o método isAccountNonLocked da classe Usuario retorna corretamente a informação de conta não bloqueada.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isAccountNonLocked());
```
### testIsCredentialsNonExpired()
- Este teste verifica se o método isCredentialsNonExpired da classe Usuario retorna corretamente a informação de credenciais não expiradas.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isCredentialsNonExpired());
```

### testIsEnabled()
- Este teste verifica se o método isEnabled da classe Usuario retorna corretamente a informação de usuário habilitado.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isEnabled());
```

2. Classe PerfilTest

###   Teste: testGetAuthority()

-   **Descrição:** Verifica se o método `getAuthority` da classe `Perfil` retorna corretamente a autoridade do perfil.

**Entrada:**


    `Perfil perfil = new Perfil();
    perfil.setNome("ROLE_USER");`

**Saída Esperada:**


    assertEquals("ROLE_USER", perfil.getAuthority());

### Teste: testIdGeneration()

-   **Descrição:** Verifica se a geração de ID da classe `Perfil` ocorre conforme o esperado.

**Entrada:**


    Perfil perfil = new Perfil();
    perfil.setId(1L);

**Saída Esperada:**


    assertEquals(1L, perfil.getId());

### Teste: testSetNome()

-   **Descrição:** Verifica se o método `setNome` da classe `Perfil` define corretamente o nome do perfil.

**Entrada:**


    Perfil perfil = new Perfil();
    perfil.setNome("ROLE_ADMIN");

**Saída Esperada:**


    assertEquals("ROLE_ADMIN", perfil.getNome());

3. Classe RespostaTest

###  testGetId()

-   **Descrição:** Verifica se o método `getId` da classe `Resposta` retorna corretamente o ID da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setId(1L);

**Saída Esperada:**


    assertEquals(1L, resposta.getId());

### testSetId()

-   **Descrição:** Verifica se o método `setId` da classe `Resposta` define corretamente o ID da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setId(2L);

**Saída Esperada:**


    assertEquals(2L, resposta.getId());

### testGetMensagem()

-   **Descrição:** Verifica se o método `getMensagem` da classe `Resposta` retorna corretamente a mensagem da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setMensagem("Exemplo de resposta.");

**Saída Esperada:**


    assertEquals("Exemplo de resposta.", resposta.getMensagem());

### testSetMensagem()

-   **Descrição:** Verifica se o método `setMensagem` da classe `Resposta` define corretamente a mensagem da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setMensagem("Outro exemplo de resposta.");

**Saída Esperada:**


    assertEquals("Outro exemplo de resposta.", resposta.getMensagem());

### testGetTopico()

-   **Descrição:** Verifica se o método `getTopico` da classe `Resposta` retorna corretamente o tópico associado à resposta.

**Entrada:**


    Topico topico = new Topico();
    Resposta resposta = new Resposta();
    resposta.setTopico(topico);

**Saída Esperada:**


    assertEquals(topico, resposta.getTopico());

### testSetTopico()

-   **Descrição:** Verifica se o método `setTopico` da classe `Resposta` define corretamente o tópico associado à resposta.

**Entrada:**


    Topico topico = new Topico();
    Resposta resposta = new Resposta();
    resposta.setTopico(topico);

**Saída Esperada:**

    assertEquals(topico, resposta.getTopico());

### testGetDataCriacao()

-   **Descrição:** Verifica se o método `getDataCriacao` da classe `Resposta` retorna uma data de criação não nula.

**Entrada:**


    Resposta resposta = new Resposta();

**Saída Esperada:**


    assertNotNull(resposta.getDataCriacao());

### testSetDataCriacao()

-   **Descrição:** Verifica se o método `setDataCriacao` da classe `Resposta` define corretamente a data de criação da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    LocalDateTime dataCriacao = LocalDateTime.of(2023, 1, 1, 12, 0);
    resposta.setDataCriacao(dataCriacao);

**Saída Esperada:**


    assertEquals(dataCriacao, resposta.getDataCriacao());

### testGetAutor()

-   **Descrição:** Verifica se o método `getAutor` da classe `Resposta` retorna corretamente o autor da resposta.

**Entrada:**


    Usuario autor = new Usuario();
    Resposta resposta = new Resposta();
    resposta.setAutor(autor);

**Saída Esperada:**


    assertEquals(autor, resposta.getAutor());

### testSetAutor()

-   **Descrição:** Verifica se o método `setAutor` da classe `Resposta` define corretamente o autor da resposta.

**Entrada:**


    Usuario autor = new Usuario();
    Resposta resposta = new Resposta();
    resposta.setAutor(autor);

**Saída Esperada:**


    assertEquals(autor, resposta.getAutor());

### testGetSolucao()

-   **Descrição:** Verifica se o método `getSolucao` da classe `Resposta` retorna corretamente o status de solução da resposta.

**Entrada:**


    Resposta resposta = new Resposta();

**Saída Esperada:**


    assertFalse(resposta.getSolucao());

### testSetSolucao()

-   **Descrição:** Verifica se o método `setSolucao` da classe `Resposta` define corretamente o status de solução da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setSolucao(true);

**Saída Esperada:**


    assertTrue(resposta.getSolucao());

Estes testes garantem a correta implementação dos métodos da classe `Resposta`.


4. Classe TopicoTest


### testGetId()

-   **Descrição:** Verifica se o método `getId` da classe `Resposta` retorna corretamente o ID da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setId(1L);

**Saída Esperada:**


    assertEquals(1L, resposta.getId());


### testSetId()

-   **Descrição:** Verifica se o método `setId` da classe `Resposta` define corretamente o ID da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setId(2L);

**Saída Esperada:**

    assertEquals(2L, resposta.getId());

### testGetMensagem()

-   **Descrição:** Verifica se o método `getMensagem` da classe `Resposta` retorna corretamente a mensagem da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setMensagem("Exemplo de resposta.");

**Saída Esperada:**


    assertEquals("Exemplo de resposta.", resposta.getMensagem());

### testSetMensagem()

-   **Descrição:** Verifica se o método `setMensagem` da classe `Resposta` define corretamente a mensagem da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setMensagem("Outro exemplo de resposta.");

**Saída Esperada:**


    assertEquals("Outro exemplo de resposta.", resposta.getMensagem());

### testGetTopico()

-   **Descrição:** Verifica se o método `getTopico` da classe `Resposta` retorna corretamente o tópico associado à resposta.

**Entrada:**


    Topico topico = new Topico();
    Resposta resposta = new Resposta();
    resposta.setTopico(topico);

**Saída Esperada:**


    assertEquals(topico, resposta.getTopico());

### testSetTopico()

-   **Descrição:** Verifica se o método `setTopico` da classe `Resposta` define corretamente o tópico associado à resposta.

**Entrada:**

    Topico topico = new Topico();
    Resposta resposta = new Resposta();
    resposta.setTopico(topico);

**Saída Esperada:**


    assertEquals(topico, resposta.getTopico());

### testGetDataCriacao()

-   **Descrição:** Verifica se o método `getDataCriacao` da classe `Resposta` retorna uma data de criação não nula.

**Entrada:**


    Resposta resposta = new Resposta();

**Saída Esperada:**


    assertNotNull(resposta.getDataCriacao());

### testSetDataCriacao()

-   **Descrição:** Verifica se o método `setDataCriacao` da classe `Resposta` define corretamente a data de criação da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    LocalDateTime dataCriacao = LocalDateTime.of(2023, 1, 1, 12, 0);
    resposta.setDataCriacao(dataCriacao);

**Saída Esperada:**


    assertEquals(dataCriacao, resposta.getDataCriacao());

### testGetAutor()

-   **Descrição:** Verifica se o método `getAutor` da classe `Resposta` retorna corretamente o autor da resposta.

**Entrada:**


    Usuario autor = new Usuario();
    Resposta resposta = new Resposta();
    resposta.setAutor(autor);

**Saída Esperada:**


    assertEquals(autor, resposta.getAutor());

### testSetAutor()

-   **Descrição:** Verifica se o método `setAutor` da classe `Resposta` define corretamente o autor da resposta.

**Entrada:**


    Usuario autor = new Usuario();
    Resposta resposta = new Resposta();
    resposta.setAutor(autor);

**Saída Esperada:**


    assertEquals(autor, resposta.getAutor());

### testGetSolucao()

-   **Descrição:** Verifica se o método `getSolucao` da classe `Resposta` retorna corretamente o status de solução da resposta.

**Entrada:**


    Resposta resposta = new Resposta();

**Saída Esperada:**


    assertFalse(resposta.getSolucao());

### testSetSolucao()

-   **Descrição:** Verifica se o método `setSolucao` da classe `Resposta` define corretamente o status de solução da resposta.

**Entrada:**


    Resposta resposta = new Resposta();
    resposta.setSolucao(true);

**Saída Esperada:**

    assertTrue(resposta.getSolucao());

Estes testes garantem a correta implementação dos métodos da classe `Resposta`.

5. Classe CursoTest


###  testGetId()

-   **Descrição:** Verifica se o método `getId` da classe `Curso` retorna corretamente o ID do curso.

**Entrada:**


    Curso curso = new Curso("Matemática", "Ciências");
    curso.setId(1L);

**Saída Esperada:**


    assertEquals(1L, curso.getId());

### testSetId()

-   **Descrição:** Verifica se o método `setId` da classe `Curso` define corretamente o ID do curso.

**Entrada:**


    Curso curso = new Curso("Física", "Ciências");
    curso.setId(2L);

**Saída Esperada:**


    assertEquals(2L, curso.getId());

### testGetNome()

-   **Descrição:** Verifica se o método `getNome` da classe `Curso` retorna corretamente o nome do curso.

**Entrada:**


    Curso curso = new Curso("História", "Humanas");

**Saída Esperada:**


    assertEquals("História", curso.getNome());

### testSetNome()

-   **Descrição:** Verifica se o método `setNome` da classe `Curso` define corretamente o nome do curso.

**Entrada:**


    Curso curso = new Curso("Geografia", "Humanas");
    curso.setNome("Geografia Urbana");

**Saída Esperada:**


    assertEquals("Geografia Urbana", curso.getNome());

### testGetCategoria()

-   **Descrição:** Verifica se o método `getCategoria` da classe `Curso` retorna corretamente a categoria do curso.

**Entrada:**


    Curso curso = new Curso("Inglês", "Linguagens");

**Saída Esperada:**


    assertEquals("Linguagens", curso.getCategoria());

### testSetCategoria()

-   **Descrição:** Verifica se o método `setCategoria` da classe `Curso` define corretamente a categoria do curso.

**Entrada:**


    Curso curso = new Curso("Francês", "Linguagens");
    curso.setCategoria("Línguas Estrangeiras");

**Saída Esperada:**


    assertEquals("Línguas Estrangeiras", curso.getCategoria());

Estes testes garantem a correta implementação dos métodos da classe `Curso`.


----------------------------------------------

6. Classe TestesController

###   deveriaDevolver403CasoDadosAuthIncorretos()

-   Este teste verifica se a autenticação retorna corretamente um status 403 (Forbidden) quando as credenciais são incorretas.

Entrada:

```java
URI uri = new URI("/auth");
        String json = "{\"email\": \"invalido@email.com\", \"senha\":\"123456\"}";
``` 

Saída Esperada:

```java
mockMvc.perform(MockMvcRequestBuilders.post(uri)
        .content(json)
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().is(403));
   ``` 

### testHelloEndpointWithAuthentication()

-   Este teste verifica se o endpoint "/hello" retorna corretamente um status 200 (OK) e a mensagem "Hello" quando um usuário autenticado acessa.

Entrada:

```java
@WithMockUser(username = "user@example.com", password = "password", roles = "USER")
```

Saída Esperada:

```java
mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("Hello")); 
```

### testHelloEndpointWithoutAuthentication()

-   Este teste verifica se o endpoint "/hello" retorna corretamente um status 401 (Unauthorized) quando um usuário não autenticado tenta acessar.

Entrada:

```java
// Nenhum usuário autenticado
```
```java
mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
        .andExpect(MockMvcResultMatchers.status().isUnauthorized());
   ```