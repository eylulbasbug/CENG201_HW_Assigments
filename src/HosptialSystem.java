import java.util.HashMap;


public class HosptialSystem {
    public PatientList patientList;
    public TreatmentQueue priorityQueue;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer, Patient> hashMap;


    HosptialSystem() {     // Constructor: initializes all data structures
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        hashMap = new HashMap<>();
        priorityQueue = new TreatmentQueue();
    }

    public void addPatient(Patient p) {  //Adds a patient to the patient list and hashmap
        patientList.addPatient(p);
        hashMap.put(10, p);

    }

    public void push(Patient p) { //Pushes a discharged patient into the discharge stack and removes the patient from the treatment queue
        DischargeRecord dischargeRecord = new DischargeRecord();
        dischargeRecord.patientId = p.id;
        dischargeStack.push(dischargeRecord);
        treatmentQueue.dequeue();
    }

    public Patient findPatient(int id) {  //Finding and returning the patient with an id.
        return hashMap.get(id);
    }

    public boolean isPriority(TreatmentRequest treatmentRequest, Patient p) {
        if (p.severity > 6) { //The patient’s priority is determined based on severity.
            treatmentRequest.priority = true; // The patient’s priority status is verified.
        } else {
            treatmentRequest.priority = false;
        }
        return treatmentRequest.priority;
    }

    public void printQueue() {    //printing two lists consecutively and display them as a single list.
        priorityQueue.printQueue();
        treatmentQueue.printQueue();
    }

    public void currentState() {
        System.out.println();
        System.out.println("Current system state is");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();

        System.out.println("Patient List:");
        patientList.printList();
        System.out.println();
        System.out.println();

        System.out.println("Treatment Queue:");
        printQueue();
        System.out.println();
        System.out.println();

        System.out.println("Discharge Stack");
        dischargeStack.printStack();
        System.out.println();
    }

    public void treatmentProcess() { //removing the first patient from the queue  and adding them to the discharge list.
        DischargeRecord dischargeRecord = new DischargeRecord();
        if (priorityQueue.front != null) { // the most important list is priority queue
            dischargeRecord.patientId = priorityQueue.front.patientId;
            priorityQueue.dequeue();
            dischargeStack.push(dischargeRecord);
        } else {
            dischargeRecord.patientId = treatmentQueue.front.patientId; //if the priority queue is empty, apply the same operation to other queue.
            treatmentQueue.dequeue();
            dischargeStack.push(dischargeRecord);
        }
    }

    public void enqueue(TreatmentRequest request) {
        if (isPriority(request, request.patient)) { //Is the patient priority?
            priorityQueue.enqueue(request);
        } else {
            treatmentQueue.enqueue(request);
        }
    }

    public static Patient merge(Patient patientListHead) {  //Sorts patients by severity in descending order.
        if (patientListHead== null || patientListHead.next == null) return patientListHead;

        Patient middle = findMiddle(patientListHead);  //Finding middle recursively.
        Patient nextToMiddle = middle.next;
        middle.next = null;

        Patient left = merge(patientListHead);
        Patient right= merge(nextToMiddle);

        return sortedList(left, right);


    }

    public static Patient sortedList(Patient patient1, Patient patient2) {
        if (patient1 == null) return patient2;
        if (patient2 == null) return patient1;

        Patient selected;
        if (patient1.severity > patient2.severity){  // Higher severity patient comes first.
            selected = patient1;
            selected.next = sortedList(patient1.next, patient2);
        }
        else {
            selected = patient2;
            selected.next = sortedList(patient1, patient2.next);
        }
        return selected;
    }

    public static Patient findMiddle(Patient head){  //Finds the middle node of a linked list.
        if (head == null) return head;
        Patient turtle = head;  // slow pointer
        Patient rabbit = head.next;  //fast pointer

        while(rabbit!=null && rabbit.next!=null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

}




