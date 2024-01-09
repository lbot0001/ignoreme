package br.com.lbot.ignoreme.data.repository;

import br.com.lbot.ignoreme.data.entity.DocumentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentRepository extends CrudRepository<DocumentEntity, Long> {

    Optional<DocumentEntity> findDocumentByTechnology(String technology);
    DocumentEntity save(DocumentEntity documentEntity);

}
