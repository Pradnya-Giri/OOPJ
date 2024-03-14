class Wide2{
    public static void main(String[] args) {
    	int num1 = 10;
        double num2 = (double)num1;
        float num3 = (float)num1;
        String num = Integer.toString(num1);
        String a = String.valueOf(num1);
        String b = String.format("%d", num1);
        boolean bool = Boolean.parseBoolean(a);
       // boolean b2 = Boolean.valueOf(num1);   Not Allow

        //boolean num4 = Boolean.parseBoolean(num1);    Not Allow
        System.out.println("int to double:  "+num2);
        System.out.println("int to float:  "+num3);
        System.out.println("using Integer.toString:  "+num);
        System.out.println("using String.format:  "+ b);
        System.out.println("using Boolean.parseBoolean:  "+ bool);
        System.out.println("using Boolean.valueOf:  "+ b2);
    }
}