//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    TreatmentRequest number6 = new TreatmentRequest();
    TreatmentRequest number7 = new TreatmentRequest();
    TreatmentRequest number8 = new TreatmentRequest();
    TreatmentRequest number9 = new TreatmentRequest();
    TreatmentRequest number10 = new TreatmentRequest();
    TreatmentRequest number11 = new TreatmentRequest();
    TreatmentRequest number12 = new TreatmentRequest();
    TreatmentRequest number13 = new TreatmentRequest();

    TreatmentQueue queue = new TreatmentQueue();

    number6.patientId=123456;
    number7.patientId=987456;
    number8.patientId=541638;
    number9.patientId=468216;
    number10.patientId=762468;
    number11.patientId=531895;
    number12.patientId=697514;
    number13.patientId=736954;

    queue.enqueue(number6);
    queue.enqueue(number7);
    queue.enqueue(number8);
    queue.enqueue(number9);
    queue.enqueue(number10);
    queue.enqueue(number11);
    queue.enqueue(number12);
    queue.enqueue(number13);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    queue.printQueue();
}
