package br.com.lbot.ignoreme.transport.controller;

import br.com.lbot.ignoreme.interactor.CadastrarDocumentoUseCaseImpl;
import br.com.lbot.ignoreme.interactor.ConsultarDocumentoUseCaseImpl;
import br.com.lbot.ignoreme.interactor.mapper.DocumentIteractorMapper;
import br.com.lbot.ignoreme.transport.entity.DocumentRequest;
import br.com.lbot.ignoreme.transport.entity.DocumentResponse;
import br.com.lbot.ignoreme.transport.mapper.DocumentTransportMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentController {

    private final CadastrarDocumentoUseCaseImpl cadastrarDocumentoUseCaseImpl;
    private final ConsultarDocumentoUseCaseImpl consultarDocumentoUseCaseImpl;
    private final DocumentTransportMapper documentTransportMapper;
    private final DocumentIteractorMapper documentIteractorMapper;

    public DocumentController(CadastrarDocumentoUseCaseImpl cadastrarDocumentoUseCaseImpl, ConsultarDocumentoUseCaseImpl consultarDocumentoUseCaseImpl, DocumentTransportMapper documentTransportMapper, DocumentIteractorMapper documentIteractorMapper) {
        this.cadastrarDocumentoUseCaseImpl = cadastrarDocumentoUseCaseImpl;
        this.consultarDocumentoUseCaseImpl = consultarDocumentoUseCaseImpl;
        this.documentTransportMapper = documentTransportMapper;
        this.documentIteractorMapper = documentIteractorMapper;
    }

    @GetMapping("/ignore/me/{technology}")
    public DocumentResponse getDocument(@PathVariable(value = "technology") String technology){;
        return documentTransportMapper.mapToDocumentResponse(consultarDocumentoUseCaseImpl.getDocument(technology));
    }

    @PostMapping("/document/add")
    public DocumentResponse addDocument(@RequestBody DocumentRequest documentRequest){
        return documentTransportMapper.mapToDocumentResponse(cadastrarDocumentoUseCaseImpl.addDocument(documentIteractorMapper.mapToDocument(documentRequest)));
    }

}
