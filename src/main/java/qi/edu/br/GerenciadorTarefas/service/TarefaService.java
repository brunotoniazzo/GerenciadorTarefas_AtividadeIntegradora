package qi.edu.br.GerenciadorTarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qi.edu.br.GerenciadorTarefas.exception.ResourceNotFoundException;
import qi.edu.br.GerenciadorTarefas.model.Tarefa;
import qi.edu.br.GerenciadorTarefas.repository.TarefaRepository;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarTarefaId(Long id) {
        return tarefaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não foi possível encontrar uma Tarefa com ID: " + id));
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Tarefa alterarTarefa(Long id, Tarefa tarefaNova) {
        Tarefa tarefaAntiga = buscarTarefaId(id);

        tarefaAntiga.setTitulo(tarefaNova.getTitulo());
        tarefaAntiga.setDescricao(tarefaNova.getDescricao());
        tarefaAntiga.setStatus(tarefaNova.tarefaRealizada());

        return tarefaRepository.save(tarefaNova);
    }

    public void excluirTarefa (Long id) {
        if (!tarefaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Não foi possível encontrar uma Tarefa de ID " + id + " para realizar a exclusão.");
        }
        tarefaRepository.deleteById(id);
    }
}
