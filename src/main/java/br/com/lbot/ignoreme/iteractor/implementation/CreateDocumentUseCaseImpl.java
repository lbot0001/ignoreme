package br.com.lbot.ignoreme.iteractor.implementation;

import br.com.lbot.ignoreme.data.repository.DocumentRepository;
import br.com.lbot.ignoreme.iteractor.CreateDocumentUseCase;
import br.com.lbot.ignoreme.iteractor.entity.Document;
import br.com.lbot.ignoreme.iteractor.mapper.DocumentIteractorMapper;
import org.springframework.stereotype.Service;

@Service
public class CreateDocumentUseCaseImpl implements CreateDocumentUseCase {

    private final DocumentRepository documentoRepository;
    private final DocumentIteractorMapper mapper;

    public CreateDocumentUseCaseImpl(DocumentRepository documentoRepository, DocumentIteractorMapper mapper) {
        this.documentoRepository = documentoRepository;
        this.mapper = mapper;
    }

    public Document addDocument(Document document){
        return mapper.mapToDocument(documentoRepository.save(mapper.mapToDocumentEntity(document)));
    }

}
