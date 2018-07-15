import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("/Users/rmw/Desktop/StockData/feed/Feed-22-08-2016.gtw"));

            while(bf.readLine() != null) {

                String line = bf.readLine();
                String[] tokens = line.split("[|\\;]");

                for (String token : tokens) {

                    if(token.contains("*")){
                        //put it in the array
                        System.out.println(token);
                    }else {
                        System.out.print(token);
                    }

                    //FEED|
                    // GHNL;REG;PRE;
                    // ;2000;252.00;252.00;500;252.01;00;
                    // ;252.01;=;0.0;0.00;0.00;0.00;00;00;0.0;|*
                }
                //EXG-STAT|0;0;0;0;KSE100;39499.09;0;0.00;39499.09;39499.09;0.00;$ALLSHR;26493.06;0;0.00;26493.06;26493.06;0.00;$KSE30;22566.23;0;0.00;22566.23;22566.23;0.00;$KMI30;69056.95;0;0.00;69056.95;69056.95;0.00;$BKTi;16678.06;0;0.00;16678.06;16678.06;0.00;$OGTi;15960.07;0;0.00;15960.07;15960.07;0.00;$KMIALLSHR;18540.85;0;0.00;18540.85;18540.85;0.00;$|*
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    public void parser(BufferedReader line){

        //parse the line

    }

}
