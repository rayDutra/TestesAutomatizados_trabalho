package org.junit.jupiter.api;

import org.junit.Test;

import Empresa.Funcionario;

import static org.junit.Assert.*;

public class FuncionarioTeste {

	  @Test(expected = IllegalArgumentException.class)
	    public void testarConstrutorPagamentoInvalido() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        double pagamento = funcionario.calcularPagamento();
	        assertEquals(1320.0, pagamento, 0.0);
	        funcionario.setValorHora(1.0);
	        funcionario.calcularPagamento();
	    }	
	 @Test(expected = IllegalArgumentException.class)
    public void testarConstrutorEntradaValorHoraInvalida() {
        Funcionario funcionario = new Funcionario("João", 40, 1.0);
    } 
	 @Test(expected = IllegalArgumentException.class)
	    public void testarConstrutorEntradaHorasInvalida() {
	        Funcionario funcionario = new Funcionario("João", 41, 10.0);
	    }
	 @Test
	 public void testarConstrutorComEntradasValidas() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        assertEquals("João", funcionario.getNome());
	        assertEquals(40, funcionario.getHorasTrabalhadas());
	        assertEquals(10.0, funcionario.getValorHora(), 0.001);
	    }
	 @Test(expected = IllegalArgumentException.class)
	    public void testarModificarHorasPagamentoInvalido() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setHorasTrabalhadas(41);
	    }
	 @Test(expected = IllegalArgumentException.class)
	    public void testarModificarHorasEntradaInvalida() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setHorasTrabalhadas(-1);
	    }
	 @Test
	    public void testarModificarHorasEntradaValida() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setHorasTrabalhadas(20);
	        assertEquals(20, funcionario.getHorasTrabalhadas());
	    }
	
	 @Test(expected = IllegalArgumentException.class)
	    public void testarModificarValorPagamentoInvalido() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setValorHora(52.8);
	    }
	 @Test(expected = IllegalArgumentException.class)
	    public void testarModificarModificarValorEntradaInvalida() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setValorHora(Double.parseDouble("valorInvalido"));
	    }
	 @Test
	    public void testarModificacaoValorHoraEntradaValida() {
	        Funcionario funcionario = new Funcionario("João", 40, 10.0);
	        funcionario.setValorHora(6.0);
	        assertEquals(6.0, funcionario.getValorHora(), 0.001);
	    }
	 
	 
}