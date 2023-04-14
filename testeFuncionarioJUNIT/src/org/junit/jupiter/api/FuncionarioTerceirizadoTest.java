package org.junit.jupiter.api;

import org.junit.Test;
import Empresa.FuncionarioTerceirizado;

import static org.junit.Assert.*;

public class FuncionarioTerceirizadoTest {

	@Test
	public void testarConstrutorEntradaDespesasInvalida() {
        FuncionarioTerceirizado f = new FuncionarioTerceirizado("João", 40, 132, 2000.0);
        assertEquals(1000.0, f.getDespesasAdicionais(), 0.01);
    }
	
	@Test
	public void testarConstrutorEntradasValidas() {
        FuncionarioTerceirizado f = new FuncionarioTerceirizado("João", 40, 132, 500.0);
        assertEquals("João", f.getNome());
        assertEquals(40, f.getHorasTrabalhadas());
        assertEquals(132, f.getValorHora(), 0.01);
        assertEquals(500.0, f.getDespesasAdicionais(), 0.01);
    }
	
	@Test
	 public void testarModificarDespesasEntradaInvalida() {
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("João", 40, 132, 500.0);
        funcionario.setDespesasAdicionais(1500.0);
        assertEquals(1000.0, funcionario.getDespesasAdicionais(), 0.0);
    }

	@Test
	public void testarModificarDespesasEntradaValida() {
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("João", 40, 132, 1000.00);
        funcionario.setDespesasAdicionais(1200.00);
        assertEquals(550.00, funcionario.getDespesasAdicionais(), 0.001);
    }
}
