package br.com.lbot.ignoreme.iteractor.implementation;

import br.com.lbot.ignoreme.data.repository.FooterRepository;
import br.com.lbot.ignoreme.data.repository.HeaderRepository;
import br.com.lbot.ignoreme.data.repository.DocumentRepository;
import br.com.lbot.ignoreme.exception.ItemNotFoundException;
import br.com.lbot.ignoreme.iteractor.FindDocumentUseCase;
import br.com.lbot.ignoreme.iteractor.entity.Document;
import br.com.lbot.ignoreme.iteractor.mapper.DocumentIteractorMapper;
import br.com.lbot.ignoreme.iteractor.mapper.FooterIteractorMapper;
import br.com.lbot.ignoreme.iteractor.mapper.HeaderIteractorMapper;
import org.springframework.stereotype.Service;

@Service
public class FindDocumentUseCaseImpl implements FindDocumentUseCase {
    public static final String DEFAULT = "DEFAULT";
    private final DocumentRepository documentoRepository;
    private final HeaderRepository headerRepository;
    private final FooterRepository footerRepository;
    private final DocumentIteractorMapper mapper;
    private final HeaderIteractorMapper headerMapper;
    private final FooterIteractorMapper footerMapper;

    public FindDocumentUseCaseImpl(DocumentRepository documentoRepository, HeaderRepository headerRepository, FooterRepository footerRepository, DocumentIteractorMapper mapper, HeaderIteractorMapper headerMapper, FooterIteractorMapper footerMapper) {
        this.documentoRepository = documentoRepository;
        this.headerRepository = headerRepository;
        this.footerRepository = footerRepository;
        this.mapper = mapper;
        this.headerMapper = headerMapper;
        this.footerMapper = footerMapper;
    }

    public Document getDocument(String technology){
        var documentEntity = documentoRepository.findByTechnology(technology)
                .orElseThrow(() -> new ItemNotFoundException(technology));
        var document = mapper.mapToDocument(documentEntity);
        document.setHeader(headerMapper.mapToHeader(headerRepository.findByType(DEFAULT).get()));
        document.setFooter(footerMapper.mapToFooter(footerRepository.findByType(DEFAULT).get()));
        return document;
    }

}
