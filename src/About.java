

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class About extends JFrame{
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(null);



        JLabel textLebel=new JLabel("<html>Welcome to my Notepad<br>Notepad is a small and fast notetaking app for making notes just any plain text content<cd> Features are-Simple interface that most of the users find easy to use<cd> No limits on note's length or number of notes<cd>Creating and editing text notes<cd> Importing notes from txt files and saving notes as txt files<cd> Sharing notes with other apps<cd> Example sending a note in Gmail<cd> For the completion of a project, Satya Prakash Sahu created this notepad<cd> All rights reserved@2022</html>");
        textLebel.setBounds(100,150,350,200);
        textLebel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        add(textLebel);
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
}

