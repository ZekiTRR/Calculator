import java.util.Scanner;

class Calculate{
    public void calc(){
        Scanner myObj = new Scanner(System.in);
        float num,num2;
        String act;
        System.out.println("Enter the first number: ");
        num = myObj.nextFloat();
        myObj.nextLine();
        System.out.println("Enter the action: ");
        act = myObj.nextLine();

        
        System.out.println("Enter the second number: ");
        num2 = myObj.nextFloat();

        switch (act) {
            case "+":{
                System.out.println(num + num2);
                break;
            }
            case "-":{
                System.out.println(num - num2);
                break;
            }
            case "*":{
                System.out.println(num * num2);
                break;
            }
            case "/":{
                System.out.println(num / num2);
                break;
            }
            case "**":{
                System.out.println(Math.pow(num, num2));
                break;
            }
            case "//":{

                System.out.println("First number root: " + Math.sqrt(num));
                
                System.out.println("Second number root: " + Math.sqrt(num2));
                break;
            }
        }
    }
}

class calc{
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        while (true) {
        calc.calc();
        }
    }
}