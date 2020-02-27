package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class HungryState extends PetState {
    public HungryState(Pet pet) {
        super(pet);
        _image = new ImagePattern(new Image(getClass().getResource("../images/1_"
                + _pet.getName() + "/4_" + _pet.getName() + "_sick.png").toExternalForm()));
    }
}
