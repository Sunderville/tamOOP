package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class HappyState extends PetState {
    public HappyState(Pet pet) {
        super(pet);
        _image = new ImagePattern(new Image(getClass().getResource("../images/1_"
                + _pet.getName() + "/3_" + _pet.getName() + "_content.png").toExternalForm()));
    }
}
