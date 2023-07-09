interface Animal{
    void makeSound();
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("Sound of Cat is : Meow");
    }
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Sound of Dog is : Bark");
    }
}

class Cow implements Animal{
    public void makeSound(){
        System.out.println("Sound of Cow is : Moo");
    }
}

public class Question1{

    public static void sound(Animal a){
        a.makeSound();
    }

    public static void main(String[] args) {
        

        sound(new Dog());
        sound(new Cat());
        sound(new Cow());

    }
}