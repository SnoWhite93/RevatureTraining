package mockito;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public double add(double input1, double input2) {
		
		return input1 + input2;
	}

	@Override
	public double subtract(double input1, double input2) {
		// TODO Auto-generated method stub
		return input1 - input2;
	}

	@Override
	public double multiply(double input1, double input2) {
		// TODO Auto-generated method stub
		return input1 * input2;
	}

	@Override
	public double divide(double input1, double input2) {
		// TODO Auto-generated method stub
		return input1 / input2;
	}

}
