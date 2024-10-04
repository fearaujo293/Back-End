package com.akinator.Bet.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akinator.Bet.model.usuario_model;

public interface usuario_repository extends JpaRepository<usuario_model,UUID>{

}
