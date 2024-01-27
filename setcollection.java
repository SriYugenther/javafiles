import java.util.*;

class Student{
    String name;
    int regno;
    double mark1,mark2;

    Student(String name,int regno,double mark1,double mark2){
        this.name = name;
        this.regno = regno;
        this.mark1 = mark1;
        this.mark2 = mark2;

    }
    public String toString(){
        return name+","+regno;
    }
}
public class setcollection {
    public static void main(String args[]){

        //the names are printed based on the hashvalue 
        //which is based on the operating system not on the developers
        HashSet<Student> hs = new HashSet<Student>();
        hs.add(new Student("first",123,91,92));
        hs.add(new Student("second",124,92,93));
        hs.add(new Student("third",125,93,94));
        hs.add(new Student("fourth",126,94,95));
        hs.add(new Student("fifth",127,96,97));
       
        
        Iterator<Student> itr =hs.iterator();
        while(itr.hasNext()){
            Student obj1 = (Student) itr.next();//*explicit conversion to the student object is required
            double avg = (obj1.mark1+obj1.mark2)/2.0;
            System.out.println(obj1+"--->"+avg);
        }
        System.out.println(hs);
        
        
    }
}
