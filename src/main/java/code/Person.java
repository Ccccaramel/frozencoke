package code;
/* Edited by Frozencoke on 11th Jan 2024 */
public class Person {
    int age;
    public void setAge (int value){
        this.age = value;
    }
    public int getAge(){
        return this.age;
    }
    double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
    boolean healthy;

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
    public boolean getHealthy(){
        return this.healthy;
    }
    public static void main(String[] args){
        Person myPerson = new Person();
        myPerson.setAge(19);
        myPerson.setWeight(50);
        myPerson.setHealthy(true);
        System.out.println("age="+myPerson.getAge());
        System.out.println("weight="+myPerson.getWeight());
        System.out.println("healthy="+myPerson.getHealthy());



    }
}
