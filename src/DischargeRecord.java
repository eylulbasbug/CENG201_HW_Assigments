public class DischargeRecord {  //creating stack class
    int patientId;  //ID of the patient requesting treatment
    long dischargeTime;  //Timestamp of the request
    DischargeRecord next;

    public DischargeRecord(){  //non-parameterized constructor
        patientId=0;
        dischargeTime=System.currentTimeMillis();
        next=null;
    }

    public DischargeRecord(int patientId){  //parameterized constructor
        this.patientId=patientId;
        this.next=null;
        this.dischargeTime=System.currentTimeMillis();

    }
}
