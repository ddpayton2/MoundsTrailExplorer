package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Controller {

    public ImageView pictureDisplayBox;
    /*private void changeTitleText(Button selectedButton, Label label) {
            label.setText(selectedButton.getLabel());
        }*/
    private TrailSelectionOption trailSelectionOption = new TrailSelectionOption();
    private ArrayList<Image> currentSelection;
    private PictureDisplay currentDisplay;

    public void trailOneButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(1);
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void trailTwoButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(2);
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void trailThreeButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(3);
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void trailFourButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(4);
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void trailFiveButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(5);
        currentDisplay = new PictureDisplay(currentSelection);
        pictureDisplayBox.setImage(currentDisplay.createFirstImage());
    }

    public void trailSixButtonSelected(ActionEvent actionEvent) {
        currentSelection = trailSelectionOption.getListOfPicturesGivenTrailNumber(6);
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
