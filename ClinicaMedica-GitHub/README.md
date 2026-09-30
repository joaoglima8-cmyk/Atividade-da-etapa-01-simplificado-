# Clínica Médica - Spring Boot

Projeto simples da **Situação de Aprendizagem 4 - Etapa 2**.

## Tecnologias

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

## Executar no GitHub Codespaces

1. Crie um repositório no GitHub.
2. Envie **todos os arquivos desta pasta** para o repositório.
3. Abra **Code > Codespaces > Create codespace on main**.
4. No terminal do Codespace execute:

```bash
mvn spring-boot:run
```

5. Abra a porta **8080** na aba **Ports** e clique em **Open in Browser**.

## Executar no computador

Com Java 17+ e Maven instalados:

```bash
mvn spring-boot:run
```

Depois acesse:

`http://localhost:8080/`

## Páginas

- `/` - início
- `/pacientes` - pacientes
- `/medicos` - médicos
- `/consultas` - consultas
- `/h2-console` - banco H2

## Banco de dados

O projeto usa H2 em memória. Os dados de teste ficam em `src/main/resources/data.sql`.
