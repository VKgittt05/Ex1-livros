package com.livros.gerenciamento_livros.repositories;

import com.livros.gerenciamento_livros.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositories extends JpaRepository<Livro, Long> {
}