public class Zad1 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        boolean isFind=false;
        int res=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target){
                isFind=true;
                res=i;
            }
        }
        if (!isFind){
            for(int i=0;i<nums.length-1;i++){

                if((nums[i]<=target) && (nums[i+1]>=target)){
                    res=i+1;
                } else if (nums[i+1]<target) {
                    res=i+2;
                }
            }

        }
        System.out.println(res);
    }
}
