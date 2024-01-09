package br.com.lbot.ignoreme.interactor.implementation;

import br.com.lbot.ignoreme.data.repository.DocumentRepository;
import br.com.lbot.ignoreme.interactor.CadastrarDocumentoUseCase;
import br.com.lbot.ignoreme.interactor.entity.Document;
import br.com.lbot.ignoreme.interactor.mapper.DocumentIteractorMapper;
import org.springframework.stereotype.Service;

@Service
public class CadastrarDocumentoUseCaseImpl implements CadastrarDocumentoUseCase {

    private final DocumentRepository documentoRepository;
    private final DocumentIteractorMapper mapper;

    public CadastrarDocumentoUseCaseImpl(DocumentRepository documentoRepository, DocumentIteractorMapper mapper) {
        this.documentoRepository = documentoRepository;
        this.mapper = mapper;
    }

    public Document addDocument(Document document){
        return mapper.mapToDocument(documentoRepository.save(mapper.mapToDocumentEntity(document)));
    }

}
