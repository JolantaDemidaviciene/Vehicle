package Helpers;

public class Helpers {
        public static int FunctionId(){
            int min = 1;
            int max = 1000;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            return random_int;
        }
}
