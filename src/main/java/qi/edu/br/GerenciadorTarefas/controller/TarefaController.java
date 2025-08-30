package qi.edu.br.GerenciadorTarefas.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import qi.edu.br.GerenciadorTarefas.model.Tarefa;
import qi.edu.br.GerenciadorTarefas.service.TarefaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa (@Valid @RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.criarTarefa(tarefa);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novaTarefa.getId())
                .toUri();
        return ResponseEntity.created(location).body(novaTarefa);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> buscarTarefas() {
        List<Tarefa> tarefas = tarefaService.buscarTarefas();
        return ResponseEntity.ok(tarefas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefaId(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.buscarTarefaId(id);
        return ResponseEntity.ok(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> alterarTarefa(@PathVariable Long id, @Valid @RequestBody Tarefa tarefa) {
        Tarefa tarefaAlterada = tarefaService.alterarTarefa(id, tarefa);
        return ResponseEntity.ok(tarefaAlterada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirTarefa(@PathVariable Long id) {
        tarefaService.excluirTarefa(id);
        return ResponseEntity.noContent().build();
    }
}
