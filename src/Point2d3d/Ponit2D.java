package Point2d3d;

public class Ponit2D {
    private float x;
    private float y;

    public Ponit2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public Ponit2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }

    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point2D:" +
                 "x=" + x +
                 "y=" + y +
                 "Array is:";
    }
}
