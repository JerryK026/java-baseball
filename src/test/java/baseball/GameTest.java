package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void initAnswer_무작위_세자리_수_세팅() {
        Game game = new Game();
        game.initAnswer();
        List<Integer> answer = game.getAnswer();
        assertThat(answer).hasSize(3);
    }

}
