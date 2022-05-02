package nl.gamehoefnagel.hoefnagel.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.gamehoefnagel.hoefnagel.domein.Unit;

@Component
public interface UnitRepository extends CrudRepository <Unit,Long>{

}
