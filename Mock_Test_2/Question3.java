class Person{
    private String name;
    private int age;
    private String address;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }


}


public class Question3 {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.setName("Neha");
        p.setAge(21);
        p.setAddress("bhopal M.P.");

        System.out.println("Name     : "+p.getName());
        System.out.println("Age      : "+p.getAge());
        System.out.println("Address  : "+p.getAddress());
    }
}
