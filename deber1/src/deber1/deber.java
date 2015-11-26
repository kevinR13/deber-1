package deber1;
import java.util.*;
public class deber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ejer1();
		   ejer2();
		   ejer3();
			}
			public static int ejer1(){
				// -TIENDA DE DESCUENTO
			int A=0,A1=0,A2=0,A3=0;
			System.out.println("BIENVENIDO");
			System.out.println("  [DESEA INGRESAR]    ");
			System.out.println("PRESIONE [1] SI DESEA");
			System.out.println("PRESIONE [0] NO DESEA");
			Scanner RE=new Scanner(System.in);
			String R=RE.next();
			while (R.equals("1")) {
			System.out.println("[INGRESE SU IMPORTE]");
			Scanner IM=new Scanner(System.in);
			int IMP = IM.nextInt();
			
			System.out.println("[*ELIJA LA BOLITA DESEADA*]");
			System.out.println("[1.ROJO     ]");
			System.out.println("[2.AMARILLO ]");
			System.out.println("[3.BLANCA   ]");
			Scanner REE=new Scanner(System.in);
			int RR = REE.nextInt();
			if (RR==1){
				int D1=IMP*50/100; 
				System.out.println("IMPORTE A PAGAR CON 50% DE DESC ES :"+ D1);
				System.out.println("DESEA SEGUIR IMPORTANDO ? ");
				 R=RE.next();
				 A1=A1+D1;
			}
			if( RR==2){
				int D2=IMP*25/100;
				System.out.println("IMPORTE A PAGAR CON 25% DE DESC ES :"+ D2);
				System.out.println("DESEA SEGUIR IMPORTANDO ? ");
				 R=RE.next();	
				 A2=A2+D2;}
			if(RR==3){
				System.out.println("IMPORTE A PAGAR SIN DESC  ES :"+ IMP);
				System.out.println("DESEA SEGUIR IMPORTANDO ? ");
				 R=RE.next();
				 A3=A3+IMP;
				 }
			}
			A=A1+A2+A3;
			System.out.println("CANTIDAD TOTAL OBTENIDA ES :"+ A);
			System.out.println("[***THANK YOU***]");
			return(0);
		}
		public static int ejer2(){
			System.out.println("8888888888888888888888888888888888888888888888888888");
					/*Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje 
					 * de reprobados. Tomando en cuenta que la calificacion minima aprovatoria es de 70
					 */
					
					int U,N=0,CT=0,CAL ;
					System.out.println("SISTEMAS DE PORCENTAJES");
					System.out.println("INGRESE [50]CALIFICACIONES POR FAVOR  ");
					for ( U=0;U<50;U++){
						N++;
						System.out.println("INGRESE CALIFICACION ["+N+"]");
						Scanner CALI=new Scanner(System.in);
						 CAL = CALI.nextInt();
					if(CAL<=69){
							CT++;
					}
					}
					int RE=CT*100/50;
					System.out.println("PORCENTAJE DE REPROVADOS:["+RE+"%]");
							
					return (0);
		      }
		public static int ejer3(){
			/* Obtener el promedio de calificaciones de un grupo de # estudiantes
			 */	
			System.out.println("8888888888888888888888888888888888888888888888888888");
			int AC=0;
			System.out.println("[SISTEMA DE PROMEDIOS]");
			System.out.println("[INDIQUE CUANTAS CALIFICACIONES DESEA INGRESAR ?] ");
			Scanner CAL=new Scanner(System.in);
			int CA = CAL.nextInt();
			for (int i=0;i<CA;i++){
				System.out.println("[INGRESE CALIFICACIONES]");
				Scanner NT=new Scanner(System.in);
				int N = NT.nextInt();
				AC=AC+N ;	
			}
			int PRO=(AC/CA);
			System.out.println("[PROMEDIO DE CALIFICACIONES] :["+PRO+"]");

		return (0);
		    }
		}
