package br.com.lbot.ignoreme.iteractor;

import br.com.lbot.ignoreme.iteractor.entity.Document;

public interface FindDocumentUseCase {

    Document getDocument(String technology);

}
