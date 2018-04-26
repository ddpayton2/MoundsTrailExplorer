package edu.bsu.cs345;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Controller {

    public ImageView pictureDisplayBox;
    private TrailSelectionOption trailSelectionOption = new TrailSelectionOption();
    private ArrayList<Image> currentSelection;
    private PictureDisplay currentDisplay;
    private String currentTrailTitle;

    public void trailButtonSelected(ActionEvent actionEvent){
        Button selectedTrailButton = (Button) actionEvent.getSource();
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(Integer.parseInt(selectedTrailButton.getId()));
        currentTrailTitle = trailSelectionOption.getTrailInformationGivenTrailNumber(Integer.parseInt(selectedTrailButton.getId()));
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void previousButtonSelected(ActionEvent actionEvent) {
        pictureDisplayBox.setImage(currentDisplay.getPreviousImage());
    }

    public void nextButtonSelected(ActionEvent actionEvent) {
        pictureDisplayBox.setImage(currentDisplay.getNextImage());
    }
}
