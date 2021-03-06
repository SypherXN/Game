package PokemonInfo;

import java.util.*;

public class BasePokemon {

	/*
	 * Created by Matthew 11/15/17
	 */

	private final String name;
	private final Type firstType, secondType;
	private final int hp, attack, defense, speed, number;
	private final int hpMod, attackMod, defenseMod, speedMod;
	private final int evolveLevel;
	
	
	/** Creates a reference to Pokemon that contains their stats and info
	 * 
	 * @param name - name of the Pokemon
	 * @param firstType - first type of the Pokemon
	 * @param secondType - second type of the Pokemon
	 * @param number - pokedex number of the Pokemon
	 * @param evolveLevel - level the Pokemon can evolve at
	 * @param hp - base hp of the Pokemon when caught
	 * @param attack - base attack of the Pokemon when caught
	 * @param defense - base defense of the Pokemon when caught
	 * @param speed - base speed of the Pokemon when caught
	 * @param hpMod - hp modifier for leveling up
	 * @param attackMod - attack modifier for leveling up
	 * @param defenseMod - defense modifier for leveling up
	 * @param speedMod - speed modifier for leveling up
	 */
	public BasePokemon(String name, Type firstType, Type secondType, int hp, int attack, int defense, int speed, int number, int topHP, int topAttack, int topDefense, int topSpeed, int evolveLevel) {
		
		//Pokemon Info
		this.name = name;
		this.firstType = firstType;
		this.secondType = secondType;
		this.number = number;
		this.evolveLevel = evolveLevel;
		
		//Pokemon Base Stats
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		
		//Pokemon Stats Modifiers
		this.hpMod = (topHP - hp) / 100;
		this.attackMod = (topAttack - attack) / 100;
		this.defenseMod = (topDefense - defense) / 100;
		this.speedMod = (topSpeed - speed) / 100;
		
	}
	
	/** Zero-Arg Constructor for NoBasePokemon */
	public BasePokemon() {
		
		//Pokemon Info
		this.name = "";
		this.firstType = Pokedex.NoType;
		this.secondType = Pokedex.NoType;
		this.number = 0;
		this.evolveLevel = 101;
		
		//Pokemon Base Stats
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
		this.speed = 0;
		
		//Pokemon Stats Modifiers
		this.hpMod = 0;
		this.attackMod = 0;
		this.defenseMod = 0;
		this.speedMod = 0;
		
	}
	
	//Accessor methods to get instance variables
	public String getName() { return name; }
	public Type getFirstType() { return firstType; }
	public Type getSecondType() { return secondType; }
	public int getHP() { return hp; }
	public int getAttack() { return attack; }
	public int getDefense() { return defense; }
	public int getSpeed() { return speed; }
	public int getNumber() { return number; }
	public int getHPMod() { return hpMod; }
	public int getAttackMod() { return attackMod; }
	public int getDefenseMod() { return defenseMod; }
	public int getSpeedMod() { return speedMod; }
	public int getEvolveLevel() { return evolveLevel; }
	
	/** Test print to make sure BasePokemon objects work */
	public String toString() {
		
		String output = new String();
		
		output = "Name: " + name + "\nType: " + firstType.getName() + "," + secondType.getName() + "\nHP: " + hp + 
				"\nAttack: " + attack + "\nDefense: " + defense + "\nSpeed: " + speed + "\nNumber: " + number;
		
		return output;
		
	}
	
}
