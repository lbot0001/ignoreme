package br.com.lbot.ignoreme.interactor.mapper;


import br.com.lbot.ignoreme.data.entity.DocumentEntity;
import br.com.lbot.ignoreme.interactor.entity.Document;
import br.com.lbot.ignoreme.transport.entity.DocumentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentIteractorMapper {
    DocumentIteractorMapper MAPPER = Mappers.getMapper(DocumentIteractorMapper.class);
    DocumentEntity mapToDocumentEntity(Document document);
    Document mapToDocument(DocumentRequest document);
    Document mapToDocument(DocumentEntity documentEntity);

}
