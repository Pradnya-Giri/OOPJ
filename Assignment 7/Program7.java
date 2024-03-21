class Program71{
    public static void main(String[] args) {
        int a[] = {1, 2,3,4,5,91,20};
        int b[] = {12,13,23,14};
        int c[] =new int[a.length+b.length];
        int i=0, j=0, k=0;

        while( i<a.length && j<b.length){
            c[k++]= a[i++];
            c[k++]= b[j++];
        }
        while (i<a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        for(int n=0; n<c.length; n++){
            System.out.print(c[n]+ " ");
        }

    }

}