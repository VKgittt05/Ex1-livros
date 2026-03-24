package com.livros.gerenciamento_livros.services;

import com.livros.gerenciamento_livros.models.Livro;
import com.livros.gerenciamento_livros.repositories.LivroRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LivroServices {

    @Autowired
    private LivroRepositories repository;

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public Optional<Livro> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}