package sample;

import javafx.scene.image.Image;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Objects;

    public class TrailSelectionOption {

        ArrayList<Trail> trailList = new ArrayList<>();

        public ArrayList<Image> getListOfPicturesGivenTrailNumber(int trailNumber){
            File directory = new File("C:\\Users\\dgree\\IdeaProjects\\MoundsTrailExplorer\\resources\\Trail " + trailNumber);
            String[] fileExtension = new String[]{"jpg","JPG", "png"};
            FilenameFilter fileFilter = createFileFilter(fileExtension);
            return createImageList(directory, fileFilter);
        }

        private ArrayList<Image> createImageList(File directory, FilenameFilter fileFilter){
            ArrayList<Image> listOfAllPicturesInOneTrail = new ArrayList<>();
            if (directory.isDirectory()){
                for (File f: Objects.requireNonNull(directory.listFiles(fileFilter))){
                    Image image = new Image(f.toURI().toString());
                    listOfAllPicturesInOneTrail.add(image);
                }
            }
            return listOfAllPicturesInOneTrail;
        }

        private FilenameFilter createFileFilter(String[] fileExtension){
            return (dir, name) -> {
                for (String aFileExtension : fileExtension)
                    if (name.endsWith("." + aFileExtension)) {
                        return true;
                    }
                return false;
            };
        }
    }
