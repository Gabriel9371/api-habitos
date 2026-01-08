package com.gabriel.api_habitos.repository;

import com.gabriel.api_habitos.entity.Habito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoRepository extends JpaRepository<Long, Habito> {

}
