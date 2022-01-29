package ro.fasttrackit.curs15.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TempConvertorTest {
    @Test
    @DisplayName("WHEN celsius degrees are given THEN must return fahrenheit degrees")
    void testCelsiusToFahrenheit(){
        //SETUP
        TempConverter converter = new TempConverter();
        //RUN
        double result = converter.celsiusToFahrenheit(30);
        //ASSERT
        assertThat(result).isEqualTo(86);
    }
    @Test
    @DisplayName("WHEN fahrenheit degrees are given THEN must return celsius degree")
    void testFahrenheitToCelsius(){
        //SETUP
        TempConverter converter = new TempConverter();
        //RUN
        double result = converter.fahrenheitToCelsius(100);
        //ASSERT
        assertThat(result).isEqualTo(37.77777777777778);
    }

}
