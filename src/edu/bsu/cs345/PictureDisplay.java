package edu.bsu.cs345;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

import java.util.ArrayList;

public class PictureDisplay {

        private ArrayList<Image> trailPicturesArray = new ArrayList<>();
        private int imagesIndex = 0;

        PictureDisplay(ArrayList<Image> trailImages){
            for (int i = 0; i < trailImages.size(); i++){
                swapToImageView(trailImages.get(i));
            }
        }

        private void swapToImageView(Image trailImage) {
            trailPicturesArray.add(trailImage);
        }

        protected Image createFirstImage(){
            return trailPicturesArray.get(imagesIndex);
        }

        protected Image getNextImage(){
            if (imagesIndex == trailPicturesArray.size() - 1){
                imagesIndex = 0;
            }
            else{
                imagesIndex++;
            }
            return trailPicturesArray.get(imagesIndex);
        }

        protected Image getPreviousImage(){
            if (imagesIndex == 0){
                imagesIndex = trailPicturesArray.size()-1;
            }
            else{
                imagesIndex--;
            }
            return trailPicturesArray.get(imagesIndex);
        }

    }

