package Main;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        //todo récupérer les informations des paramètres serializer dans un fichier
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Setting.height = size.height;
        Setting.width = size.width;

        Frame f = new Frame();
        System.out.print("Coucou");
    }
}
