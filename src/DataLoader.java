import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class DataLoader {
  private static final int ROWS = 28;
  private static final int COLS = 28;
  String filePath;

  public DataLoader(String filepath) {
    this.filePath = filepath;
  }

  public ArrayList<Image> loadData() throws FileNotFoundException {
    Scanner s = new Scanner(new File(filePath));


    ArrayList<Image> images = new ArrayList<>();

    String line = s.nextLine();

    while (line != null) {

      String label = line.substring(0, line.indexOf(","));
      line = line.substring(line.indexOf(","));
      String[] data = line.split(",");


      int[][] image = new int[ROWS][COLS];
      int counter = 1;
      for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
          image[i][j] = Integer.parseInt(data[counter]);
          counter++;
        }
      }


      Image newImage = new Image(label, image);
      images.add(newImage);
      if (s.hasNextLine()) {
        line = s.nextLine();
      } else {
        break;
      }
    }
    return images;
  }
}
