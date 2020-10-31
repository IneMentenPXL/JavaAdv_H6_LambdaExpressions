package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameCollection {
    private List<VideoGame> videoGames = new ArrayList<>();

    public void addGame(VideoGame game) {
        videoGames.add(game);
    }

    public List<VideoGame> selectGames(Predicate<Object> filter) {
        List<VideoGame> gameList = new ArrayList<>();
        for (int i = 0; i < videoGames.size(); i++) {
            if (filter.test(videoGames.get(i))) {
                gameList.add(videoGames.get(i));
            }
        }
        return gameList;
    }
}
