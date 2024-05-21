package create_generics_01;

class StoreCorregida<T>{

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


public class App1Corregida {

    public static void main(String[] args) {

        //Esto es raw type:
        StoreCorregida store1 = new StoreCorregida();
        //Esto es un tipo generico:
        StoreCorregida<String> store2 = new StoreCorregida<>();
        //Error en tiempo de compilacion: el parametro debe ser String
        //store2.setItem(45);
        store2.setItem("Hola");
        //Ya no hace falta casteo
        String item =  store2.getItem();
    }
}
