# Documentação da API - Gerenciador de Tarefas

Documentação com princípio para informar sobre todos endpoints criados durante o projeto de Gerenciador de Tarefas. </br>
Endpoints retratam o uso de um CRUD básico, com funções de Criação(Create), Leitura(Read), Alterar(Update) e Excluir(Delete).

---

### **1. Criar uma Nova Tarefa**

* **Endpoint:** `/tarefas`
* **Verbo HTTP:** `POST`
* **Descrição:** Criação de uma nova tarefa. O corpo da requisição deve conter o título (obrigatório) e, opcionalmente, uma descrição.
* **Exemplo de Requisição (JSON):**
    ```json
    {
        "titulo": "Retirar o lixo",
        "descricao": "Recolher, juntar e armazenar o lixo nos locais adequados toda segunda-feira.",
        "status": true
    }
    ```
* **Exemplo de Resposta de Sucesso (JSON):**
    ```json
    {
        "id": 1,
        "titulo": "Retirar o lixo",
        "descricao": "Recolher, juntar e armazenar o lixo nos locais adequados toda segunda-feira.",
        "status": true
    }
    ```
* **Códigos de Resposta:**
    * `201 Created`: Sucesso! A tarefa foi criada.
    * `400 Bad Request`: Erro de validação (ex: título em branco).

---

### **2. Listar Todas as Tarefas**

* **Endpoint:** `/tarefas`
* **Verbo HTTP:** `GET`
* **Descrição:** Retorna uma lista com todas as tarefas atualmente cadastradas no sistema.
* **Exemplo de Resposta de Sucesso (JSON):**
    ```json
    [
        {
            "id": 1,
            "titulo": "Estudar o idioma Inglês",
            "descricao": "Realizar leitura de artigos ou assistir conteúdos sem uso de legendas.",
            "status": false
        }
    ]
    ```
* **Códigos de Resposta:**
    * `200 OK`: Sucesso!

---

### **3. Buscar Tarefa por ID**

* **Endpoint:** `/tarefas/{id}`
* **Verbo HTTP:** `GET`
* **Descrição:** Busca e retorna os detalhes de uma tarefa a partir do ID.
* **Exemplo de Resposta de Sucesso (JSON):**
    ```json
    {
        "id": 3,
        "titulo": "Alimentar Animais",
        "descricao": "Alimentar animais às 19h todos os dias",
        "status": false
    }
    ```
* **Códigos de Resposta:**
    * `200 OK`: Sucesso!
    * `404 Not Found`: Erro. Nenhuma tarefa foi encontrada com o ID informado.

---

### **4. Atualizar uma Tarefa**

* **Endpoint:** `/tarefas/{id}`
* **Verbo HTTP:** `PUT`
* **Descrição:** Atualiza os dados de uma tarefa existente a partir do ID.
* **Exemplo de Requisição (JSON):**
    ```json
    {
      "titulo": "Renomear titulo da tarefa",
      "descricao": "Alterar tarefas utilizando a API com alterarTarefa",
      "status": true
    }
    ```
* **Códigos de Resposta:**
    * `200 OK`: Sucesso!
    * `400 Bad Request`: Erro de validação.
    * `404 Not Found`: Erro. Nenhuma tarefa com o ID especificado foi encontrada.

---

### **5. Deletar uma Tarefa**

* **Endpoint:** `/tarefas/{id}`
* **Verbo HTTP:** `DELETE`
* **Descrição:** Remove permanentemente uma tarefa do sistema a partir do ID.
* **Códigos de Resposta:**
    * `204 No Content`: Sucesso! A tarefa foi deletada.
    * `404 Not Found`: Erro. Nenhuma tarefa com o ID especificado foi encontrada.
