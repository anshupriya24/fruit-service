import java.util.Arrays;
import java.util.List;

public class FruitService {

    static int calculatePrice(List<String> fruitList){
        int sum=0;
        for(String str: fruitList) {
            if (str.contains("Apple")) {
                sum = sum + 60;
            }
            if (str.contains("Orange")) {
                sum = sum + 25;
            }
        }
        return sum;
        //fruitList.stream().map(str->str.contains("Apple")).collect(Collectors.toList());
    }

    public static void main(String args[]) throws Exception {
        List<String> fruitList= Arrays.asList("Apple","Apple","Orange", "Apple");

        if(calculatePrice(fruitList)==205){
            System.out.println("correct Data");
        }else{
            throw new Exception();
        }




    }

}
