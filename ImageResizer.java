import java.io.File;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ImageResizer {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        // Chemin vers le dossier contenant les images
        String inputDir = "C:\\Users\\n" + //
                "icot\\Desktop\\SIIL\\img_concombre\\concombre\\test";

        // Chemin vers le dossier où les images redimensionnées seront sauvegardées
        String outputDir = "C:\\Users\\n" + //
                "icot\\Desktop\\SIIL\\img_concombre\\concombre\\test";

        // Liste des fichiers dans le dossier d'entrée
        File dir = new File(inputDir);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".jpg") || name.endsWith(".png"));

        // Parcourez chaque fichier dans le dossier d'entrée
        for (File file : files) {
            String inputFilePath = file.getAbsolutePath();
            String outputFilePath = outputDir + File.separator + file.getName();

            // Chargez l'image
            Mat src = Imgcodecs.imread(inputFilePath);

            // Obtenez les dimensions de l'image
            int width = src.width();
            int height = src.height();

            // Calculez la quantité de padding nécessaire
            int padding;
            if (width > height) {
                padding = (width - height) / 2;
                Core.copyMakeBorder(src, src, padding, padding, 0, 0, Core.BORDER_CONSTANT);
            } else {
                padding = (height - width) / 2;
                Core.copyMakeBorder(src, src, 0, 0, padding, padding, Core.BORDER_CONSTANT);
            }

            // Redimensionnez l'image à 224x224 pixels
            Mat dst = new Mat();
            Size dsize = new Size(512, 512);
            Imgproc.resize(src, dst, dsize);

            // Sauvegardez l'image redimensionnée
            Imgcodecs.imwrite(outputFilePath, dst);
        }
    }
}
