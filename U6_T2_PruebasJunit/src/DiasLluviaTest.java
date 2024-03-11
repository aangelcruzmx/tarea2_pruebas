import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}