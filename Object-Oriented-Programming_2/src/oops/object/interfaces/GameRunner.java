package oops.object.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//MarioGame game1=new MarioGame();
		GaminConsole_Example_to_Interface game1=new MarioGame(); 
		game1.up();
		game1.down();
		game1.right();
		//ChessGame game2=new ChessGame();
		GaminConsole_Example_to_Interface game2=new ChessGame();
		
		game2.up();
		game2.down();
		game2.left();
		game2.right();
		
		//Plymorphism
		
		GaminConsole_Example_to_Interface [] games= {new MarioGame(),new ChessGame()};
		for(GaminConsole_Example_to_Interface gamee:games) {
			gamee.up();      // same method but behaves differently 
			gamee.down();
		}

	}

}
