class FarGE {
    public static void main(String[] args) {
        int[] arr= {5,2,7,1,3,8,4};
        for(int i =0;i<arr.length;i++){
            int far = -1;
            for(int j = arr.length -1;j>i;j--){
                if(arr[j]>arr[i]){
                    far = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "->" + far);
        }
    }
}