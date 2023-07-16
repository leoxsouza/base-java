package lambda.expressions;

public class ThreadExemplo {

    public static void main(String[] args) {

        /**
         *
         * Lambda Expression
         *
         * - São funções anonimas que não pertencem a nenhuma classe
         * - Maneira simples de implementar Interfaces Funcionais
         *
         * */

        /**
         * Exemplo sem o uso de Lambda Function
         * */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });
        t1.start();

        /**
         * Exemplo com uso de lambda
         *
         * */
        Thread t2 = new Thread(() -> System.out.println("Thread 2 em execução"));
        t2.start();

    }
}
