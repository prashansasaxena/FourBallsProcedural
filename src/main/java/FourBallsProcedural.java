import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    public static int x=0;


    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("printed called from setup method");
        super.setup();

    }

    @Override
    public void draw() {
        //System.out.println("called from draw method");
       for(int i=1;i<=4;i++) {
           ellipse(i*x,(HEIGHT*i)/5, DIAMETER,DIAMETER);

       }
        x++;


    }



}
