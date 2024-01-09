package br.com.lbot.ignoreme.transport.controller;

import br.com.lbot.ignoreme.interactor.CadastrarDocumentoUseCase;
import br.com.lbot.ignoreme.interactor.ConsultarDocumentoUseCase;
import br.com.lbot.ignoreme.interactor.mapper.DocumentIteractorMapper;
import br.com.lbot.ignoreme.transport.entity.DocumentRequest;
import br.com.lbot.ignoreme.transport.entity.DocumentResponse;
import br.com.lbot.ignoreme.transport.mapper.DocumentTransportMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentController {

    private final CadastrarDocumentoUseCase cadastrarDocumentoUseCase;
    private final ConsultarDocumentoUseCase consultarDocumentoUseCase;
    private final DocumentTransportMapper documentTransportMapper;
    private final DocumentIteractorMapper documentIteractorMapper;

    public DocumentController(CadastrarDocumentoUseCase cadastrarDocumentoUseCase, ConsultarDocumentoUseCase consultarDocumentoUseCase, DocumentTransportMapper documentTransportMapper, DocumentIteractorMapper documentIteractorMapper) {
        this.cadastrarDocumentoUseCase = cadastrarDocumentoUseCase;
        this.consultarDocumentoUseCase = consultarDocumentoUseCase;
        this.documentTransportMapper = documentTransportMapper;
        this.documentIteractorMapper = documentIteractorMapper;
    }

    @GetMapping("/ignore/me/{technology}")
    public DocumentResponse getDocument(@PathVariable(value = "technology") String technology){;
        return documentTransportMapper.mapToDocumentResponse(consultarDocumentoUseCase.getDocument(technology));
    }

    @PostMapping("/document/add")
    public DocumentResponse addDocument(@RequestBody DocumentRequest documentRequest){
        return documentTransportMapper.mapToDocumentResponse(cadastrarDocumentoUseCase.addDocument(documentIteractorMapper.mapToDocument(documentRequest)));
    }

}
