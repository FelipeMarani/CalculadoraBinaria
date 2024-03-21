
   import java.util.Scanner;
   
   import java.util.Stack;
   
   
public class Calc_Bin_num {
	
	public static String  getNumeroBinario(int valorDecimal)  {
		
		Stack pilha = new Stack();
		
		int resto = 0;
		
		int auxValor = valorDecimal;
		
		while(auxValor > 0) {
			
			resto = auxValor % 2;
			
			pilha.push(resto);
			
			auxValor = auxValor / 2;
			
		}
		
		String bin = "";
		
		while(!pilha.isEmpty()) {
			
			bin = bin + pilha.pop().toString();
			
		}
		
		if(valorDecimal == 0) {
			bin = "0";
			
		}
		return bin;
		
		
	}



     public static void main(String[] args) {
    	 
    	 Scanner tcd = new Scanner(System.in);
    	 
    	 int numDecimal = -1;
    	 
    	 while(numDecimal < 0) {
    		 
    		 System.out.println("Digite um numero");
    		 numDecimal = tcd.nextInt();
    		 
    	 }
    	 
    	 String resp = getNumeroBinario(numDecimal);
    	 System.out.println("O numero em binario é " + resp);
     }
     }