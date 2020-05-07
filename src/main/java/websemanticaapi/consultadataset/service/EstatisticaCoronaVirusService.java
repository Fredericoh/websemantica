package websemanticaapi.consultadataset.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import websemanticaapi.consultadataset.model.EstatisticaCoronaVirus;
import websemanticaapi.consultadataset.repository.EstatisticaCoronaVirusRepository;

import java.util.List;

@Service
public class EstatisticaCoronaVirusService {

    @Autowired
    private EstatisticaCoronaVirusRepository estatisticaCoronaVirusRepository;

    public List<EstatisticaCoronaVirus> listar(){

        return estatisticaCoronaVirusRepository.findAll ();
    }
}
