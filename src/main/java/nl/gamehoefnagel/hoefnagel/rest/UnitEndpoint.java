package nl.gamehoefnagel.hoefnagel.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		u1.setMovement(12);
		u1.setName("Koning");
		us.inDeService();
		return u1;
	}
	
	@GetMapping("maakUnitAan/{unitnaam}/{defense}")
	public void maakUnitAan(@PathVariable String unitnaam, @PathVariable int defense, @PathVariable int attack, @PathVariable int movement) {
		System.out.println(unitnaam);
		us.maakUnitAan(unitnaam, defense, attack, movement);
	}
	@GetMapping("/alles")
	public Iterable<Unit> alles() {
		return us.geefAlleUnits();
	}
	
	@PostMapping("/api/unit")
	public void maakUnit(@RequestBody Unit unit) {
		us.maakAan(unit);
	}	

	//is hetzelfde als regel 61: @RequestMapping(method = RequestMethod.PUT,value="/api/unit/{id}")
	
	@PutMapping("/api/unit/{id}")
	public void wijzigUnit(@PathVariable long id, @RequestBody Unit unit) {
		Optional<Unit> optional = us.findById(id);
		if (optional.isPresent()) {
			Unit u1 = optional.get();
			u1.setAttack(unit.getAttack());
			u1.setDefence(unit.getDefence());
			u1.setMovement(unit.getMovement());
			us.pasAan(u1);
		}
	}
	
	@DeleteMapping("/api/unit/{id}")
	public void verwijderUnit(@PathVariable long id) {
		Optional<Unit> optional = us.findById(id);
		if (optional.isPresent()) {
			us.verwijderen( optional.get());
		}
	}


}
