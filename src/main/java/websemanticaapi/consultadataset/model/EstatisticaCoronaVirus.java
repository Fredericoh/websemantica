package websemanticaapi.consultadataset.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "coronavirus")
public class EstatisticaCoronaVirus {

//    @Id
//    private ObjectId _id;
    @Id
    private String id;
    private String pais;
    private String estado;
    private String data;
    private String Confirmado;
    private String morte;
    private String recuperado;
}
