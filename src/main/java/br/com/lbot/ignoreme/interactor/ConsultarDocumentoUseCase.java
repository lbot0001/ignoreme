package br.com.lbot.ignoreme.interactor;

import br.com.lbot.ignoreme.interactor.entity.Document;

public interface ConsultarDocumentoUseCase {

    Document getDocument(String technology);

}
