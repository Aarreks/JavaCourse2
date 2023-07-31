public abstract class Shape {

    protected String name;
    protected String textDescription;

    abstract protected double area();

    protected String getDescription() {return getName() + ": " + textDescription;}
    protected String getName() {return name;}

    @Override
    public String toString()
    {
        return name;
    }

    protected void setDescription(String description)
    {
        textDescription = description;
    }

    protected void setName(String name)
    {
        this.name = name;
    }

    public boolean canFitInside(Shape s)
    {
        return (this != s) 
            && (this instanceof TwoDimensionalShape)
            && (s instanceof TwoDimensionalShape) 
            && (this.calculatePerimeter() <= s.calculatePerimeter());
    }

    // TODO replace this with perimiter methods
    public static double calculateHypotenuse(int width, int height)
    {
        return Math.sqrt(width * width + height * height);
    }
}


