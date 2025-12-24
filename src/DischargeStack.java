public class DischargeStack {  //Implement a Stack to manage discharge patients
    DischargeRecord top;
    int size;


    public DischargeStack(){  //non-parameterized constructor
        this.top=null;
        this.size=0;
    }

    public DischargeStack(int size){  //parameterized constructor
        this.size=size;
        this.top=null;
    }

    public void push(DischargeRecord record){  //adding a patient into the stack of discharged patients
        if(top==null){  //if stack is empty
            top=record;
        }
        else{
            record.next=top;
            top=record;
        }
        size++;
        System.out.println("The patient with ID "+ record.patientId+ " was added to the stack. Discharging time is: "+Math.abs(((((record.dischargeTime)/1000)%(24*60*60))/3600)+3)%24+ "."+Math.abs(((((record.dischargeTime)/1000)%(24*60*60))%3600)/60)+'.'+ ((((record.dischargeTime)/1000)%(24*60*60))%60));
    }

    public void pop(){  //removing a patient from a stack of discharged patients
        if(top==null){
            System.out.println("there is no element to delete");
        }
        else{
            top=top.next;
            System.out.println("Patient deletion was completed successfully. New top patient ID is:"+top.patientId);
        }
        size--;
    }


    public void peek(){  //a method for viewing the top patient in the stack
        if(top==null){
            System.out.println("there is no element in stack");
        }
        else{
            System.out.println(top.patientId);
        }
    }


    public void printStack(){  //Print all discharge records
        DischargeRecord temp= top;  //temporary variable
        while(temp !=null){
            System.out.print(temp.patientId+" -> ");
            temp=temp.next;
        }
        System.out.println("null");


    }


}