# API de Gerenciamento de Tarefas 📝
*Autor: **Bruno Toniazzo***

Projeto da Atividade Integradora da cadeira de Serviços para Web 08/2025.
Desenvolvido a partir do uso de Java 17 e Spring Boot na IDE IntelliJ.
Durante o projeto optei pelo uso de um banco de dados em memória para facilitação da visualização e teste da API conforme a execução.
</br></br>

## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA**
* **Maven**
* **H2 Database** (Banco de dados em memória)
* **Jakarta Validation**
</br>

## Critérios de Avalição da Atividade Integradora

* **1. Implementação dos Endpoints**
<p><i>Todos os endpoints CRUD obrigatórios foram implementados e funcionam conforme especicado. A lógica de criação, leitura, atualização e deleção está correta.</i></p>

* **2. Aderência aos Princípios REST e HTTP**
<p><i>Uso correto dos métodos HTTP para cada operação, URIs bem modeladas (uso de substantivos, identificação de recursos) e uso adequado e consistente dos códigos de status HTTP para sucesso e erro.</i></p>

* **3. Qualidade do Código e Organização**
<p><i>O código é legível, bem estruturado em arquivos/módulos e contém comentários pertinentes. O arquivo README.md contém instruções claras para execução.</i></p>

* **4. Documentação da API**
<p><i>A documentação descreve de forma clara e completa cada endpoint, incluindo exemplos de requisição e resposta. A documentação é precisa e útil para um desenvolvedor que precise consumir a API.</i></p>
</br>

## Pré-requisitos

Primeiramente, você precisará das seguintes ferramentas:
* [JDK 17 ou superior](https://www.oracle.com/java/technologies/downloads/)
* [Maven 3.8 ou superior](https://maven.apache.org/download.cgi)
* [Git](https://git-scm.com/downloads)
* [Postman](https://www.postman.com/downloads/)

### Clonar o projeto
```bash
git clone https://github.com/brunotoniazzo/GerenciadorTarefas_AtividadeIntegradora.git
```

### Compilar o Projeto
Para que seja possível a compilação de forma correta do projeto, acesse a pasta raiz e execute o seguinte comando:

```bash
# Para Windows
./mvnw.cmd clean package

# Para Linux/macOS
./mvnw clean package
```
</br>

## Execução do Projeto
Após o cumprimento de todos pré-requisitos, clonagem e compilação do projeto, será possível prosseguir para a execução.
Com finalidade do teste de nossa API do Gerenciador de Tarefas.

#### Para isto, realize o seguinte comando a partir da pasta raiz:
```bash
java -jar target/gerenciador-de-tarefas-0.0.1-SNAPSHOT.jar
```

Será possível observar a confirmação a partir dos seguintes retornos no compilador se tudo ocorreu corretamente: </br>
`Tomcat started on port(s): 8080 (http)` </br>
`Started GerenciadorDeTarefasApplication in X.XXX seconds` </br>

### Banco de Dados em Memória H2
Para acessar o Banco de Dados basta abrir seu navegador e colar o seguinte endereço: </br>
[http://localhost:8080/h2-console](http://localhost:8080/h2-console) </br>

Será aberto um Painel onde terá de ser alocada as configurações de acordo com o arquivo presente no diretório _Resources_: </br>
`application.properties`</br>

Em resumo, as configurações necessárias a serem inseridas no painel: <br/>
**JDBC URL**: _jdbc:h2:mem:gerenciadorTarefas_ </br>
**User Name**: _user_ </br>
**Password**: _password_ </br>

### Uso da API do Gerenciador de Tarefas
Utilizando da plataforma Postman recomendada, porém, também pode ser utilizada também a plataforma semelhante chamada Insomnia. </br>
Podemos realizar a chamada pela API: </br>
`http://localhost:8080/tarefas`
