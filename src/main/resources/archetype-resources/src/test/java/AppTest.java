#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith({MockitoExtension.class})
class AppTest {

    private ByteArrayOutputStream myOut;

    @BeforeEach
    void setUp() {
        myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
    }

    @Test
    void main() {
        App.main(null);
        assertThat(myOut.toString()).isEqualTo("Hello World!${symbol_escape}n");
    }
}
