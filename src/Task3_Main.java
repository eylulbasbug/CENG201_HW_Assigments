//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    DischargeRecord patient1 = new DischargeRecord();
    DischargeRecord patient2 = new DischargeRecord();
    DischargeRecord patient3 = new DischargeRecord();
    DischargeRecord patient4 = new DischargeRecord();
    DischargeRecord patient5 = new DischargeRecord();

    patient1.patientId=856324;
    patient2.patientId=529746;
    patient3.patientId=862547;
    patient4.patientId=963575;
    patient5.patientId=951234;


    DischargeStack stack = new DischargeStack();

    stack.push(patient1);
    stack.push(patient2);
    stack.push(patient3);
    stack.push(patient4);
    stack.push(patient5);
    System.out.println();

    stack.pop();
    stack.pop();
    System.out.println();

    stack.printStack();



}
