package Polimorfismo;
public class testaPoli {

    public static void main(String[] args) {
       

        poliCavalo cavalo =  new poliCavalo();
        poliCachorro cachorro =  new poliCachorro();
        poliPreguica preguica =  new poliPreguica();


        int n = (int) (Math.random()*3.0);

        System.out.println("\nO som do animal foi: " );

        switch(n)
        {
        case 0: cavalo.som(); 
        break;
        case 1:cachorro.som(); 
        break;
        case 2: preguica.som();
        break;
        default: System.out.println("\nErro inesperado");
        }
    }
    
}