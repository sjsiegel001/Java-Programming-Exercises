package prob1315;

import java.math.*;

public class Rational extends Number implements Comparable<Rational> {
	
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	private BigInteger zero = new BigInteger("0");
	
	public Rational() {
		this(new BigInteger("0"), new BigInteger("1"));
	}
	
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		Integer posneg = ((denominator.compareTo(zero) == 1) ? 1 : -1);
		BigInteger postnegbi = BigInteger.valueOf(posneg.intValue());
		this.numerator = (postnegbi.multiply(numerator)).divide(gcd);
 
		this.denominator = (denominator.abs()).divide(gcd);
	}
	
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		Integer gcd = 1;
		
		Integer n1AsInteger, n2AsInteger;
		
		n1AsInteger = n1.intValue();
		n2AsInteger = n2.intValue();
		
		for (Integer k = 1; k <= n1AsInteger && k <= n2AsInteger; k++) {
			if(n1AsInteger % k == 0 && n2AsInteger % k == 0)
				gcd = k;
		}
		
		return BigInteger.valueOf(gcd.intValue());
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public void setNumerator(BigInteger numerator) {
		this.numerator = numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public void setDenominator(BigInteger denominator) {
		this.denominator = denominator;
	}
	
	/** Add a rational number to this rational */
	public Rational add(Rational secondRational) {
		Integer numeratorAsInteger = numerator.intValue();
		Integer denominatorAsInteger = denominator.intValue();
		
		Integer n = numeratorAsInteger * secondRational.getDenominator().intValue() + denominatorAsInteger * secondRational.getNumerator().intValue();
		Integer d = denominatorAsInteger * secondRational.getDenominator().intValue();
		return new Rational(BigInteger.valueOf(n.intValue()), BigInteger.valueOf(d.intValue()));
	}
	
	/** Subtract a rational number from this rational */
	public Rational subtract(Rational secondRational) {
		Integer numeratorAsInteger = numerator.intValue();
		Integer denominatorAsInteger = denominator.intValue();
		
		Integer n = numeratorAsInteger * secondRational.getDenominator().intValue() - denominatorAsInteger * secondRational.getNumerator().intValue();
		Integer d = denominatorAsInteger * secondRational.getDenominator().intValue();
		return new Rational(BigInteger.valueOf(n.intValue()), BigInteger.valueOf(d.intValue()));
	}
	
	/** Multiply a rational number by this rational */
	public Rational multiply(Rational secondRational) {
		Integer numeratorAsInteger = numerator.intValue();
		Integer denominatorAsInteger = denominator.intValue();
		
		Integer n = numeratorAsInteger * secondRational.getNumerator().intValue();
		Integer d = denominatorAsInteger * secondRational.getDenominator().intValue();
		return new Rational(BigInteger.valueOf(n.intValue()), BigInteger.valueOf(d.intValue()));
	}
	/** Divide a rational number by this rational */
	public Rational divide(Rational secondRational) {
		Integer numeratorAsInteger = numerator.intValue();
		Integer denominatorAsInteger = denominator.intValue();
		
		Integer n = numeratorAsInteger * secondRational.getDenominator().intValue();
		Integer d = denominatorAsInteger * secondRational.numerator.intValue();
		
		return new Rational(BigInteger.valueOf(n.intValue()), BigInteger.valueOf(d.intValue()));
	}
	
	@Override
	public String toString() {
		Integer denominatorAsInteger = denominator.intValue();
		
		if(denominatorAsInteger == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	
	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		Integer SRON = this.subtract((Rational)(other)).getNumerator().intValue();
		if ((SRON == 0))
			return true;
		else
			return false;
	}
	
	@Override
	public int intValue() {
		return (int)doubleValue();
	}
	
	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
	
	public BigInteger BigIntegerValue() {
		return BigInteger.valueOf((long)doubleValue());
	}
	
	public double doubleValue() {
		return (double)doubleValue();
	}
	
	public long longValue() {
		return (long)doubleValue();
	}
	
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator().compareTo(zero) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(zero) == -1)
			return -1;
		else
			return 0;
	}
	
	
}
