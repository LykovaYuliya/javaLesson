package lesson_interface;

public class Animals implements Info {
    public int id;

    public Animals(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void showinfo(){
        System.out.println("Id is " + this.id);

    }
}