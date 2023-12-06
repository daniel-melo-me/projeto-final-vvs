
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
### testIsCredentialsNonExpired
- Este teste verifica se o método isCredentialsNonExpired da classe Usuario retorna corretamente a informação de credenciais não expiradas.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isCredentialsNonExpired());
```

### testIsEnabled
- Este teste verifica se o método isEnabled da classe Usuario retorna corretamente a informação de usuário habilitado.

Entrada:
```java
Usuario usuario = new Usuario();
```
Saída Esperada:
```java
assertTrue(usuario.isEnabled());
```

1. Classe TestesController

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