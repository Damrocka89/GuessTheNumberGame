package academy.learnprogramming.service;

public interface GameService {

    boolean isGameOver();

    String getMainMassage();

    String getResultMessage();

    void checkGuess(int guess);

    void reset();


}
