public class Main {

    public static void main(String[] args) {
	//6 -->1,2,3
    //28 -->1,2,4,7,14
    int number = 28;
    int num = 0;

    for(int i = 1; i < number; i++ ){
        if(number % i == 0){
            num += i;
        }
    }
    if(num == number){
        System.out.println("sayı muhteşem sayıdır.");
    }else{
        System.out.println("sayı muhteşem sayı değildir");
    }
    }
}
