package br.com.lbot.ignoreme.transport;

import br.com.lbot.ignoreme.transport.entity.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitIgnoreController {

    @RequestMapping ("/ignore/me/{technology}")
    public Document getGitIgnore(@PathVariable(value = "technology") String technology){;
        return new Document(technology);
    }

}
