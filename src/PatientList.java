public class PatientList {
    Patient head;

    public PatientList(){  //Non-parameterized constructor
        this.head=null;

    }
    public PatientList(Patient head){  //parameterized constructor
        this.head=head;

    }
    public void addPatient(Patient p){  //the method for inserting a patient
        if(head == null){  //if the list is empty
            head=p;
            return;
        }
        p.next=head;
        head =p;

    }
    public void removePatient(int id){  //the method for removing a patient
        if(head == null){  //if the list is empty
            return;
        }
        if(head.id==id){
            head=head.next;
            return;
        }
        Patient temp = head; //temporary variable
        while(temp.next!= null && temp.next.id != id ){  //works until find the patient who will be removed
            temp=temp.next;
        }
        if(temp.next != null){
            temp.next=temp.next.next;
        }


    }
    public void findPatient(int id) {  //the method for finding a patient
        if (head == null) {  // if the list is empty
            System.out.println("empty list");
            return ;
        }
        Patient temp = head;  //temporary variable
        while(temp!=null){  //move forward until finding the patient
            if(temp.id==id){
                System.out.println("NAME:"+ temp.name);
                return;
            }
            temp=temp.next;
        }
        System.out.println("the patient not found");
    }
    public void printList(){  //method for displaying the list
        if(head==null){  //if it is empty
            return;
        }
        Patient temp=head;
        while(temp!=null){ //prints the all elements in the list in linked list form
            System.out.print("ID: "+temp.id+" AGE: "+temp.age+" SEVERITY: "+temp.severity+" NAME: "+temp.name+ " -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }




}
