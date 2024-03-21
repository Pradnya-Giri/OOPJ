class Program2{
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {11,20,30};
        boolean equal= true;
        for(int i=0; i<3; i++){
            if(arr1[i]==arr2[i]){
                equal= true;                      
            }
            else{
                equal= false;                
            }
            if(equal==false){ break; }
            
        }
        if(equal== true){
            System.out.println("Both arrays are equal."); 
        }else{
            System.out.println("Both arrays are not equal.");
        }
    }
}