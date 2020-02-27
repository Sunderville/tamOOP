package sample.state;

import javafx.scene.paint.ImagePattern;

public interface State {
    void toEat();
    void toWalk();
    void toHappy();
    void toHungry();
    void toLoss();
    void toStart();
    ImagePattern getImage();
}
