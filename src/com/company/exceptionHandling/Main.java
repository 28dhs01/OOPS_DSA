package com.company.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 0 ;
        try{
//            int c = a/b ;
//            System.out.println(c);
//            divide(a,b);
//            // mimicking the exception
//            throw new Exception("mimicking the exception");

            String name = "Dhruv";
            if( name.equals("Dhruv")){
                throw new MyException("This name is prohibited, please try new name");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always run");
        }

    }
    static int divide( int a, int b) throws ArithmeticException {
        if( b == 0 ){
            throw new ArithmeticException("Division by 0 is prohibited");
        }
        return a/b ;
    }
}
