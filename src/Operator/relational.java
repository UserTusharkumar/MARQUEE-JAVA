package operators;

public class relationalOperator {  //always return boolean value
    public static void main(String[] args){
        int firstNumber = 12; //camel case
        int SecondNumber = 10; //pascal case

        //System.out.print(firstNumber == SecondNumber); // Is Equal To
        //System.out.print(firstNumber != SecondNumber); // Not Equal to
        //System.out.print(firstNumber > SecondNumber);  // Greater than
        System.out.println(firstNumber < SecondNumber); //Lesser than
        System.out.println(firstNumber <= SecondNumber); //lesser than equal to
        System.out.println(firstNumber >= SecondNumber);// Gretaer than equal to
    }
}
