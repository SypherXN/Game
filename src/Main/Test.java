package Main;

import Combat.*;
import Player.PokemonStorage;
import PokemonInfo.*;
import java.util.*;

public class Test {

	/*
	 * Created by Matthew 11/15/17
	 */
	
	public static void main(String [] args) {
		
		//Initializes the Resistances/Weaknesses/No Effects of the Types
		Pokedex.initResistances();
		Pokedex.initWeaknesses();
		Pokedex.initNoEffect();
		
		//Creates Pokemon Objects for Player Pokemons
		Pokemon Pokemon1 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon Pokemon2 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon Pokemon3 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon Pokemon4 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon Pokemon5 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon Pokemon6 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		
		//Creates Pokemon Objects for Enemy Pokemons
		Pokemon EPokemon1 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon EPokemon2 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon EPokemon3 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon EPokemon4 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon EPokemon5 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		Pokemon EPokemon6 = new Pokemon(Pokedex.basePokemons[(int)(Math.random() * (Pokedex.basePokemons.length - 1) + 1)], (int)(Math.random() * 100 + 1));
		
		
		//Prints out the information of Player Pokemon
		System.out.println("---------Pokemon 1---------");
		System.out.println(Pokemon1);
		System.out.println("---------Pokemon 2---------");
		System.out.println(Pokemon2);
		System.out.println("---------Pokemon 3---------");
		System.out.println(Pokemon3);
		System.out.println("---------Pokemon 4---------");
		System.out.println(Pokemon4);
		System.out.println("---------Pokemon 5---------");
		System.out.println(Pokemon5);
		System.out.println("---------Pokemon 6---------");
		System.out.println(Pokemon6);
		
		System.out.println();
		
		//Prints out the information for the Enemy Pokemon
		System.out.println("------Enemy Pokemon 1------");
		System.out.println(EPokemon1);
		System.out.println("------Enemy Pokemon 2------");
		System.out.println(EPokemon2);
		System.out.println("------Enemy Pokemon 3------");
		System.out.println(EPokemon3);
		System.out.println("------Enemy Pokemon 4------");
		System.out.println(EPokemon4);
		System.out.println("------Enemy Pokemon 5------");
		System.out.println(EPokemon5);
		System.out.println("------Enemy Pokemon 6------");
		System.out.println(EPokemon6);
		
		System.out.println();
		
		//Changes the Pokemon in the array to be the Player Pokemons
		PokemonStorage.changePokemon(Pokemon1,0);
		PokemonStorage.changePokemon(Pokemon2, 1);
		PokemonStorage.changePokemon(Pokemon3, 2);
		PokemonStorage.changePokemon(Pokemon4, 3);
		PokemonStorage.changePokemon(Pokemon5, 4);
		PokemonStorage.changePokemon(Pokemon6, 5);
		
		//Changes the Pokemon in the array to be the Enemy Pokemons
		EnemyStorage.changePokemon(EPokemon1, 0);
		EnemyStorage.changePokemon(EPokemon2, 1);
		EnemyStorage.changePokemon(EPokemon3, 2);
		EnemyStorage.changePokemon(EPokemon4, 3);
		EnemyStorage.changePokemon(EPokemon5, 4);
		EnemyStorage.changePokemon(EPokemon6, 5);
		
		//Creates Move Objects for the First Player Pokemon
		Move P1move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P1move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P1move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P1move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon1.changeMove(P1move1, 0);
		Pokemon1.changeMove(P1move2, 1);
		Pokemon1.changeMove(P1move3, 2);
		Pokemon1.changeMove(P1move4, 3);
		
		//Creates Move Objects for the Second Player Pokemon
		Move P2move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P2move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P2move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P2move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon2.changeMove(P2move1, 0);
		Pokemon2.changeMove(P2move2, 1);
		Pokemon2.changeMove(P2move3, 2);
		Pokemon2.changeMove(P2move4, 3);
		
		//Creates Move Objects for the Third Player Pokemon
		Move P3move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P3move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P3move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P3move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon3.changeMove(P3move1, 0);
		Pokemon3.changeMove(P3move2, 1);
		Pokemon3.changeMove(P3move3, 2);
		Pokemon3.changeMove(P3move4, 3);
		
		//Creates Move Objects for the Fourth Player Pokemon
		Move P4move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P4move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P4move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P4move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon4.changeMove(P4move1, 0);
		Pokemon4.changeMove(P4move2, 1);
		Pokemon4.changeMove(P4move3, 2);
		Pokemon4.changeMove(P4move4, 3);
		
		//Creates Move Objects for the Fifth Player Pokemon
		Move P5move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P5move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P5move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P5move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon5.changeMove(P5move1, 0);
		Pokemon5.changeMove(P5move2, 1);
		Pokemon5.changeMove(P5move3, 2);
		Pokemon5.changeMove(P5move4, 3);
		
		//Creates Move Objects for the Sixth Player Pokemon
		Move P6move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P6move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P6move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move P6move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		Pokemon6.changeMove(P6move1, 0);
		Pokemon6.changeMove(P6move2, 1);
		Pokemon6.changeMove(P6move3, 2);
		Pokemon6.changeMove(P6move4, 3);
		
		//Creates Move Objects for the First Enemy Pokemon
		Move EP1move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP1move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP1move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP1move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		EPokemon1.changeMove(EP1move1, 0);
		EPokemon1.changeMove(EP1move2, 1);
		EPokemon1.changeMove(EP1move3, 2);
		EPokemon1.changeMove(EP1move4, 3);
		
		//Creates Move Objects for the Second Enemy Pokemon
		Move EP2move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP2move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP2move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP2move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		EPokemon2.changeMove(EP2move1, 0);
		EPokemon2.changeMove(EP2move2, 1);
		EPokemon2.changeMove(EP2move3, 2);
		EPokemon2.changeMove(EP2move4, 3);
		
		//Creates Move Objects for the Third Enemy Pokemon
		Move EP3move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP3move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP3move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP3move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		EPokemon3.changeMove(EP3move1, 0);
		EPokemon3.changeMove(EP3move2, 1);
		EPokemon3.changeMove(EP3move3, 2);
		EPokemon3.changeMove(EP3move4, 3);
		
		//Creates Move Objects for the Fourth Enemy Pokemon
		Move EP4move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP4move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP4move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP4move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		EPokemon4.changeMove(EP4move1, 0);
		EPokemon4.changeMove(EP4move2, 1);
		EPokemon4.changeMove(EP4move3, 2);
		EPokemon4.changeMove(EP4move4, 3);
		
		//Creates Move Objects for the Fifth Enemy Pokemon
		Move EP5move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP5move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP5move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP5move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
	
		//Changes Pokemon's Move Array
		EPokemon5.changeMove(EP5move1, 0);
		EPokemon5.changeMove(EP5move2, 1);
		EPokemon5.changeMove(EP5move3, 2);
		EPokemon5.changeMove(EP5move4, 3);
		
		//Creates Move Objects for the Sixth Enemy Pokemon
		Move EP6move1 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP6move2 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP6move3 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		Move EP6move4 = new Move(Pokedex.baseMoves[(int)(Math.random() * (Pokedex.baseMoves.length - 1)) + 1]);
		
		//Changes Pokemon's Move Array
		EPokemon6.changeMove(EP6move1, 0);
		EPokemon6.changeMove(EP6move2, 1);
		EPokemon6.changeMove(EP6move3, 2);
		EPokemon6.changeMove(EP6move4, 3);
		
		while (!PokemonStorage.checkLoss() && !EnemyStorage.checkLoss()) {
			
			//Calls the Combat Menu from UI
			UI.combatMenu();
			
			//Informs the Player of the different states and HP of the Pokemons
			System.out.println("\nEnemy " + Battle.enemy.base.name + " Health: " + Battle.enemy.hp);
			System.out.println("Your " + UI.pokemon.base.name + " Health: " + UI.pokemon.hp + "\n");
			
			//Checks if the Enemy has lost the battle
			if (EnemyStorage.checkLoss()) {
				
				System.out.println("You won the battle");
				System.exit(0);
				
			}
			
			//Checks if the Player has lost the battle
			if (PokemonStorage.checkLoss()) {
				
				System.out.println("You lost the battle");
				System.exit(0);
				
			}
			
			//Will change out the Enemy Pokemon and will inform the Player of the new Pokemon
			if (Battle.nextPokemon())
				System.out.println("The enemy sends out " + Battle.enemy.base.name);
		
		}
		
	}
	
}
