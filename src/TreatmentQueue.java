public class TreatmentQueue {  //Implement a Queue
    TreatmentRequest front;
    TreatmentRequest rear;
    int size;

    public TreatmentQueue(){ //non-parameterized constructor
        this.front=null;
        this.rear=null;
        this.size=0;
    }

    public TreatmentQueue(int size){  //parameterized constructor
        this.size=size;
        this.front=null;
        this.rear=null;
    }

    public void enqueue(TreatmentRequest request){ //Add a new treatment request to the queue.
        if(front ==null){  //if the queue(of patients) is empty
            front=request;
            rear=request;
        }
        else{
            rear.next=request;
            rear=rear.next;
        }
        size++;
        System.out.println("The patient with ID "+ request.patientId+ " was added to the queue. Treatment request time is: "+Math.abs(((((request.arrivalTime)/1000)%(24*60*60))/3600)+3)%24+ "."+Math.abs(((((request.arrivalTime)/1000)%(24*60*60))%3600)/60)+'.'+ ((((request.arrivalTime)/1000)%(24*60*60))%60));
    }

    public void dequeue(){  //Remove and return the first treatment request
        if(front==null){   //if the queue(of patients) is empty
            System.out.println("the queue is empty");
        }
        else{
            front=front.next;
            System.out.println("Dequeue operation successfully implemented");
            size--;
        }
    }

    public void size(){  //Return the number of requests in the queue
        if(front==null){
            System.out.println("there is no request");
        }
        else{
            System.out.println("the number of requests is: "+size);
        }
    }

    public void printQueue(){  //Print all requests in the queue
        TreatmentRequest temp=front;
        while(temp!=null){
            System.out.print(temp.patientId+" <- ");
            temp=temp.next;
        }
    }
}