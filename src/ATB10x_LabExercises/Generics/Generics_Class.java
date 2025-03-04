package ATB10x_LabExercises.Generics;

public class Generics_Class {

    public static void main(String[] args){

        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i.getObject());
    }
}


class Test <T>{  //if class is generic then after class name <T> operator will be used
    T obj;
    Test(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}
