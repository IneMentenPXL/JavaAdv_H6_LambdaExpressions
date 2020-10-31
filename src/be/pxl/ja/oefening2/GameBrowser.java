package be.pxl.ja.oefening2;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		return gameCollection.selectGames(o -> {
			VideoGame game = (VideoGame) o;
			return game.getPrice() == 0;
		});
	}

	public List<VideoGame> showGamesInGenre(String action) {
		return gameCollection.selectGames(o -> {
			VideoGame game = (VideoGame) o;
			return game.getGenres().contains(action);
		});
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		return gameCollection.selectGames(new Predicate<Object>() {
			@Override
			public boolean test(Object o) {
				VideoGame game = (VideoGame) o;
				return game.getName().toLowerCase().contains(cd.toLowerCase());
			}
		});
	}
}
