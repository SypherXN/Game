package PokemonInfo;

public abstract class Moves {

	private final int attack;
	
	public Moves(int attack) {
		
		this.attack = attack;
		
	}
	
	public int getDamageDealt(int level, int power, int attack, int enemyDefense, int type, int enemyType) {
		
		int damageDealt;
		
		int modifier = 1;
		
		int critical = (int)(Math.random() * 2);
		
		if(critical == 1) {
			
			modifier *= 2;
			
		}
		
		damageDealt = (((((2 * level) / 5) + 2) * power * (attack / enemyDefense) / 50 ) * modifier);
		
		return damageDealt;
		
	}
	
	
}
