//package application;
import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

class VideoLecture extends Application {

    public void start(Stage primaryStage) {
        // TODO Auto-generated method stub
        //Initialising path of the media file, replace this with your file path
        String path =  "\"C:\\\\Users\\\\arundhati\\\\downloads/Bhoot(2020).mvk";

        //Instantiating Media class
        Media media = new Media(new File(path).toURI().toString());

        //Instantiating MediaPlayer class
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        //Instantiating MediaView class
        MediaView mediaView = new MediaView(mediaPlayer);

        //by setting this property to true, the Video will be played
        mediaPlayer.setAutoPlay(true);

        //setting group and scene
        Group root = new Group();
        root.getChildren().add(mediaView);
        Scene scene = new Scene(root,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Playing video");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}




//import java.awt.BorderLayout;
//import java.awt.Component;
//import java.net.MalformedURLException;
//import java.net.URL;
//import javax.media.*;
//import javax.media.Manager;
//import javax.media.MediaLocator;
//import javax.media.Player;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//
///**
// *
// * @author BUDDHIMA
// */
//
//public class MediaPlayer extends javax.swing.JPanel {
//
//    public MediaPlayer(URL mediauUrl) {
//
//        initComponents();
//
//        setLayout(new BorderLayout());
//
//        try {
//
//            Player mediaPlayer=Manager.createRealizedPlayer(new MediaLocator(mediauUrl));
//
//            Component video=mediaPlayer.getVisualComponent();
//
//            Component control=mediaPlayer.getControlPanelComponent();
//
//            if (video!=null) {
//
//                add(video, BorderLayout.CENTER);          // place the video component in the panel
//
//            }
//
//            add(control, BorderLayout.SOUTH);            // place the control in  panel
//
//            mediaPlayer.start();
//
//        } catch (Exception e) {
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        JFileChooser fileChooser = new JFileChooser();
//
//        fileChooser.showOpenDialog(null);
//
//        URL mediaUrl=null;
//
//        try {
//
//            mediaUrl = fileChooser.getSelectedFile().toURI().toURL();
//
//        } catch (MalformedURLException ex) {
//
//            System.out.println(ex);
//
//        }
//
//        JFrame mediaTest = new JFrame( "Movie Player" );
//
//        mediaTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//
//        MediaPlayer mediaPanel = new MediaPlayer( mediaUrl );
//
//        mediaTest.add( mediaPanel );
//
//        mediaTest.setSize( 800, 700 ); // set the size of the player
//
//        mediaTest.setLocationRelativeTo(null);
//
//        mediaTest.setVisible( true );
//
//    }
//
//}