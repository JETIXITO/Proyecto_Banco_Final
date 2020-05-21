/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_banca_final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis Marian Manta
 */
public class Practica_banca_finalTest {
    
    public Practica_banca_finalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Practica_banca_final.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Practica_banca_final.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EleccionOperaciones method, of class Practica_banca_final.
     */
    @Test
    public void testEleccionOperaciones() {
        System.out.println("EleccionOperaciones");
        int expResult = 0;
        int result = Practica_banca_final.EleccionOperaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Menu method, of class Practica_banca_final.
     */
    @Test
    public void testMenu() {
        System.out.println("Menu");
        int expResult = 0;
        int result = Practica_banca_final.Menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MenuInternet method, of class Practica_banca_final.
     */
    @Test
    public void testMenuInternet() {
        System.out.println("MenuInternet");
        int expResult = 0;
        int result = Practica_banca_final.MenuInternet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MenuModificar method, of class Practica_banca_final.
     */
    @Test
    public void testMenuModificar() {
        System.out.println("MenuModificar");
        int expResult = 0;
        int result = Practica_banca_final.MenuModificar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearPerfil method, of class Practica_banca_final.
     */
    @Test
    public void testCrearPerfil() {
        System.out.println("CrearPerfil");
        Practica_banca_final.CrearPerfil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarCuentas method, of class Practica_banca_final.
     */
    @Test
    public void testMostrarCuentas() {
        System.out.println("MostrarCuentas");
        Practica_banca_final.MostrarCuentas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarlaCuenta method, of class Practica_banca_final.
     */
    @Test
    public void testModificarlaCuenta() {
        System.out.println("ModificarlaCuenta");
        Practica_banca_final.ModificarlaCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InformacionCuenta method, of class Practica_banca_final.
     */
    @Test
    public void testInformacionCuenta() {
        System.out.println("InformacionCuenta");
        Practica_banca_final.InformacionCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaldoMedio method, of class Practica_banca_final.
     */
    @Test
    public void testSaldoMedio() {
        System.out.println("SaldoMedio");
        int NumCuenta = 0;
        Practica_banca_final.SaldoMedio(NumCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
