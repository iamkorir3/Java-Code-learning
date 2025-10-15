public class Rectanle {
    private  int width=1;
      private int height= 1;

     public  void  setWidth(int w) {
        width = w;
    }
     public void setHeight(int h) {
        height = h;
    }

    void calculateArea(){
        System.err.println("Rectanle area is "+( width * height));
    }
}
