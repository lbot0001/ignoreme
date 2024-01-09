package br.com.lbot.ignoreme.interactor;

import br.com.lbot.ignoreme.data.entity.DocumentEntity;
import br.com.lbot.ignoreme.interactor.entity.Document;

public interface CadastrarDocumentoUseCase {

    Document addDocument(Document document);

}
