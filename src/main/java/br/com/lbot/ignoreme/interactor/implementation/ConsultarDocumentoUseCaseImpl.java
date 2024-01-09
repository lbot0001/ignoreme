package br.com.lbot.ignoreme.interactor.implementation;

import br.com.lbot.ignoreme.data.repository.DocumentRepository;
import br.com.lbot.ignoreme.interactor.ConsultarDocumentoUseCase;
import br.com.lbot.ignoreme.interactor.entity.Document;
import br.com.lbot.ignoreme.interactor.mapper.DocumentIteractorMapper;
import org.springframework.stereotype.Service;

@Service
public class ConsultarDocumentoUseCaseImpl implements ConsultarDocumentoUseCase {
    private final DocumentRepository documentoRepository;
    private final DocumentIteractorMapper mapper;

    public ConsultarDocumentoUseCaseImpl(DocumentRepository documentoRepository, DocumentIteractorMapper mapper) {
        this.documentoRepository = documentoRepository;
        this.mapper = mapper;
    }

    public Document getDocument(String technology){
        return mapper.mapToDocument(documentoRepository.findDocumentByTechnology(technology));
    }

}