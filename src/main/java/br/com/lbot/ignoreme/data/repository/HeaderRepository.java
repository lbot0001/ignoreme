package br.com.lbot.ignoreme.data.repository;

import br.com.lbot.ignoreme.data.entity.HeaderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HeaderRepository extends CrudRepository<HeaderEntity, Long> {
    Optional<HeaderEntity> findByType(String type);
}
