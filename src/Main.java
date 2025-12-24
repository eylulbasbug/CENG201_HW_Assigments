import java.util.*;

   void main() {

    //menu();

    HosptialSystem hosptialSystem = new HosptialSystem();

    Patient number1 = new Patient();
    Patient number2 = new Patient();
    Patient number3 = new Patient();
    Patient number4 = new Patient();
    Patient number5 = new Patient();
    Patient number6 = new Patient();
    Patient number7 = new Patient();
    Patient number8 = new Patient();
    Patient number9 = new Patient();
    Patient number10 = new Patient();


    number1.id = 108420;
    number1.age = 21;
    number1.severity = 3;
    number1.name = "manny";

    number2.id = 100181;
    number2.age = 25;
    number2.severity = 4;
    number2.name = "hailey";

    number3.id = 328152;
    number3.age = 46;
    number3.severity = 9;
    number3.name = "claire";

    number4.id = 168149;
    number4.age = 51;
    number4.severity = 5;
    number4.name = "phil";

    number5.id = 150220;
    number5.age = 17;
    number5.severity = 4;
    number5.name = "gloria";

    number6.id = 112551;
    number6.age = 4;
    number6.severity = 7;
    number6.name = "lily";

    number7.id = 125687;
    number7.age = 38;
    number7.severity = 8;
    number7.name = "mitchell";

    number8.id = 213958;
    number8.age = 43;
    number8.severity = 2;
    number8.name = "cam";

    number9.id = 146826;
    number9.age = 8;
    number9.severity = 1;
    number9.name = "luke";

    number10.id = 854220;
    number10.age = 16;
    number10.severity = 5;
    number10.name = "alex";


    hosptialSystem.addPatient(number1);
    hosptialSystem.addPatient(number2);
    hosptialSystem.addPatient(number3);
    hosptialSystem.addPatient(number4);
    hosptialSystem.addPatient(number5);
    hosptialSystem.addPatient(number6);
    hosptialSystem.addPatient(number7);
    hosptialSystem.addPatient(number8);
    hosptialSystem.addPatient(number9);
    hosptialSystem.addPatient(number10);

    hosptialSystem.patientList.head = hosptialSystem.merge(hosptialSystem.patientList.head);
    hosptialSystem.patientList.printList();


    TreatmentRequest number11 = new TreatmentRequest(number1);
    TreatmentRequest number12 = new TreatmentRequest(number2);
    TreatmentRequest number13 = new TreatmentRequest(number3);
    TreatmentRequest number14 = new TreatmentRequest(number4);
    TreatmentRequest number15 = new TreatmentRequest(number5);
    TreatmentRequest number16 = new TreatmentRequest(number6);
    TreatmentRequest number17 = new TreatmentRequest(number7);
    TreatmentRequest number18 = new TreatmentRequest(number8);


    hosptialSystem.enqueue(number11);
    hosptialSystem.enqueue(number12);
    hosptialSystem.enqueue(number13);
    hosptialSystem.enqueue(number14);
    hosptialSystem.enqueue(number15);
    hosptialSystem.enqueue(number16);
    hosptialSystem.enqueue(number17);
    hosptialSystem.enqueue(number18);
    System.out.println();


    DischargeRecord number19 = new DischargeRecord();//doing discharge manually
    DischargeRecord number20 = new DischargeRecord();
    System.out.println();

    number19.patientId = 951753;
    number20.patientId = 753159;

    hosptialSystem.dischargeStack.push(number19);
    hosptialSystem.dischargeStack.push(number20);


    hosptialSystem.treatmentProcess();//The patient is removed from the queue and added to the discharge list.
    hosptialSystem.treatmentProcess();
    hosptialSystem.treatmentProcess();
    hosptialSystem.treatmentProcess();
    System.out.println();

    hosptialSystem.currentState();

   }




   public void menu() {

        HosptialSystem hosptialSystem = new HosptialSystem();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Which operation do you want to perform? \n " +
                    "if you want to add a patient please press to 1.\n " +
                    "if you add a patient to the treatment queue please press 2. \n " +
                    "if you want to remove a patient from the treatment queue please press 3. \n " +
                    "if you want to remove a patient from the system press 4. \n" +
                    "if you want to add a patient to the discharge stack press 5 \n" +
                    "if you want to remove a patient from the discharge stack press 6 \n" +
                    "if you want to see the treatment queue press 7 \n"+
                    "if you want to see the discharge stack press 8 \n"+
                    "if you want to see the current situation , press 9 \n"+
                    "if you want to exit the system press 10");

            int a = input.nextInt();
            Patient patient = new Patient();

            if (a == 1) {
                System.out.println("please enter the new id.");
                int b = input.nextInt();
                System.out.println("please enter the age of the patient");
                int c = input.nextInt();
                System.out.println("please enter the name of the new patient");
                String d = input.next();
                System.out.println("please enter severity of the new patient");
                int e = input.nextInt();

                patient.id = b;
                patient.age = c;
                patient.name = d;
                patient.severity = e;

                hosptialSystem.addPatient(patient);

                System.out.println("The patient has been successfully added to the system.");

            } else if (a == 2) {
                TreatmentRequest treatmentRequest = new TreatmentRequest();
                System.out.println("please enter the id of the patient");
                int f = input.nextInt();
                treatmentRequest.patientId = f;

                Patient temp = hosptialSystem.patientList.head;
                while (temp.id != f){
                    temp = temp.next;
                }
                treatmentRequest.patient = temp;

                hosptialSystem.enqueue(treatmentRequest);
                System.out.println("the operation done successfully");
            } else if (a == 3) {
                System.out.println("the patient who first came to the treatment queue is removing.");
                hosptialSystem.treatmentQueue.dequeue();


            } else if (a == 4) {
                System.out.println("please enter the patient id that will be removed.");
                int h = input.nextInt();
                patient.id = h;
                hosptialSystem.patientList.removePatient(h);
                System.out.println("the operation done successfully");
            } else if (a == 5) {
                System.out.println("The first patient in the examination list is discharged.");
                hosptialSystem.treatmentProcess();

            } else if (a == 6) {
                System.out.println("The last added patient is removed from the stack.");
                hosptialSystem.dischargeStack.pop();
            } else if (a == 7) {
                System.out.println("Treatment Queue is");
                hosptialSystem.printQueue();
                System.out.println();


            } else if (a==8) {
                System.out.println("The discharge stack is: ");
                hosptialSystem.dischargeStack.printStack();
                System.out.println();
            }
            else if(a==9){
                System.out.println("The current situation is: ");
                hosptialSystem.currentState();
                System.out.println();
            }
            else if(a==10){
                System.out.println("The system is exiting.");
                return;
            }
            else
            {
                System.out.println("You entered an invalid or incomplete input. Please try again.");
            }
        }
   }
















