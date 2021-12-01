package classcode;
// Shift array
public class ShiftAndInsert {

    static int n=0;
    static int [] a=new int[6];

    // using constructor.... i.e. here ShiftAndInsert is constructor banayena vane ni by-default huncha
    ShiftAndInsert() {
        for (int i=0;i<5;i++) {
            n++;
            a[i] = n;
        }
    }
    // Insert data by shifting array
    public void insAtAnyPos(int data,int pos){
        for(int i=n-1;i>=pos-1;i--) {
            a[i+1]=a[i];
        }
        a[pos-1]=data;
        n++;
    }
        //delete from array / it doesnot delete it just shift from one index to another
    public void delAtAnyPos(int pos){

        for (int i = pos-1; i<n-1; i++){
            a[i]=a[i+1];
        }
        n--;
    }


    public static void main(String[] args) {


        ShiftAndInsert s=new ShiftAndInsert();

        System.out.println("printing old values");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }


        s.insAtAnyPos(8, 3);
        System.out.println("printing new values after insert - Here '8' is inserted.");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }

        s.delAtAnyPos(3);
        System.out.println("printing deleted array ");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}