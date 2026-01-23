package POO.Classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class ClassesEssenciaisNumbers {
//    Principais classes numéricas em Java (Wrappers)

    public static void main(String[] args) {
        // Wrappers básicos
        Integer i = Integer.valueOf(10); // cria objeto Integer
        Double d = Double.valueOf(3.14); // cria objeto Double

        // Métodos úteis
        System.out.println(i.intValue());   // retorna o valor primitivo int
        System.out.println(d.doubleValue()); // retorna o valor primitivo double

        // Conversão de ‘String’ para número
        int n = Integer.parseInt("123"); // converte String para int
        double x = Double.parseDouble("3.1415"); // converte String para double

        // BigInteger e BigDecimal
        BigInteger bigInt = new java.math.BigInteger("12345678901234567890");
        BigDecimal bigDec = new java.math.BigDecimal("12345.6789");

        System.out.println(bigInt.multiply(new java.math.BigInteger("2"))); // operações seguras
        System.out.println(bigDec.add(new java.math.BigDecimal("0.01")));   // alta precisão

//        operaçoes matemáticas
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));

        resultado = resultado.subtract(new BigDecimal("20.90"));
        System.out.println(resultado);

        BigDecimal a = new BigDecimal("10.50");
        BigDecimal b = new BigDecimal("3.25");

        System.out.println("Soma: " + a.add(b));          // 13.75
        System.out.println("Subtração: " + a.subtract(b));// 7.25
        System.out.println("Multiplicação: " + a.multiply(b)); // 34.125
        System.out.println("Divisão: " + a.divide(b, 4, RoundingMode.HALF_UP)); // 3.23
        System.out.println("Divisão: " + a.divide(b, 4, RoundingMode.HALF_EVEN));
        System.out.println("Divisão: " + a.divide(b, 4, RoundingMode.HALF_DOWN)); //
        System.out.println("Potência: " + a.pow(2));      // 110.25
        System.out.println("Máximo: " + a.max(b));        // 10.50
        System.out.println("Mínimo: " + a.min(b));        // 3.25


        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtizados.multiply(precoLitro);

        System.out.println(valorPagar);

        // Arredondando
        BigDecimal valorArredondado = valorPagar.setScale(4, RoundingMode.HALF_EVEN);
        System.out.println(valorArredondado);
    }

}


//Integer → encapsula o tipo primitivo int.
//
//Double → encapsula o tipo primitivo double.
//
//Float → encapsula o tipo primitivo float.
//
//Long → encapsula o tipo primitivo long.
//
//Curta-metragem → encapsula o tipo primitivo short.
//
//Byte → encapsula o tipo primitivo byte.
//
//BigInteger → para números inteiros muito grandes (além do limite de long).
//
//BigDecimal → para cálculos de alta precisão com decimais (muito usado em finanças).