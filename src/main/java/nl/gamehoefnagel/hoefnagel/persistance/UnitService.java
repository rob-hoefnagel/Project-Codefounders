package nl.gamehoefnagel.hoefnagel.persistance;

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

	public void maakUnitAan(String unitnaam, int defense) {
		Unit mijnUnit = new Unit();
		mijnUnit.setName(unitnaam);
		mijnUnit.setDefence(defense);
		unitRepository.save(mijnUnit);
	}
	
	public Iterable<Unit> geefAlleUnits() {
		
		
		return unitRepository.findAll();
	}
}



