package daos;

import models.GroundHandler;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by prate_000 on 16-05-2016.
 */
public interface GroundHandlerRepository extends MongoRepository<GroundHandler, Integer> {

    public GroundHandler findById(int id);
}
