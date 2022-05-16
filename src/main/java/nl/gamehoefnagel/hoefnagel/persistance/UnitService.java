package nl.gamehoefnagel.hoefnagel.persistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.gamehoefnagel.hoefnagel.domein.Unit;

@Service
public class UnitService {
	@Autowired
	UnitRepository unitRepository;

	public void inDeService() {
		System.out.println("Go in the Service");
		Unit u = new Unit();
		u.setName("Paard");
		unitRepository.save(u);
	}

	public void maakUnitAan(String unitnaam, int defense, int attack, int movement) {
		Unit mijnUnit = new Unit();
		mijnUnit.setName(unitnaam);
		mijnUnit.setDefence(defense);
		mijnUnit.setAttack(attack);
		mijnUnit.setMovement(movement);
		unitRepository.save(mijnUnit);
	}
	
	public Iterable<Unit> geefAlleUnits() {
		
		
		return unitRepository.findAll();
	}
	
	
	public void maakAan (Unit unit) {
	//check naam van unit
		unitRepository.save(unit);
	}
	
	public void pasAan(Unit unit) {
		unitRepository.save(unit);
	}
	
	public Optional<Unit> findById(long id) {
		return unitRepository.findById(id);
	}
	
	public void verwijderen(Unit unit) {
		unitRepository.delete(unit);
	}
}



