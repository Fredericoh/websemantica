package websemanticaapi.consultadataset.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import websemanticaapi.consultadataset.model.EstatisticaCoronaVirus;

public interface EstatisticaCoronaVirusRepository extends MongoRepository<EstatisticaCoronaVirus, String> {
}
