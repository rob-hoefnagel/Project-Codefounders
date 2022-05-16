package nl.gamehoefnagel.hoefnagel.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import nl.gamehoefnagel.hoefnagel.domein.Unit;

@Component
public interface UnitRepository extends JpaRepository <Unit,Long>{

}
