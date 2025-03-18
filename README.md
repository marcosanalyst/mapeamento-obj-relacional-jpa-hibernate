# Projeto: Fundamentos de JPA/Hibernate com Maven e XAMPP

## Descrição
Este é um projeto básico desenvolvido para entender os fundamentos do JPA (Java Persistence API) e Hibernate, utilizando o Maven para gerenciamento de dependências e o XAMPP para hospedar o banco de dados MySQL.

## Tecnologias Utilizadas
- **Java** (versão 8)
- **Maven** (para gerenciamento de dependências)
- **JPA/Hibernate** (para persistência de dados)
- **MySQL** (hospedado no XAMPP)
- **XAMPP** (para serviço de banco de dados)
- **IDE recomendada**: Eclipse, IntelliJ IDEA ou VS Code

## Instalação e Configuração
1. **Instalar o XAMPP**: Baixe e instale o XAMPP em [https://www.apachefriends.org](https://www.apachefriends.org/).
2. **Configurar o MySQL**:
   - Inicie o servidor MySQL pelo painel do XAMPP.
   - Crie um banco de dados chamado `jpa_hibernate_db`.
3. **Configurar o projeto Maven**:
   - Clone este repositório: `git clone https://github.com/marcosanalyst/mapeamento-obj-relacional-jpa-hibernate.git`
   - Importe o projeto para sua IDE como um projeto Maven.
   - Configure o arquivo `src/main/resources/META-INF/persistence.xml` com suas credenciais do banco de dados.
4. **Executar o projeto**:
   - Compile o projeto com `mvn clean install`.
   - Execute a classe principal `Programa.java` que realiza as operações de persistência no banco de dados.

## Estrutura do Projeto
```
aulajpamaven/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── aplicacao/
│   │   │   │   ├── Programa.java  # Classe principal
│   │   │   ├── dominio/
│   │   │   │   ├── Pessoa.java  # Classe de entidade
│   │   ├── resources/
│   │   │   ├── META-INF/
│   │   │   │   ├── persistence.xml  # Configuração do JPA
├── target/
│   ├── classes/
│   │   ├── META-INF/
│   │   │   ├── persistence.xml
│   │   ├── aplicacao/
│   │   │   ├── Programa.class
│   │   ├── dominio/
│   │   │   ├── Pessoa.class
├── pom.xml  # Dependências do Maven
```

## Dependências Principais (pom.xml)
```xml
<dependencies>
    <!-- Hibernate e JPA -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-entitymanager</artifactId>
        <version>5.4.12.Final</version>
    </dependency>
    
    <!-- Conector MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.19</version>
    </dependency>
</dependencies>
```

## Contato
Caso tenha alguma dúvida ou sugestão, entre em contato via [analyst.marcos@gmail.com] ou contribua para o repositório!]

---
**Autor:** Marcos Silva 
**Repositório:** [https://github.com/marcosanalyst/mapeamento-obj-relacional-jpa-hibernate.git)
