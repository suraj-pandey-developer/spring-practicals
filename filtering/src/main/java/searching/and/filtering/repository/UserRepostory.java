package searching.and.filtering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import searching.and.filtering.model.User;

@Repository
public interface UserRepostory extends JpaRepository<User, Integer> {
}
