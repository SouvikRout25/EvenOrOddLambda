public class EvenOrOdd {
    public static void main(String[] args) {
        OddNumber oddNumber = number ->{
            if(number%2==0){
                return "even number";
            }
            else{
                return "odd number";
            }
        };
        System.out.println(oddNumber.evenOrOddNumber(10));
    }
}
