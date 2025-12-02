package es.gva.edu.sanchezgarcia.jg.mavenproject54;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Clase que implementa las pruebas para la clase Cuadrado.java
* @author José Gaspar Sánchez García.
*/
public class CuadradoTest {
private static Cuadrado c0;
private static Cuadrado c1;
private static Cuadrado c8;
private static Cuadrado cn5;
private static String s="";
public CuadradoTest() {
}
@BeforeAll
public static void setUpClass() {
c0=new Cuadrado(0);
c1=new Cuadrado(1);
c8=new Cuadrado(8);
cn5=new Cuadrado(-5);
s=c8.toString();
}
@AfterAll
public static void tearDownClass() {
}UT 5: IMPLEMENTACIÓN DE SISTEMAS SEGUROS DE DESPLEGADO SOFTWARE PePS
Puesta en Producción Segura 20241104.085001 Página 24 de 27
@BeforeEach
public void setUp() {
}
@AfterEach
public void tearDown(){
}
/**
* Test of getLado method, of class Cuadrado.
*/
@Test
public void testGetLado() {
System.out.println("getLado");
Cuadrado instance = c0;
int expResult = 0;
int result = instance.getLado();
assertEquals(expResult, result);
assertEquals(c1.getLado(), 1);
assertEquals(c8.getLado(), 8);
assertEquals(cn5.getLado(), 0);
}
/**
* Test of setLado method, of class Cuadrado.
*/
@Test
public void testSetLado() {
System.out.println("setLado");
int lado = 10;
Cuadrado instance = new Cuadrado(10);
instance.setLado(lado);
int r=instance.getLado();
assertEquals(r, 10);
}
/**
* Test of toString method, of class Cuadrado.
*/
@Test
public void testToString() {
System.out.println("toString");UT 5: IMPLEMENTACIÓN DE SISTEMAS SEGUROS DE DESPLEGADO SOFTWARE PePS
Puesta en Producción Segura 20241104.085001 Página 25 de 27
Cuadrado instance = c8;
String expResult = s;
String result = instance.toString();
assertEquals(expResult, result);
}
/**
* Test of calcularArea method, of class Cuadrado.
*/
@Test
public void testCalcularArea() {
System.out.println("calcularArea");
Cuadrado instance = c0;
double expResult = 0.0;
double result = instance.calcularArea();
assertEquals(expResult, result, 0);
result = cn5.calcularArea();
assertEquals(expResult, result, 0);
expResult = 1.0;
result = c1.calcularArea();
assertEquals(expResult, result, 0);
expResult = 64.0;
result = c8.calcularArea();
assertEquals(expResult, result, 0);
}
/**
* Test of calcularPerimetro method, of class Cuadrado.
*/
@Test
public void testCalcularPerimetro() {
System.out.println("calcularPerimetro");
Cuadrado instance = c0;
double expResult = 0.0;
double result = instance.calcularPerimetro();
assertEquals(expResult, result, 0);
result = cn5.calcularPerimetro();
assertEquals(expResult, result, 0);
expResult = 4.0;
result = c1.calcularPerimetro();UT 5: IMPLEMENTACIÓN DE SISTEMAS SEGUROS DE DESPLEGADO SOFTWARE PePS
Puesta en Producción Segura 20241104.085001 Página 26 de 27
assertEquals(expResult, result, 0);
expResult = 32.0;
result = c8.calcularPerimetro();
assertEquals(expResult, result, 0);
}
}