package dk.userreview;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewRepo extends MongoRepository<Review, String>
{
    Review findByUsername(String username);
    Review findByCarId(int carId);
}
