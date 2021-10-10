package com.bootcamp.dio.restfull.repository;

import com.bootcamp.dio.restfull.SoldadoEntity.SoldadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldadoRepository extends JpaRepository<SoldadoEntity, Long> {
}
