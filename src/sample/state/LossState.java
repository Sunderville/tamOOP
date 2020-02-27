package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class LossState extends PetState {
    public LossState(Pet pet) {
        super(pet);
        _image = new ImagePattern(new Image(getClass().getResource("../images/1_"
                + _pet.getName() + "/5_" + _pet.getName() + "_dead.png").toExternalForm()));
    }
}
