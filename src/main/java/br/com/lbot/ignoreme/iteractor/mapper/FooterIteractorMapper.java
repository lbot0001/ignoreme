package br.com.lbot.ignoreme.iteractor.mapper;

import br.com.lbot.ignoreme.data.entity.FooterEntity;
import br.com.lbot.ignoreme.iteractor.entity.Footer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FooterIteractorMapper {
    FooterIteractorMapper MAPPER = Mappers.getMapper(FooterIteractorMapper.class);
    Footer mapToFooter(FooterEntity footerEntity);

}
