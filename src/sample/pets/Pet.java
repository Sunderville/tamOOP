package sample.pets;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import sample.state.*;

import java.io.Serializable;


public class Pet implements Serializable {
    private String _name;
    private double _size;
    private ImagePattern _foodImage;

    private State _start;
    private State _happy;
    private State _hungry;
    private State _walk;
    private State _loss;

    private State _state;
    private int _begin = 0;



    protected boolean hungry = false;
    protected boolean happy = false;
    protected boolean walk = false;

    public Pet(String name) {
        _name = name;
        _size = 1.0;
        _foodImage = new ImagePattern(new Image(getClass().getResource("../images/5_Food/" + _name + "_food.png").toExternalForm()));


        _start = new StartState(this);
        _walk = new FunnyState(this);
        _happy = new HappyState(this);
        _hungry = new HungryState(this);
        _loss = new LossState(this);

        if(_begin == 0) {
            _state = _start;
            _begin++;
        }
    }
    public void toStart(Rectangle rect) {
        _state.toStart();
        rect.setFill(_state.getImage());
    }
    public void toHappy(Rectangle rect) {
        _state.toHappy();
        rect.setFill(_state.getImage());
    }
    public void toHungry(Rectangle rect) {
        _state.toHungry();
        rect.setFill(_state.getImage());
    }
    public void toEat(Rectangle rect) {
        _state.toEat();
        rect.setFill(_state.getImage());
    }
    public void toWalk(Rectangle rect) {
        _state.toWalk();
        rect.setFill(_state.getImage());
    }
    public void toLoss(Rectangle rect) {
        _state.toLoss();
        rect.setFill(_state.getImage());
    }

    public void setState(State state) { _state = state; }

    public ImagePattern getFoodImage() { return _foodImage; }

    public State getStart() { return _start; }
    public State getHappy() { return _happy; }
    public State getHungry() { return _hungry; }
    public State getWalk() { return _walk; }
    public State getLoss() { return _loss; }
    public State getState() { return _state; }


    public String getName() {
        return _name;
    }
    public double getSize() {
        return _size;
    }

}
