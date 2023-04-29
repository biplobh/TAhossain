public class Wolf extends Enemy{
    private int height;
    public Wolf(int height)
    {

        super ( "Wolf", height,height);
        this.height = height;
    }
}