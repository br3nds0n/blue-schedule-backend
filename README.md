# 📦 blue schedule backend [<img align="right" src="https://img.shields.io/badge/release-v1.0.2-green">](https://github.com/br3nds0n/blue-schedule-backend/releases)

Bem-vindo(a).

Olá, como vai?! Meu nome é [Brendson](https://github.com/br3nds0n) e estou participando do processo seletivo da [Blue Technology](https://www.bluetechnology.com.br/), para melhor organização dividi o projeto em dois onde a aplicação do `font-end` está ospedada em outro repositorio [clique aqui](https://github.com/br3nds0n/blue-schedule-frontend) para visualizar o projeto.

Venho por meio deste repositorio entregar a aplicação `back-end` do desafio. Espero que você goste!

<br>

> <b>Status code:</b>  finalizado!! ✔

 ## ℹ index

   * [🧠 contexto](#-contexto)
   * [📥 download](#-download)
     * [setup](#-setup)
     * [starting](#-starting)
       * [docker](#-docker)
   * [📖 swagger](#-swagger)
     * [documentação](#-documentação) 
   * [🛠 tecnologias](#-tecnologias)
   * [✍🏼 autor](#-autor)
   * [📝 license](#-license)


 ## 🧠 contexto
> **Project Feature:**  *API Rest* 🌐 

 Este projeto é o back-end do desafio proposto, consiste em um crud de usuário com `java` e `spring boot`, onde faço as seguintes implementações:

 * Interação de métodos http. (POST, GET, PUT e DELETE);
 * Conexão com banco de dados JPA e Hibernate;
 * Aplicação em container Docker;
 * Documentação com Swagger;

<br>

## 📥 download

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:
[Git](https://git-scm.com), [Java](https://www.java.com/pt-BR/) este projeto usa ***Java 11*** e [Maven](https://maven.apache.org/install.html), o uso do drive do [PostgreSQL](https://www.postgresql.org/download/) também será necessário (ou qualquer outro banco SQL). Além disso, é bom ter um editor para trabalhar com código como [VSCode](https://code.visualstudio.com/). 

Neste projeto também está sendo utilizado o [Docker](https://www.docker.com/), se opite a utilização do mesmo não será necessário a instalação do banco de dados ***PostgreSQL***.


### 💻 setup

```php
# clonar este repositório
$ git clone https://github.com/br3nds0n/blue-schedule-backend.git

# acesse a pasta do projeto
$ cd blue-schedule-backend

# instale as dependências
$ mvn install
```

#

### ⚙ Configurar variáveis de ambiente
> Você precisará configurar o arquivo `application.properties` na pasta [resources](https://github.com/br3nds0n/blue-schedule-backend/blob/main/src/main/resources/application.properties). Exemplo:

```python
spring.jpa.properties.hibernate.dialect = <dialect>

spring.datasource.username = <database user>
spring.datasource.password = <database password>

spring.datasource.url = jdbc:<database>://localhost:<port>/<database name>

spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.show-sql = true
```

<br>

## ▶ starting
```php
# executando o comando
$ mvn spring-boot:run

# aplicação iniciará em <http://localhost:8080/>
```

### 🐳 docker
> caso opte pela utilização do `docker-compose`.
```php
# gere o arquivo .jar
$ mvn clean package -DskipTests

# build a imagem
$ docker build -t user-docker.jar .

# executando o comando
$ docker-compose up

# aplicação iniciará em um container do docker.
```
<br>

## 📖 swagger
```python
# acesse em seu navegador
 http://localhost:8080/swagger-ui/index.html
```
### 📃 documentação
![image](https://user-images.githubusercontent.com/82064724/174438576-49cd495c-465e-4628-9e70-60cb036603b8.png)

<br>


## 🛠 tecnologias

As seguintes ferramentas/tecnologias foram usadas na construção e teste do projeto. Ao clicar no ícone da tecnologia, você será redirecionado ao site oficial para instalação: <br>

| logo               | Framework                  | Version      |
| :----------------- | :------------------------- | :----------: |
| <a href="https://www.java.com/pt-BR/" target="_blank"><img align="center" alt="java" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg"></a> | Java           |  `11.0.5`      |
| <a href="https://start.spring.io/" target="_blank"><img align="center" alt="springboot" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original.svg"></a> | SpringBoot  |  `2.7.0`       |
| <a href="https://pt-br.reactjs.org/" target="_blank"><img align="center" alt="maven" height="30" width="40" src="https://user-images.githubusercontent.com/82064724/168427904-8ca2ff98-2496-45bc-9747-9875009566b5.png"> | Maven |  `3.6.3`       |
| <a href="https://www.postgresql.org/download/" target="_blank"><img align="center" alt="PostgreSQL" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg"></a>            | PostgreSQL                      |  `8.7.3`       |
| <a href="https://www.docker.com/"><img align="center" alt="docker" height="50" width="40" src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-original.svg"></a> | Docker | `1.27.4` |
 
 
<br>
                 
## ✍🏼 autor


<div align=left>

- <table>
 <p>  Developed by:</p>
  <tr align=center>
    <th><strong> Brendson Victor </strong></th>
  </tr>
   <td>
      <a href="https://github.com/br3nds0n">
        <img width="168" height="140" src="https://user-images.githubusercontent.com/82064724/169040996-89502743-78ba-4bf7-a145-ea7818e0157f.jpeg" > <p align="left">
</p></a>
    </td>

</table>
</div>

<div align=left>

<br>
 
## 📝 license

Este repositório está licenciado sob **MIT LICENSE**. Para informações mais detalhadas, leia o arquivo [LICENSE](./LICENSE) contido neste repositório.
                
 <br> 
	
 [<Back](#-blue-schedule-backend-)

