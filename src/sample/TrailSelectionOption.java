package sample;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

    public class TrailSelectionOption {


        public ArrayList<Image> getListOfPicturesGivenTrailNumber(int trailNumber){
            ArrayList<Image> listOfAllPicturesInOneTrail = new ArrayList<>();
            File directory = new File("C:\\Users\\dgree\\IdeaProjects\\MoundsTrailExplorer\\resources\\Trail " + trailNumber);
            String[] fileExtension = new String[]{"jpg","JPG"};

            FilenameFilter fileFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    for (int i = 0; i < fileExtension.length; i++)
                    if (name.endsWith("." + fileExtension[i])){
                        return true;
                    }
                    return false;
                }
            };


            if (directory.isDirectory()){
                for (File f: Objects.requireNonNull(directory.listFiles(fileFilter))){
                    Image image = new Image(f.toURI().toString());
                    listOfAllPicturesInOneTrail.add(image);
                }
            }

            return listOfAllPicturesInOneTrail;

        }
    }
