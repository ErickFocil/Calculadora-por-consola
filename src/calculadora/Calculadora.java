package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String cadena = new String();
        double num1 = 0, num2 = 0, res = 0;
        int temp = 0;
        int op = 0;
        
        System.out.println("Ingrese la operacion simple a realizar:");
        cadena = entrada.readLine();
        for(int i = 0; i < cadena.length(); i++){
            switch(cadena.charAt(i)){
                case '+':
                    op = 1;
                    temp = i;
                    break;
                case '-':
                    op = 2;
                    temp = i;
                    break;
                case '*':
                    op = 3;
                    temp = i;
                    break;
                case '/':
                    op = 4;
                    temp = i;
                    break;
                default:
                    break;
            }
            if(temp != 0){
                num1 = Double.parseDouble(cadena.substring(0, i));
                num2 = Double.parseDouble(cadena.substring(i+1, cadena.length()));
                break;
            }
        }
        
        if(op == 1){
            res = num1 + num2;
        }else if(op == 2){
            res = num1 - num2;
        }else if(op == 3){
            res = num1 * num2;
        }else if(op == 4){
            res = num1 / num2;
        }else{
            System.out.println("Error");
        }
        System.out.println(num1 + " + " + num2 + " = " + res);
        
    }
    
}