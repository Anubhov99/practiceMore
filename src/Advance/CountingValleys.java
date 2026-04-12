package Advance;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {


        int level = 0;

        int valleys = 0;

        for(int i=0;i<steps;i++){

            char step = path.charAt(i);

            if(step == 'U'){
                level++;
                if (level == 0){
                    valleys++;
                }
            }else
                level--;
        }




    return valleys;
    }





    public static void main(String[] args) {

        int steps = 8;
        String path = "UDDDUDUU";

        System.out.println(countingValleys(steps, path));

    }
}
