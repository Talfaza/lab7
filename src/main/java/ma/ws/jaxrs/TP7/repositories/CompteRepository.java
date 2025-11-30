package ma.ws.jaxrs.TP7.repositories;

import ma.ws.jaxrs.TP7.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}