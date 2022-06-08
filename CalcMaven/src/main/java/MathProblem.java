public class MathProblem {

  private String operator;
  private int value1, value2;
  private double result;

  public MathProblem(String operator, int value1, int value2, double result){
    this.operator = operator;
    this.value1 = value1;
    this.value2 = value2;
    this.result = result;
  }

  public String getOperator() {
    return operator;
  }

  public int getValue1() {
    return value1;
  }

  public int getValue2() {
    return value2;
  }

  public double getResult() {
    return result;
  }
}