package practice.oop;

public class Pr6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

    }
}

class Student{
    String name;
    int classNo;
    int attendNo;
    int math;
    int korean;
    int english;
    int total;
    float average;

    public String info(){
        return name+","+classNo+","+attendNo+","+math+","+korean+","+english+","+total+","+average;
    }

    public Student(String name, int classNo, int attendNo, int math, int korean, int english) {
        this.name = name;
        this.classNo = classNo;
        this.attendNo = attendNo;
        this.math = math;
        this.korean = korean;
        this.english = english;
        this.total = math+korean+english;
        this.average = Math.round((total/3.0f)*10)/10f;
    }
}
