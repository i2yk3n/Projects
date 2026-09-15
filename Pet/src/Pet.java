//Dylan Huguley
public class Pet {
    //Private Data field
    private String name;
    private String type;
    private int age;

    public Pet() {
        this.setName("Pet Name");
        this.setType("Animal");
        this.setAge(1);
    }
    public Pet(String newName, String newType, int newAge){
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    //public set for every private data field
    public void setName(String newName) {
        this.name = newName;
    }

    //public get for every private data field
    public String getName() {
        return this.name;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    //public toString method to prints out all  the object state
    public String toString() {
        String output = "Pet information:\n";
        output += "Pet type:" + this.getType() + "\n";
        output += "Pet name:" + this.getName() + "\n";
        output += "Sound:" + speak() + "\n";
        output += "Pet age:" + this.getAge() + "\n";
        return output;
    }
}
