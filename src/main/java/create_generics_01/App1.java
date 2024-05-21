package create_generics_01;

class Store{

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}


public class App1 {

    public static void main(String[] args) {
        Store store = new Store();
        store.setItem(45);
        //No funciona por conversion de tipos
        //int item = store.getItem();

        //Funciona casteando:podemos castear object en cualquier otro objeto
        //Pero no es buena practica de diseño y programacion.
        int item = (Integer) store.getItem();

    }
}
