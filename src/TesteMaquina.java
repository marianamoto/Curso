import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteMaquina {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("João", 20, 12345678, "Rua seila", "988454652", 4613);
			    c = new Cliente("Andressa", 23, 123433, "Rua seila", "988454578", 7654);
		
		Cartao ct = new Cartao(4613,"João",456,true, 100.00,500.90);
			   ct = new Cartao(7654,"Andressa",789,false, 100.00,250.69);
		
		ArrayList<Venda> listVenda= new ArrayList();			
		
		Scanner sc = new Scanner(System.in);
		
		Venda v ;
		boolean parada = true;
		while(parada){
			
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n1 - Efetuar Venda\n2 - Listar Vendas\n0 - Sair"));
		
		switch(opcao){
		case 1 :{
			
				v = new Venda();
				v.setHorario(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
				v.setValorcompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"))); //recebe o valor
				v.setFormapag(JOptionPane.showInputDialog("Digite a forma de pagamento:\nC - Crédito\nD - Débito").toUpperCase()); // toUpperCase converte qualquer caracter minusculo para maiusculo
				
				//Se o opcao C - credito for escolhida, faz as seguintes condições
				if(v.getFormapag().equals("C")){
					v.setFormapag("Crédito");
					//Primeira Condição
					if(v.getValorcompra() < 50){
						
						v.setQtdparc(Integer.parseInt(JOptionPane.showInputDialog("Escolha as parcelas:\n 1 - Não Parcelar\n 2 - Parcelar em 2x")));
						
						if(v.getQtdparc() > 2 || v.getQtdparc() < 1 ){ //Compara o numero de parcelas para tratamento de erros
							//Caso esteja fora do intervalo acusa o erro abaixo
							JOptionPane.showMessageDialog(null, "A Quantidade de Parcelas informada é invalida!", "Aviso", JOptionPane.ERROR_MESSAGE);
							
						}else{ //Senao ele avalia a quantidade de parcelas desejadas e efetua o calculo pelo total da compra
							
							if(v.getQtdparc() == 2){
								v.setValorparcela(v.getValorcompra() / 2);
							}else{
								v.setValorparcela(v.getValorcompra());
							}
						}
					}// fim SE comparando o valor para gera a qnt de parcelas
					
					
					//Segunda Condição
					if(v.getValorcompra() >= 50 && v.getValorcompra() <= 99.99){
						
						v.setQtdparc(Integer.parseInt(JOptionPane.showInputDialog("Escolha as parcelas:\n 1 - Não Parcelar\n 2 - Parcelar em 2x\n 3 - Parcelar em 3x")));
						
						if(v.getQtdparc() > 3 || v.getQtdparc() < 1 ){ //Compara o numero de parcelas para tratamento de erros
							//Caso esteja fora do intervalo acusa o erro abaixo
							JOptionPane.showMessageDialog(null, "A Quantidade de Parcelas informada é invalida!", "Aviso", JOptionPane.ERROR_MESSAGE);
							
						}else{ //Senao ele avalia a quantidade de parcelas desejadas e efetua o calculo pelo total da compra
							
							if(v.getQtdparc() == 3){
								v.setValorparcela(v.getValorcompra() / 3);
							}else if(v.getQtdparc() == 2){
								v.setValorparcela(v.getValorcompra() / 2);
							}else{
								v.setValorparcela(v.getValorcompra());
							}
						}//fim SE comparando a forma de pagamento
					}
					
					//Terceira Condição
					if(v.getValorcompra() >= 100 && v.getValorcompra() <= 199.99){
						
						v.setQtdparc(Integer.parseInt(JOptionPane.showInputDialog("Escolha as parcelas:\n 1 - Não Parcelar\n "
								+ "2 - Parcelar em 2x\n 3 - Parcelar em 3x\n 4 - Parcelar em 4x")));
						
						if(v.getQtdparc() > 4 || v.getQtdparc() < 1 ){ //Compara o numero de parcelas para tratamento de erros
							//Caso esteja fora do intervalo acusa o erro abaixo
							JOptionPane.showMessageDialog(null, "A Quantidade de Parcelas informada é invalida!", "Aviso", JOptionPane.ERROR_MESSAGE);
							
						}else{ //Senao ele avalia a quantidade de parcelas desejadas e efetua o calculo pelo total da compra
							
							if(v.getQtdparc() == 4){
								v.setValorparcela(v.getValorcompra() / 4);
							}else if(v.getQtdparc() == 3){
								v.setValorparcela(v.getValorcompra() / 3);
							}else if(v.getQtdparc() == 4){
								v.setValorparcela(v.getValorcompra() / 2);
							}else{
								v.setValorparcela(v.getValorcompra());
							}
						}//fim SE comparando a forma de pagamento
					}
					
					//Quarta Condição
					if(v.getValorcompra() > 200){
						
						v.setQtdparc(Integer.parseInt(JOptionPane.showInputDialog("Escolha as parcelas:\n 1 - Não Parcelar\n "
								+ "2 - Parcelar em 2x\n 3 - Parcelar em 3x\n 4 - Parcelar em 4x\n 5 - Parcelar em 5x\n 6 - Parcelar em 6x")));
						
						if(v.getQtdparc() > 6 || v.getQtdparc() < 1 ){ //Compara o numero de parcelas para tratamento de erros
							//Caso esteja fora do intervalo acusa o erro abaixo
							JOptionPane.showMessageDialog(null, "A Quantidade de Parcelas informada é invalida!", "Aviso", JOptionPane.ERROR_MESSAGE);
							
						}else{ //Senao ele avalia a quantidade de parcelas desejadas e efetua o calculo pelo total da compra
							
							if(v.getQtdparc() == 6){
								v.setValorparcela(v.getValorcompra() / 6);
							}else if(v.getQtdparc() == 5){
								v.setValorparcela(v.getValorcompra() / 5);
							}else if(v.getQtdparc() == 4){
								v.setValorparcela(v.getValorcompra() / 4);
							}else if(v.getQtdparc() == 3){
								v.setValorparcela(v.getValorcompra() / 3);
							}else if(v.getQtdparc() == 2){
								v.setValorparcela(v.getValorcompra() / 2);
							}else{
								v.setValorparcela(v.getValorcompra());
							}
						}//fim SE comparando a forma de pagamento
					}
					
					if(ct.getLimitecartao() < v.getValorcompra()){
						
						JOptionPane.showMessageDialog(null, "O valor ultrapassou o limite do credito!", "Aviso", JOptionPane.ERROR_MESSAGE);
						
					}else{
						
						JOptionPane.showMessageDialog(null, "Transação Aprovada!\n\tDADOS DA COMPRA:\nCLIENTE: tralala \nTOTAL: "+
									v.getValorcompra()+"\nHORÁRIO: "+v.getHorario()+"\nFORMA DE PAGAMENTO: "+v.getFormapag()+"\nPARCELAS:"+
								    v.getQtdparc()+"\nVALOR DA(S) PARCELA(S):"+v.getValorparcela(),"Aviso",JOptionPane.DEFAULT_OPTION);
						
						// aqui deve-se efetuar o debito no saldo do cliente (saldo - valorCompra)
						listVenda.add(v);
					}
				}
				
				//se condição D - debito
				if(v.getFormapag().equals("D")){
					
					v.setFormapag("Débito");
					
					if(ct.getLimitecartao() < v.getValorcompra()){
						JOptionPane.showMessageDialog(null, "O valor ultrapassou o limite do credito!", "Aviso", JOptionPane.ERROR_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null, "Transação Aprovada!\n\tDADOS DA COMPRA:\nCLIENTE: tralala \nTOTAL: "+
									v.getValorcompra()+"\nHORÁRIO: "+v.getHorario()+"\nFORMA DE PAGAMENTO: "+v.getFormapag(),"Aviso",JOptionPane.DEFAULT_OPTION);
						// aqui deve-se efetuar o debito no saldo do cliente (saldo - valorCompra)
						listVenda.add(v);
					}
				}

				break;
				}
		
		case 0:{
			System.exit(0);
			parada = false;
			break;
		}
		
		case 2:{
			
			if(!listVenda.isEmpty()){
			
				for(int i = 0 ; i< listVenda.size(); i++){
				System.out.println("Venda nº"+(i+1));
				System.out.println("Horário:"+listVenda.get(i).getHorario());
				System.out.println("Cliente:");
				System.out.println("Endereço Cliente:");
				System.out.println("Forma de Pagamento: "+ listVenda.get(i).getFormapag());
				System.out.println("Totalda Compra: "+listVenda.get(i).getValorcompra());
	
				if(!listVenda.get(i).getFormapag().equals("Débito")){
					System.out.println("Parcelas: "+listVenda.get(i).getQtdparc());
					System.out.println("Valor da(s) Parcela(s): "+listVenda.get(i).getValorparcela());
				}
				System.out.println("\n\n\n");
			}
			
		}	else{
				JOptionPane.showMessageDialog(null, "Você não possui vendas efetuadas", "Aviso", JOptionPane.ERROR_MESSAGE);
			}
			
			
			break;
		}
		default:{
			JOptionPane.showMessageDialog(null, "Aviso","Opção Inválida",JOptionPane.ERROR_MESSAGE);
			break;
		}
		}
		
	}// fim while
	}// fim main
}// fim classe


//System.out.println(v.verificaChip(4613));
		//	JOptionPane.showMessageDialog(null, valorTotal, "ValorTotal:",JOptionPane.DEFAULT_OPTION); // exibe o valor