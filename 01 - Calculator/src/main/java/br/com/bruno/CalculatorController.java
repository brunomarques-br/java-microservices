package br.com.bruno;

import br.com.bruno.utils.MathValidators;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private static final String NUMERO_VALIDO = "Por favor, informe um número válido!";

    @GetMapping("/soma/{numberOne}/{numberTwo}")
    public Double soma(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ){
        if (!MathValidators.isNumeric(numberOne) || !MathValidators.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return MathValidators.convertToDouble(numberOne) + MathValidators.convertToDouble(numberTwo);
    }

    @GetMapping("/subtracao/{numberOne}/{numberTwo}")
    public Double subtracao(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ){
        if (!MathValidators.isNumeric(numberOne) || !MathValidators.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return MathValidators.convertToDouble(numberOne) - MathValidators.convertToDouble(numberTwo);
    }

    @GetMapping("/multiplicacao/{numberOne}/{numberTwo}")
    public Double multiplicacao(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ){
        if (!MathValidators.isNumeric(numberOne) || !MathValidators.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return MathValidators.convertToDouble(numberOne) * MathValidators.convertToDouble(numberTwo);
    }

    @GetMapping("/divisao/{numberOne}/{numberTwo}")
    public Double divisao(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ){
        if (!MathValidators.isNumeric(numberOne) || !MathValidators.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return MathValidators.convertToDouble(numberOne) / MathValidators.convertToDouble(numberTwo);
    }

    @GetMapping("/media/{numberOne}/{numberTwo}")
    public Double media(
                @PathVariable("numberOne") String numberOne,
                @PathVariable("numberTwo") String numberTwo
    ){
        if (!MathValidators.isNumeric(numberOne) || !MathValidators.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return (MathValidators.convertToDouble(numberOne) + MathValidators.convertToDouble(numberTwo)) / 2;
    }

    @GetMapping("/raiz/{numberOne}")
    public Double raiz(
                @PathVariable("numberOne") String numberOne
    ){
        if (!MathValidators.isNumeric(numberOne)) {
            throw new UnsupportedOperationException(NUMERO_VALIDO);
        }
        return Math.sqrt(MathValidators.convertToDouble(numberOne));
    }


}
