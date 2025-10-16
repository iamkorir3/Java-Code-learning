

public class Rectanle {
    private  int width=1;
      private int height= 1;

      public Rectanle(int w, int h){
       setWidth(w);
      setHeight(h);
       

      }

     public  void  setWidth(int w) {
        width = w;
    }
     public void setHeight(int h) {
        height = h;
    }

    int getHeight() {
        return height;
    }
    int getWidth() {
        return width;
    }

    void perimeter(){
        System.err.println("perimeter is: "+((2*height)+(2*width)));
    }

    void calculateArea(){
        System.err.println("Rectanle area is "+( width * height));
    }


}
