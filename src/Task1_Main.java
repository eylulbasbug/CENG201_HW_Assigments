//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    PatientList list = new PatientList();
    Patient number1 = new Patient();
    Patient number2 = new Patient();
    Patient number3 = new Patient();
    Patient number4 = new Patient();
    Patient number5 = new Patient();

    number1.id=108420;
    number1.age=21;
    number1.severity=3;
    number1.name="phil";

    number2.id=100181;
    number2.age=25;
    number2.severity=4;
    number2.name="claire";

    number3.id=328152;
    number3.age=46;
    number3.severity=1;
    number3.name="manny";

    number4.id=168149;
    number4.age=51;
    number4.severity=5;
    number4.name="gloria";

    number5.id=150220;
    number5.age=17;
    number5.severity=4;
    number5.name="hailey";


    list.addPatient(number1);
    list.addPatient(number2);
    list.addPatient(number3);
    list.addPatient(number4);
    list.addPatient(number5);

    list.removePatient(100181);
    list.findPatient(168149);
    list.printList();
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
}
