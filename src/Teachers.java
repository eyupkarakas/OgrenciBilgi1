public class Teachers {
    String name;
    long mpno;
    String branch;

    Teachers(String name,long mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Phone Number : " + this.mpno);
        System.out.println("Branch : " +this.branch);
    }
}
