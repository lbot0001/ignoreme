package br.com.lbot.ignoreme.transport.controller;

import br.com.lbot.ignoreme.iteractor.CreateDocumentUseCase;
import br.com.lbot.ignoreme.iteractor.FindDocumentUseCase;
import br.com.lbot.ignoreme.iteractor.mapper.DocumentIteractorMapper;
import br.com.lbot.ignoreme.transport.entity.DocumentRequest;
import br.com.lbot.ignoreme.transport.entity.DocumentResponse;
import br.com.lbot.ignoreme.transport.mapper.DocumentTransportMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentController {

    private final CreateDocumentUseCase createDocumentUseCase;
    private final FindDocumentUseCase findDocumentUseCase;
    private final DocumentTransportMapper documentTransportMapper;
    private final DocumentIteractorMapper documentIteractorMapper;

    public DocumentController(CreateDocumentUseCase createDocumentUseCase, FindDocumentUseCase findDocumentUseCase, DocumentTransportMapper documentTransportMapper, DocumentIteractorMapper documentIteractorMapper) {
        this.createDocumentUseCase = createDocumentUseCase;
        this.findDocumentUseCase = findDocumentUseCase;
        this.documentTransportMapper = documentTransportMapper;
        this.documentIteractorMapper = documentIteractorMapper;
    }

    @GetMapping("/ignore/me/{technology}")
    @ResponseBody
    public String getDocument(@PathVariable(value = "technology") String technology){;
        return documentTransportMapper.mapToDocumentResponse(findDocumentUseCase.getDocument(technology)).toString();
    }

    @PostMapping("/document/add")
    public DocumentResponse addDocument(@RequestBody DocumentRequest documentRequest){
        return documentTransportMapper.mapToDocumentResponse(createDocumentUseCase.addDocument(documentIteractorMapper.mapToDocument(documentRequest)));
    }

}
