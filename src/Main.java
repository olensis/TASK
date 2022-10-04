import java.util.Arrays;

public class Main {
    public static  String [] removwElement ( String [] name, int index){
        String [] result = new String[name.length -1];
        System.arraycopy( name, 0, result, 0, index);
        if (name.length != index){
            System.arraycopy(name, index+1, result, index, name.length - index-1);

        }
        return result;
    }

    public static void main(String[] args) {
        String [] name = {"Катя", "Маша", "Коля" , "Катя"};
        int index = 0;
        name = removwElement(name,index);
        System.out.println(Arrays.toString(name));


    }



}

