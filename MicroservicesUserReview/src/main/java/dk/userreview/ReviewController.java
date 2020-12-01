package dk.userreview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RepositoryRestController
@RepositoryRestResource
@ResponseBody
@RequestMapping("/users")
public class ReviewController
{
        @Autowired
        private ReviewRepo repo;
        private Object review;

        @GetMapping("/")
        public String hello()
    {
        return "you found me";
    }

        @PostMapping("/review")
        public String saveReview(@RequestBody Review review){
            repo.save(review);
            return "review saved";
        }

        @GetMapping("/{username}")
        public Review findByUsername(@PathVariable String username)
        {
            return repo.findByUsername(username);
        }

        @GetMapping("/id/{carId}")
        public Review findByCarId(@PathVariable int carId)
        {
            return repo.findByCarId(carId);
        }

        /*@GetMapping("/")
        public List<User> retrieveAllUsers()
        {
            return repo.findAll();
        }

        @PostMapping("/")
        public String saveUser(@RequestBody User user)
        {
            repo.save(user);
            return " record saved..";
        }

        @DeleteMapping("/{id}")
        public String deleteUser(@PathVariable String id)
        {
            repo.deleteById(id);
            return " record deleted...";
        }*/



       /* @PutMapping("/{id}")
        public ResponseEntity<Object> updateReview(@RequestBody User user, @PathVariable String id)
        {
            Optional<User> found = repo.findById(id);

            if (!found.isPresent())
                return ResponseEntity.badRequest()
                        .header("Custom-Header", "foo")
                        .body("Try again")
                        .notFound().build();
            car.setId((long) id);
            repo.save(car);
            return   ResponseEntity.ok()
                    .header("Custom-Header", "foo")
                    .body("Notice the custom header")
                    .noContent().build();
        }*/
    }

