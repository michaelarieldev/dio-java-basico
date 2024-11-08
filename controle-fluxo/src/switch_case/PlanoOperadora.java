package switch_case;

public class PlanoOperadora {
	
	public static void main(String[] args) {
		
		// Estrutura if e else
		
//		String plano = "M"; //M / T
//		
//		if(plano == "B") {
//			System.out.println("100 minutos de ligação");
//		}else if(plano == "M") {
//			System.out.println("100 minutos de ligação");
//			System.out.println("Whats e Intagram grátis");	
//		}else if(plano == "T") {
//			System.out.println("100 minutos de ligação");
//			System.out.println("Whats e Intagram grátis");	
//			System.out.println("5Gb Youtube");		
		
		 
		//Com switch case otimizamos
		//sem o "break" ele imprimi de baixo para cima

		
		String  plano = "M";
		
		switch (plano) {
			case "T":{
				System.out.println("5Gb Youtube");
			}
			case "M":{
				System.out.println("Whats e Instagram grátis");
			}
			case "B":{
				System.out.println("100 minutos de ligação");
			}
			
		}
		
	}
	
}
