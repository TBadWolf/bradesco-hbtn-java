public class Numero {
    
    public static void dividir(int a, int b){
        int resultado = 0;
        try{
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }finally {
            System.out.println(a + " / " + b +" = " + resultado);
        }
    }
}
