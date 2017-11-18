package PokemonInfo;

import java.util.*;

/*
 * Created by Matthew 11/15/17
 */

public class BasePokemon {

	public final String name;
	public final Type firstType, secondType;
	public final int hp, attack, defense, speed, number;
	
	/* Creates a reference to Pokemon that contains their stats and info
	 * @param name - name of the Pokemon
	 * @param type - type of the Pokemon
	 * @param hp - base hp of the Pokemon when caught
	 * @param attack - base attack of the Pokemon when caught
	 * @param defense - base defense of the Pokemon when caught
	 * @param speed - base speed of the Pokemon when caught
	 */
	public BasePokemon(String name, Type firstType, Type secondType, int hp, int attack, int defense, int speed, int number) {
		
		//Pokemon Info
		this.name = name;
		this.firstType = firstType;
		this.secondType = secondType;
		this.number = number;
		
		//Pokemon Base Stats
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		
	}
	
	public String getName() { return name; }
	
	public Type getFirstType() { return firstType; }
	
	public Type getSecondType() { return secondType; }
	
	public int getHP() { return hp; }
	
	public int getAttack() { return attack; }
	
	public int getDefense() { return defense; }
	
	public int getSpeed() { return speed; }
	
	public String toString() {
		
		String output = new String();
		
		output = "Name: " + name + "\nType: " + firstType.getName() + "," + secondType.getName() + "\nHP: " + hp + 
				"\nAttack: " + attack + "\nDefense: " + defense + "\nSpeed: " + speed + "\nNumber: " + number;
		
		return output;
		
	}
	
}
