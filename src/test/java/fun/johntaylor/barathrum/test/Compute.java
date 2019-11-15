package fun.johntaylor.barathrum.test;

import org.junit.Test;

import java.math.BigDecimal;

public class Compute {
    @Test
    public void computeAuthority() {
        BigDecimal n = new BigDecimal(50L);
        BigDecimal total = new BigDecimal(0L);
        for (BigDecimal i = new BigDecimal(1L); i.compareTo(n) <= 0; i = i.add(new BigDecimal(1L))) {
            BigDecimal mother = new BigDecimal(n.toString());
            BigDecimal son = new BigDecimal(1);
            for (BigDecimal j = new BigDecimal(1L); j.compareTo(i) < 0; j = j.add(new BigDecimal(1L))) {
                mother = mother.multiply(n.subtract(j));
                son = son.multiply(j.add(new BigDecimal(1)));
            }
            total = total.add(mother.divide(son, 2, BigDecimal.ROUND_UP));
            System.out.println(String.format("mother = %s, son = %s, mother / son = %s", mother.toPlainString(), son.toPlainString(), mother.divide(son, 2, BigDecimal.ROUND_UP).toPlainString()));
        }
        System.out.println(String.format("total = %s", total.toPlainString()));
    }
}
