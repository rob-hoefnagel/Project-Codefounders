package nl.gamehoefnagel.hoefnagel.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	private int defence;
	private int attack;
	private int movement;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getMovement() {
		return movement;
	}
	public void setMovement(int movement) {
		this.movement = movement;
	}
	public String getName() {
		return name;
	}
	public void setName(String naam) {
		this.name = naam;
	}
	
	

}
