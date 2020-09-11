class Fibo{
    public static void main(String args[])
    {
        int valor1=0;
        int valor2=1;

        System.out.println(valor1);
        System.out.println(valor2);
        //par while
        for (var i = 1; i < 10; i++) {
            int valor3= valor1+valor2;
            System.out.println(valor3);
            
            valor1=valor2;
            valor2=valor3;
        }
    }
}