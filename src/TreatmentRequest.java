public class TreatmentRequest {  //creating  queue class
    int patientId; //ID of the patient requesting treatment
    long arrivalTime; //Timestamp of the request
    TreatmentRequest next;
    boolean priority;
    Patient patient;


    public TreatmentRequest(){  //non-parameterized constructor
        patientId=0;
        arrivalTime=System.currentTimeMillis();
        next=null;
        priority = false;
        patient = null;
    }


    public TreatmentRequest(Patient p){  //parameterized constructor
        this.patientId=p.id;
        this.arrivalTime=System.currentTimeMillis();
        this.next=null;
        this.priority = false;
        this.patient = p;
    }
}

