package searching.and.filtering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import searching.and.filtering.model.User;

import java.util.UUID;

@Repository
public interface UserRepostory extends JpaRepository<User, UUID> {
}
