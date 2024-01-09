package br.com.lbot.ignoreme.data.repository;

import br.com.lbot.ignoreme.data.entity.FooterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FooterRepository extends CrudRepository<FooterEntity, Long> {
    Optional<FooterEntity> findByType(String type);
}
