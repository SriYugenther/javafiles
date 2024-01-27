import java.util.*;
class Student{
    String name;
    int regno;

    Student(String name,int regno){
        this.name = name;
        this.regno = regno;

    }
    public String toString(){
        return name+","+regno;
    }
}
class datacollection {
    public static void main(String args[]){
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student("sriyugenther", 12500));
        arr.add(new Student("maheswari", 12501));
        arr.add(new Student("bhuvaneswar", 12502));
        System.out.println("before remove method "+arr);
        arr.remove(2);
        System.out.println("after remove method "+arr);

        //converting arraylist to array
        Object[] obj = arr.toArray();
        System.out.println(obj[0]);
        System.out.println("good");
    }
}