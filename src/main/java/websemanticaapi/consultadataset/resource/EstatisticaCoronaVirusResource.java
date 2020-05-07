package websemanticaapi.consultadataset.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import websemanticaapi.consultadataset.model.EstatisticaCoronaVirus;
import websemanticaapi.consultadataset.service.EstatisticaCoronaVirusService;

import java.util.List;

@RestController
@RequestMapping("/coronavirus")
public class EstatisticaCoronaVirusResource {

    @Autowired
    private EstatisticaCoronaVirusService estatisticaCoronaVirusService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EstatisticaCoronaVirus> listar(){

        return estatisticaCoronaVirusService.listar ();
    }
}
