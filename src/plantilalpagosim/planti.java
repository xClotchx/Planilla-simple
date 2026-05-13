package plantilalpagosim;
import java.util.Scanner;
import java.text.DecimalFormat;
public class planti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		String cod_emple="", nom="",continuar;
		int dependen=0,boleta=1;
		do {
		double sal_men=0.00,seg_soc=9.25,seg_edu=1.25,
				imp_ren=12.25,ahorro=12.25,pen_alimen=9.25,
				sal_final=0.00,bono=0.00,total_dedu=0.00,sal_neto_c=0.00,bono_denpe=0.00;
		
		
		System.out.print("Ingrese su Codigo de empleado: ");
		cod_emple = leer.nextLine();
		
		System.out.print("Ingrese su nombre:");
		nom = leer.nextLine();
		
		while (sal_men < 750 || sal_men > 2000) {
            System.out.print("Ingresa su salario mensual (entre 750 y 2000): ");
            sal_men = leer.nextDouble();

            if (sal_men < 750 || sal_men > 2000) {
                System.out.println("Error: El número debe estar entre 750 y 2000.");
            }
        }
		System.out.print("Ingrese la cantidad de hijos (si tiene):");
		dependen = leer.nextInt();
		
		if (dependen <= 0) {
		    pen_alimen = 0.00;
		    bono = 0.00;
		} else if (dependen >= 1 && dependen <= 3) {
		    bono = 4.25;
		} else {
		    bono = 5.25;
		}
		
		seg_soc=(seg_soc/100)*sal_men;
		seg_edu=(seg_edu/100)*sal_men;
		imp_ren=(imp_ren/100)*sal_men;
		ahorro=(ahorro/100)*sal_men;
		pen_alimen=(pen_alimen/100)*sal_men;
		bono_denpe=(bono/100)*sal_men;
		total_dedu=seg_soc+seg_edu+imp_ren+ahorro+pen_alimen;
		sal_final=sal_men-total_dedu;
		sal_neto_c=sal_final+bono_denpe;
		
		System.out.println("\t\tEmpresa Tecnológica S.A.");
		System.out.println("\t\tProceso de Planilla y Reportes");
		System.out.println("\t\t\tAl 11 de Mayo de 2026");
		System.out.println("Programadores(as): xxxxxxx");
		System.out.println("\t\t\t\tBoleta de Pago");
		
		System.out.println("---------------------------------------------------------------------------");
		
		// Información del empleado
		System.out.print("Código de Empleado: "+cod_emple);
		System.out.println("\t\tNombre del Empleado: "+nom);
		
		System.out.print("Salario Mensual: "+ df.format(sal_men));
		System.out.println("\t\tDependientes: "+dependen +" y "+df.format(bono)+"%");
		System.out.println("\t\t\t\t\t\t\t\tBoleta # "+boleta);
		
		System.out.println("Detalle de la Boleta de Pago:");
		
		// Columnas de deducciones y pagos
		System.out.println("Seg. Soc: "+ df.format(seg_soc)+"\t\tSeg. Educ: "+df.format(seg_edu)+"\t\tImp. Renta: "+df.format(imp_ren));
		System.out.println("Ahorro: "+df.format(ahorro)+"\t\t\tPensión Alimenticia: "+df.format(pen_alimen)+"\tTotal Deduc: "+df.format(total_dedu));
		
		// Totales finales
		System.out.print("Salario Final: "+df.format(sal_final));
		System.out.print("\t\tBono: "+df.format(bono_denpe));
		System.out.println("\t\t\tSalario Neto a Cobrar: "+df.format(sal_neto_c));
		
		boleta++;
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		leer.nextLine();
		
		// Pregunta para repetir el ciclo
					System.out.print("\n¿Desea imprimir otra boleta? (s/n): ");
					continuar = leer.nextLine();

				} while (continuar.equalsIgnoreCase("s"));

				System.out.println("Programa finalizado.");
		leer.close();
	}

}
