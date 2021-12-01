package classcode;

// int trap[]={2,3,2,1,5} Ans:3

public class Trap {

    int trapWater(int [] height){
        int ans=0;
        int n=height.length;
        for (int i=0; i<n;i++){

            int leftmax=height[i];
            for (int j=i-1; j>=0; j--){
                leftmax = Math.max(leftmax,height[j]); //compares current value with left value
            }
            int rightmax=height[i];
            for (int j=i+1;j<n;j++){
                rightmax=Math.max(rightmax,height[j]);
            }
            ans= ans+(Math.min(leftmax,rightmax)-height[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Trap trp=new Trap();
        int height[]={2,3,2,1,5};
        int totalAns =trp.trapWater(height);
        System.out.println(totalAns);
    }

}
