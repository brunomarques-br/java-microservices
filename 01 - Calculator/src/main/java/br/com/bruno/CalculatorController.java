package br.com.bruno;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalculatorController {

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new Exception();
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        // alterando virgula para ponto (internacionalização)
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String strNumber) {
        if (strNumber == null) {
            return 0D;
        }
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) {
            return Double.parseDouble(number);
        }
        return 0D;
    }
}
