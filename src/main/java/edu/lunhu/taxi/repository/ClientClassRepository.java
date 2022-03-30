package edu.lunhu.taxi.repository;

import edu.lunhu.taxi.entity.ClientClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientClassRepository extends JpaRepository<ClientClass, Long> {
}
