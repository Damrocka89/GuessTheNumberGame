package academy.learnprogramming.Config;

import academy.learnprogramming.GuessCount;
import academy.learnprogramming.MaxNumber;
import academy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages ="academy.learnprogramming")
public class GameConfig {

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:5}")
    private int minNumber;


    @Bean
    @MaxNumber
    public int getMaxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount() {
        return guessCount;
    }

    @Bean
    @MinNumber
    public int getMinNumber() {
        return minNumber;
    }

}
