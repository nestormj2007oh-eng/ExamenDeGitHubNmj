
public class clase {
    public static void main(String[] args) {
        System.out.println("hola Mundo"); 
        }

    public static void multiplos(int numeroMax) {
        for(int i=0;i<numeroMax;i++) {
            if(i%7==0){
                System.out.println("Múltiplo de 7: "+i);
            }
            if(i%49==0){
                System.out.println("Múltiplo de 49: "+i);
            }
            else{
                System.out.println("Multiplo de 100: "+i);
            }
            
        }
    }

}