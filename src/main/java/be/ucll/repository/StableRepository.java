package be.ucll.repository;

import be.ucll.model.Stable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StableRepository extends JpaRepository<Stable, Long> {
}
