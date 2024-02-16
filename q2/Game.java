public class Game {
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public final void play() {
		strategy.initializeGame();
		strategy.playingGame();
		strategy.ShowResult();
	}
}
