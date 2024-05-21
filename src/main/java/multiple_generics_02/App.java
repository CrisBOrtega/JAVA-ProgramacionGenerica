package multiple_generics_02;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Hashtable<K,V>{

    private K key;
    private V value;

}

public class App {

    public static void main(String[] args) {
        Hashtable<String, Integer > hashtable = new Hashtable<>("Hola" , 34);
        System.out.println(hashtable);

        //Error porque se esperaaba un double
        Hashtable<String, Integer > hashtableDouble = new Hashtable<>("Hola" , 34.0);


    }
}
