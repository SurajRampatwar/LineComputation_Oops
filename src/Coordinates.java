public class Coordinates {
   private int x1, x2, y1, y2;

    public Coordinates(int x1, int x2, int y1, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

    }
    Double lengthOfLine(){
      Double  lengthOfLine=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      return lengthOfLine;
    }
    public void equalityOflines(Double line1, Double line2) {
        if (line1.equals(line2)) {
            System.out.println("Line1 and Line2 are equal");
        } else {
            System.out.println("Line and Line2 are different");
        }
    }
}

