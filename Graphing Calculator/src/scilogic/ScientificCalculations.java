package scilogic;


public class ScientificCalculations
{
	static String operationType;
	static double par1;
	static double par2;

	// variables with underscores are cancer but required.
	public void sciCalculate(String operationType_, double par1_, double par2_)
	{

		operationType = operationType_;
		par1 = par1_;
		par2 = par2_;

		switch (operationType)
		{
		case "sin":
			sin();
			break;
		case "cos":
			cos();
			break;
		case "tan":
			tan();
			break;
		case "ln":
			ln();
			break;
		case "log":
			log();
			break;
		case "factorial":
			factorial((int) par1);
			break;
		case "power":
			power();
			break;
		case "squareRoot":
			squareRoot();
			break;
		case "add":
			add();
			break;
		case "subtract":
			subtract();
			break;
		case "divide":
			divide();
			break;
		case "multiply":
			multiply();
			break;
		case "inverseSin":
			inverseSin();
			break;
		case "inverseCos":
			inverseCos();
			break;
		case "inverseTan":
			inverseTan();
			break;
		case "tenToTheX":
			tenToTheX();
			break;
		case "eToTheX":
			eToTheX();
			break;
		case "sqaured":
			sqaured();
			break;

		}

	}

	// first variable
	// operation
	// second variable
	// answer
	// answer become first variable and repeat

	static public double sin()
	{
		return Math.sin(par1);

	}

	static public double cos()
	{
		return Math.cos(par1);

	}

	static public double tan()
	{
		return Math.tan(par1);

	}

	static public double ln()
	{
		return Math.log(par1);

	}

	static public double log()
	{
		return Math.log10(par1);

	}

	static public double factorial(int memeNumber)
	{
		if (memeNumber == 1)
		{
			return 1;

		} else
		{
			return par1 * factorial(memeNumber - 1);
		}

	}

	static public double power()
	{
		return Math.pow(par1, par2);

	}

	static public double squareRoot()
	{
		return Math.sqrt(par1);

	}

	static public double add()
	{
		return (par1 + par2);

	}

	static public double subtract()
	{
		return (par1 - par2);

	}

	static public double divide()
	{
		return (par1 / par2);

	}

	static public double multiply()
	{
		return (par1 * par2);

	}

	static public double inverseSin()
	{
		return Math.asin(par1);

	}

	static public double inverseCos()
	{
		return Math.acos(par1);

	}

	static public double inverseTan()
	{
		return Math.atan(par1);

	}

	static public double tenToTheX()
	{
		return Math.pow(10, par1);

	}

	static public double eToTheX()
	{
		return Math.pow(Math.E, par1);

	}

	static public double sqaured()
	{
		return Math.pow(par1, 2);

	}

}
