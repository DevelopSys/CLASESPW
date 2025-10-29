public class SentenciaFor {
    public void sentenciaFor() {
        // inicial;final;incrementa
        // [0,4]
        // i=0 OK
        // i=1
        // i=2 OK
        // i=3
        // i=4 OK
        // i=5
        // i=6
        /*
        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("%d",i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
         */
        for (int i = 100; i >= 0; i--) {
            if (i % 7 == 0) {
                System.out.println("Ejecuciones " + i);
            }
        }
    }

    public void tablaMultiplicarNumero(int numero) {
        // 6
        // 6*0
        // 6*1
        // 6*2
        System.out.println("Procedemos a escribir la tabla de multiplicar del " + numero);
        // [0,10]
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);
        }
    }

    public void todasTablas() {
        // 1-10
        for (int i = 1; i < 11; i++) {
            System.out.println("Sacando la tabla del " + i);
            // 1 2 3 4 5 6 7 8 9 10 11
            for (int j = 0; j < 11; j++) {
                // 0 1 2 3 4 5 6 7 8 9 10
                System.out.printf("\t%d * %d = %d%n", j, i, i * j);
            }
        }
    }

    public void dibujarCuadrado() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else if (j==0|| j==4){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
