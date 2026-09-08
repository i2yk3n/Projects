//Dylan Huguley
public class Pet {
    //Private Data field
    private String name;
    //Public Constructor
    public Pet()
    {
        this.setName("");
    }
    //public set for every private data field
    public void setName(String newName)
    {
        this.name=newName;
    }
    //public get for every private data field
    public String getName()
    {
        return this.name;
    }
    //public toString method to prints out all  the object state
    public String toString()
    {
        String output ="Pet information:\nPet name:";
        output+= this.getName();
        return output;
    }
    //main
    public static void main(String[] args)
    {
        //pet instantiate
        Pet myPet1= new Pet();
        myPet1.setName("Fluffy");
        Pet myPet2= new Pet();
        myPet2.setName("Lucina");
        //pet print & format.
       System.out.println(myPet1);
        System.out.println(myPet2);
    }
}
