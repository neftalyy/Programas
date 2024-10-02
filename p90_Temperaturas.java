public class p90_Temperaturas {
    public class Main {
        public static void main(String[] args) {
            float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
            
            System.out.println("Primer elemento: " + temperaturas[0]);
            
            System.out.println("Tercer elemento: " + temperaturas[2]);
            
            System.out.println("\nElementos del arreglo:");
            for (float temp : temperaturas) {
                System.out.print(temp + " ");
            }
    
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i] > 10) {
                    temperaturas[i] = 0;
                }
            }
    
            System.out.println("\n\nElementos del arreglo después de modificar:");
            for (float temp : temperaturas) {
                System.out.print(temp + " ");
            }
        }
    }
    
}
