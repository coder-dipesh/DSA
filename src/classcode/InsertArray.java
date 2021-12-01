package classcode;
// Insert data at any position
public class InsertArray {

    public int []insAtAnyPos(int [] a, int n, int data, int pos){
    int newarr[]= new int[n+1];
    for (int i = 0; i<n+1; i++){
        if (i<pos-1){
            newarr[i]=a[i];
        }
        else if (i==pos-1){
            newarr[i]=data;
        }
        else {
            newarr[i]=a[i-1];
        }


    }

    return newarr;
    }

    public static void main(String[] args) {

        int a[] = {10,20,30,40};
        System.out.println("Printing old array.");

        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }



        InsertArray x = new InsertArray();
        int arry[] = x.insAtAnyPos(a, a.length, 25,3);

        System.out.println("Printing new array.");
        for (int i=0;i<arry.length;i++) {
            System.out.println(arry[i]);
        }
    }
}
