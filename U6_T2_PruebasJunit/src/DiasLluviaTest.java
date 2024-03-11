import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    private DiasLluvia diasLluvia;

    //antes de lanzar cada prueba se ejecuta pára instanciar la clase yu poder llevar a cabo la prueba
    @BeforeEach
    void setUp() {
        diasLluvia = new DiasLluvia();
    }

    @Test
    void registroDia1() {
        assertTrue(diasLluvia.registroDia(1, 1, true));
    }

    @Test
    void registroDiaConFechaInvalida() {
        assertFalse(diasLluvia.registroDia(31, 1, true));
    }

    @Test
    void consultarDiaLluvioso() {
        diasLluvia.registroDia(15, 4, true); // Asumiendo que este día ha sido registrado como lluvioso
        assertTrue(diasLluvia.consultarDia(15, 4), "El día consultado debe ser lluvioso");
    }
    @Test
    public void testContarDiasLluviosos() {
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(2, 1, true);
        assertEquals( 2, diasLluvia.contarDiasLluviosos());
    }

    @Test
    public void testTrimestreLluvioso() {
        // se asume un conjunto de datos de prueba
        diasLluvia.registroDia(10, 1, true);
        diasLluvia.registroDia(20, 3, true);
        diasLluvia.registroDia(5, 2, true);
        // El primer trimestre es el maslluvioso en este caso
        assertEquals( 1, diasLluvia.trimestreLluvioso());
    }

    @Test
    public void testPrimerDiaLluvia() {
        diasLluvia.registroDia(15, 4, true);
        assertEquals( 105, diasLluvia.primerDiaLluvia());
    }

}