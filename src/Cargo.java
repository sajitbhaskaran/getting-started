public class Cargo {
    private String name;
    private String description;
    private Double length;
    private Double width;
    public void setName(String name)
    {
           this.name = name;
    }
    public void setDescription(String description)
    {
           this.description = description;
    }
    public void setLength(Double length)
    {
           this.length = length;
    }
    public void setWidth(Double width) 
    {
           this.width = width;
    }
    public void displayCargoDetails()
    {
    System.out.println("Name : " + name);
    System.out.println("Description : " + description);
    System.out.println("Length : " + length + " cm");
    System.out.println("Width : " + width + " cm");
    }
} // end of class Cargo
