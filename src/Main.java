

public class Main {
    public static void main (String [] args){

        Summator MySummator = new Summator ();
        int result;

        MySummator.setFirsrNumber(2);
        MySummator.setSecondNumber(2);
        result = MySummator.sum();
        System.out.println(result);

        MySummator.setFirsrNumber(6);
        MySummator.setSecondNumber(-4);
        result = MySummator.sum();
        System.out.println(result);

        MySummator.setFirsrNumber(64);
        MySummator.setSecondNumber(36);
        result = MySummator.sum();
        System.out.println(result);

        MySummator.setFirsrNumber(2_000_000_000);
        MySummator.setSecondNumber(2_000_000_000);
        result = MySummator.sum();
        System.out.println(result);


    }

}
