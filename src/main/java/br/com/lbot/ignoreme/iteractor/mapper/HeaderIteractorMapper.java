package br.com.lbot.ignoreme.iteractor.mapper;

import br.com.lbot.ignoreme.data.entity.HeaderEntity;
import br.com.lbot.ignoreme.iteractor.entity.Header;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeaderIteractorMapper {
    HeaderIteractorMapper MAPPER = Mappers.getMapper(HeaderIteractorMapper.class);
    Header mapToHeader(HeaderEntity headerEntity);
}
