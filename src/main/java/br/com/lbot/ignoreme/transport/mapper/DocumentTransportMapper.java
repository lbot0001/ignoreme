package br.com.lbot.ignoreme.transport.mapper;


import br.com.lbot.ignoreme.iteractor.entity.Document;
import br.com.lbot.ignoreme.transport.entity.DocumentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentTransportMapper {
    DocumentTransportMapper MAPPER = Mappers.getMapper(DocumentTransportMapper.class);
    DocumentResponse mapToDocumentResponse(Document document);

}
