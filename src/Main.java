import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Classifier c = new Classifier(3);
    DataLoader load = new DataLoader("src/mnist_train.csv");
    ArrayList<Image> trainingSet = new ArrayList<>();
    try {
      trainingSet = load.loadData();
    }catch(FileNotFoundException e){
      System.out.println("We couldn't find the file");
    }
    if(trainingSet.size()!=0)
    c.train(trainingSet);
  }
}
