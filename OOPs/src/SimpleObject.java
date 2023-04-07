class parent
{
    int id;
    parent(int id)
    {
        this.id = id;
    }

    //overriding toString method to print the contents of class
    @Override
    public String toString() {
        return this.id+"";
    }
}
public class SimpleObject {
    public static void main(String[] args)
    {
        parent p = new parent(10);
        System.out.println(p);
    }
}
