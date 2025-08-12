public class Numero {

    public static void dividir(int a, int b){
        int resultado = 0;
        try{
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }finally {
            System.out.println(a + " / " + b +" = " + resultado);
        }
    }
}
