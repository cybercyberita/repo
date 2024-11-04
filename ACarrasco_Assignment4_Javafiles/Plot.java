
public class Plot 
{
    private int x;
    private int y;
    private int depth;
    private int width;

    public Plot()
    {
        this.x = 0;
        this.y = 0;
        this.depth = 1;
        this.width = 1;
    }

    public Plot(int x, int y, int depth, int width)
    {
        this.x = x;
        this.y = y;
        this.depth = depth;
        this.width = width;
    }

    public Plot(Plot otherPlot)
    {
        this.x = otherPlot.getX();
        this.y = otherPlot.getY();
        this.depth = otherPlot.getDepth();
        this.width = otherPlot.getWidth();
    }

    public boolean overlaps(Plot otherPlot)
    {

        if(x + width > otherPlot.getX() && y + depth > otherPlot.getY()) 
            return true;
	    else 
            return false;

    }

    public boolean encompasses(Plot otherPlot)
    {
        if(x + width >= otherPlot.getX() + otherPlot.getWidth() 
        && y + depth >= otherPlot.getY() + otherPlot.getDepth()) 
            return true;
	    else 
            return false;

    }

    public String toString()
    {
        return String.format("%d,%d,%d,%d", x, y, depth, width);
    }

    public int getX()
    { return x; }

    public int getY()
    { return y; }

    public int getDepth() 
    { return depth; }
    
    public int getWidth() 
    { return width; }

    public void setX(int x)
    { this.x = x; }

    public void setY(int y) 
    { this.y = y; }

    public void setDepth(int depth) 
    { this.depth = depth; }

    public void setWidth(int width) 
    { this.width = width; }
}
