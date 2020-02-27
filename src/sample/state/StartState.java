package sample.state;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import sample.pets.Pet;

public class StartState extends PetState {
    public StartState(Pet pet) {
        super(pet);
        _image = new ImagePattern(new Image(getClass().getResource("../images/1_"
                + _pet.getName() + "/" + "1_" + _pet.getName() +
                "_logo.png").toExternalForm()));
    }
}
