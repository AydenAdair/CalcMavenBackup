public class MathProblem {

  private String operation;
  private int input1, input2;
  private double result;

  public MathProblem (String operation, int input1, int input2, double result){
    this.operation = operation;
    this.input1 = input1;
    this.input2 = input2;
    this.result = result;
  }

  public String getOperation (){
    return operation;
  }

  public int getInput1 (){
    return input1;
  }

  public int getInput2 (){
    return input2;
  }

  public double getResult (){
    return result;
  }

}