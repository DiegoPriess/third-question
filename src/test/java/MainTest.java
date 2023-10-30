import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    final Main main = new Main();

    @Test
    public void testDigitalRootWithOneDigit() {
        assertEquals(3, (int) main.digital_root(3), "Erro ao obter a raiz digital de um número com 1 digíto");
    }

    @Test
    public void testDigitalRootWithTwoDigits() {
        assertEquals(7, (int) main.digital_root(16), "Erro ao obter a raiz digital de um número com 2 digítos");
    }

    @Test
    public void testDigitalRootWithThreeDigits() {
        assertEquals(6, (int) main.digital_root(942), "Erro ao obter a raiz digital de um número com 3 digítos");
    }

    @Test
    public void testDigitalRootWithSixDigits() {
        assertEquals(6, (int) main.digital_root(132189), "Erro ao obter a raiz digital de um número com 6 digítos");
    }
}
