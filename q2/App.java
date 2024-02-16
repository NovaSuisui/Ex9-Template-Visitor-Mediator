public class App {

	public static void main(String[] args) {
		Game game = new Game();
		game.setStrategy(new Football());
		game.play();
		game.setStrategy(new Basketball());
		game.play();
	}
}
