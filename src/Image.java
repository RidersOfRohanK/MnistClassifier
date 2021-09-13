public class Image {
  int[][] data;
  String label;

  public Image(String label, int[][] image){
    this.label = label;
    this.data = image;
  }

  public int[][] getData() {
    return data;
  }

  public String getLabel() {
    return label;
  }

  public void setData(int[][] data) {
    this.data = data;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
