package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class PetState implements State {
    protected Pet _pet;
    protected ImagePattern _image;

    public PetState(Pet pet) {
        _pet = pet;
    }

    @Override
    public void toEat() {
        _pet.setState(_pet.getStart());
    }

    @Override
    public void toWalk() {
        _pet.setState(_pet.getWalk());
    }

    @Override
    public void toHappy() {
        _pet.setState(_pet.getHappy());
    }

    @Override
    public void toHungry() {
        _pet.setState(_pet.getHungry());
    }

    @Override
    public void toLoss() {
        _pet.setState(_pet.getLoss());
    }

    @Override
    public void toStart() {
        _pet.setState(_pet.getStart());
    }

    @Override
    public ImagePattern getImage() { return _image; }
}
