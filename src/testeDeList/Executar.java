package testeDeList;

import java.util.ArrayList;
import java.util.List;

public class Executar {

	public static void main(String[] args) {
		//Cria os Clientes
        Cliente cliente1 = new Cliente(22, "Thiago", "000000", "Avenida Brasil");
        Cliente cliente2 = new Cliente(25, "Rafael", "000001", "Avenida Etc");
        Cliente cliente3 = new Cliente(34, "Carlos", "000002", "Avenida Treze");
        
        
        
        //Cria a lista de Clientes
        List<Cliente> clientes = new ArrayList<Cliente>();
       
        
        //Adiciona os clientes na lista
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        

       
}}
