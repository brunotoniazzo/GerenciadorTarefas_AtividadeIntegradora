package qi.edu.br.GerenciadorTarefas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo título precisa ser preenchido.")
    @Size(max = 70, message = "O título não pode ultrapassar 70 caracteres.")
    @Column(length = 70, nullable = false)
    private String titulo;

    @Size(max = 200, message = "A descrição não pode ultrapassar 200 caracteres!")
    private String descricao;

    private Boolean status = false;

    public Tarefa() {
    }

    public Tarefa(Long id, String titulo, String descricao, Boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean tarefaRealizada() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
