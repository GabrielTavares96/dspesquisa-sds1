package com.devsuperior.dspesquisa.repositories;

import com.devsuperior.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
