package main.java.com.stackroute.junit;

public class MemberVariable {
    Member member =new Member();//creating a object of Member calss
    public String printValues(String name,int age,double salary)
    {
        member.name=name;//assigning values
        member.age=age;
        member.salary=salary;
        return "Member's name: "+member.name+"\n"+"Member's age: "+member.age+"\n"+"Member's salary: "+member.salary;
    }
}
