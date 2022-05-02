package nl.gamehoefnagel.hoefnagel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.gamehoefnagel.hoefnagel.domein.Unit;
import nl.gamehoefnagel.hoefnagel.persistance.UnitService;

@RestController

public class UnitEndpoint {
	@Autowired
	UnitService us; 
	
	@GetMapping("resultaat")
	public String weGaan() {
		System.out.println("We gaan");
		return "Weet ik niet";
	
		
	}
	
	@GetMapping("geefUnit")
	public Unit geeftUnit() {
		Unit u1 = new Unit();
		u1.setAttack(15);
		u1.setDefence(12);
		u1.setName("Koning");
		us.inDeService();
		return u1;
	}
	
	@GetMapping("maakUnitAan/{unitnaam}/{defense}")
	public void maakUnitAan(@PathVariable String unitnaam, @PathVariable int defense) {
		System.out.println(unitnaam);
		us.maakUnitAan(unitnaam, defense);
	}
	@GetMapping("/alles")
	public Iterable<Unit> alles() {
		return us.geefAlleUnits();
	}
}
