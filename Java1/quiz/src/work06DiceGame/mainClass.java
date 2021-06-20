package work06DiceGame;

import work06DiceGame.Game;

public class mainClass {

	public static void main(String[] args) {
	
		/*
		 	필요한 요소(element)
		 	dice: random(1 ~ 6)
		 	Game loop		 
		 */
		
		Game game = new Game();
		game.gameplay();
	}
}
