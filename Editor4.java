import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int steps = Integer.parseInt(args[1]);
        Color[][] imageIn = Runigram.read(fileName);
        Color[][] imageBlack = Runigram.setToBlack(imageIn);
        Color[][] imageWhite = Runigram.setToWhite(imageIn);

        Runigram.setCanvas(imageIn);
        Runigram.morph(imageIn, imageWhite, steps);
        Runigram.morph(imageIn, imageBlack, steps);

    }
}
