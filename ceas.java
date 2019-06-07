public class ceas {
    public boolean getParrity(int numberseconds){
        if (numberseconds%2 == 0){
            System.out.println("Numar par");
            return true;

        } else
            {System.out.println("Numar impar");
            return false;
        }
    }
    public void firstLine (int numberhours){
        switch (numberhours/5){

            case 0 : System.out.println("nobars");
                break;
            case 1 : System.out.println("one bar");
                break;
            case 2 : System.out.println("two bars");
                break;
            case 3 : System.out.println("three bars");
                break;
            case 4 : System.out.println("four bars");
                break;
            default: System.out.println("sorry...try again");
                break;
                             }
    }

    public void secondLine (int numberhours2){
        switch (numberhours2%5){

            case 0 : System.out.println("nobars");
                break;
            case 1 : System.out.println("one bar");
                break;
            case 2 : System.out.println("two bars");
                break;
            case 3 : System.out.println("three bars");
                break;
            case 4 : System.out.println("four bars");
                break;
            default: System.out.println("sorry...try again");
                break;
        }
    }

    public void threeLines (int numberminutes){
        switch (numberminutes/5){

            case 0 : System.out.println("nobars");
                break;
            case 1 : System.out.println("one bar");
                break;
            case 2 : System.out.println("two bars");
                break;
            case 3 : System.out.println("three bars");
                break;
            case 4 : System.out.println("four bars");
                break;
            case 5 : System.out.println("fivebars");
                break;
            case 6 : System.out.println("six bar");
                break;
            case 7 : System.out.println("seven bars");
                break;
            case 8 : System.out.println("eight bars");
                break;
            case 9 : System.out.println("nine bars");
                break;
            case 10 : System.out.println("ten bars");
                break;
            case 11 : System.out.println("eleven bars");
                break;
            default: System.out.println("sorry...try again");
                break;
        }
    }

    public void fourLines (int numberminutes2){
        switch (numberminutes2%5){

            case 0 : System.out.println("nobars");
                break;
            case 1 : System.out.println("one bar");
                break;
            case 2 : System.out.println("two bars");
                break;
            case 3 : System.out.println("three bars");
                break;
            case 4 : System.out.println("four bars");
                break;
            default: System.out.println("sorry...try again");
                break;
        }
    }
}
