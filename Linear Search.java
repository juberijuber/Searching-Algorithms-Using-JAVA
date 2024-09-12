class Main{
    public static void main(String args[]){
        int[] arr={10,50,40,20,15,100};
        int t=20;
        for(int i=0;i<arr.length;i++){
            if(t==arr[i]){
                System.out.println(i);
            }
        }
        
    }
}