package sample;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

    public class TrailSelectionOption {


        public ArrayList<BufferedImage> getListOfPicturesGivenTrailNumber(int trailNumber){
            ArrayList<BufferedImage> listOfAllPicturesInOneTrail = new ArrayList<>();
            File directory = new File("C:\\Users\\dgree\\IdeaProjects\\MoundsTrailExplorer\\resources\\Trail " + trailNumber);
            String fileExtension = "jpg";

            FilenameFilter fileFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (name.endsWith("." + fileExtension)){
                        return true;
                    }
                    return false;
                }
            };

            if (directory.isDirectory()){
                for (File f: Objects.requireNonNull(directory.listFiles(fileFilter))){
                    BufferedImage img = null;
                    try{
                        img = ImageIO.read(f);
                    }
                    catch(IOException ioe){

                    }
                    listOfAllPicturesInOneTrail.add(img);
                }
            }

            return listOfAllPicturesInOneTrail;

        }
    }
