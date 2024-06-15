package implementation;

public class SupermarketArray implements Supermarket {

    private final String [] items;

    private int LastIndex;

    public SupermarketArray(final int size) {
        items = new String[size];
        LastIndex = -1;
    }


    @Override
    public void add(final String item) {

        if (LastIndex == items.length-1) {
            System.err.println("Lista de Supermercado Cheia");
        }
        else {
            LastIndex++;
            items[LastIndex] = item;
        }

    }

    @Override
    public void print() {

        System.out.println("###############################");

        if (LastIndex < 0) {
            System.out.println("Lista de Supermercado Vazia");
        }

        for (int i = 0; i < LastIndex; i++) {
            System.out.println(i + " - " + items[i]);
        }

        System.out.println("###############################");
    }

    @Override
    public void delete(final int index) {

        if(index >= 0 && index<= LastIndex) {
            shift(index);
            LastIndex--;
        }

        else {
        System.err.println("Indíce Inválido" + index);
        }

    }

    private void shift(final int index) {

        for(int i = index; i < LastIndex; i++) {
            items[i] = items[i+1];
        }

    }

}

