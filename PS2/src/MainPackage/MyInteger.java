package MainPackage;

public class MyInteger {
	   
    private int value;
   
    public MyInteger(int newValue){
        value = newValue;
    }
   
    public int getValue(){
        return value;
    }
   
    public boolean isEven(){
        if(value % 2 ==0)
            return true;
        return false;
    }
   
    public boolean isOdd(){
        if(value % 2 != 0)
            return true;
        return false;
    }
   
    public boolean isPrime(){
        int i = 0;
        for(i = 2; i <= value / 2; i++){
            if(value % i != 0)
                return true;
        }
        return false;
    }
   
    public boolean isEven(int value){
        if(value % 2 == 0)
            return true;
        return false;
    }
   
    public boolean isOdd(int value){
        if(value % 2 != 0)
            return true;
        return false;
    }
   
    public static boolean isPrime(int value){
        return isPrime(value);
    }
   
    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven(myInteger.getValue());
    }
   
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd(myInteger.getValue());
    }
   
    public static boolean isPrime(MyInteger myInteger){
        return MyInteger.isPrime(myInteger.getValue());
    }
   
    public boolean equals(int intValue){
        return value == intValue;
    }

    public boolean equals(MyInteger myInteger){
        return equals(myInteger.getValue());
    }
    
    public static int parseInt(char[] chars){
    	return Integer.parseInt(new String(chars));
    }
   
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}
