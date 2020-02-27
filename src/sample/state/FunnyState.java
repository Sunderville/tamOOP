package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class FunnyState extends PetState {
    public FunnyState(Pet pet) {
        super(pet);
        _image = new ImagePattern(new Image(getClass().getResource("../images/1_"
                + _pet.getName() + "/2_" + _pet.getName() + "_walks.png").toExternalForm()));
    }
}
