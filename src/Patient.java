public class Patient {
    int id;
    int age;
    int severity;
    String name;
    int size;
    Patient next;

    public Patient(){ //Non-parameterized constructor
        id=0;
        age=0;
        severity=0;
        name=null;
        next=null;
    }
    public Patient(int id, int age, int severity, String name, Patient next){ //parameterized constructor
        this.id=id;
        this.age=age;
        this.severity=severity;
        this.name=name;
        this.next=next;
    }
}
