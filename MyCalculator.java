import javax.swing.JOptionPane;

public class MyCalculator  {
    private String [] expression=new String[100];
	private String operation;
	private int counter=-1;
	private int i=-1;
	
	public String sum(String equation)
	{   
		String expression[]=equation.split("\\+");
		String num1=expression[0];
		String num2=expression[1];
		double Operand1=Double.parseDouble(num1);
		double Operand2=Double.parseDouble(num2);
        double sum=Operand1+Operand2;
        String ResultAsString = Double.toString(sum);
        return ResultAsString;
	}
	
	public boolean isValid(String equation) {
		char equationArray[]=equation.toCharArray();
		int operatorsCount=0;
		int notValid=0;
		for(int i=0;i<equation.length();i++)
		{   
			if(equationArray[i]=='+'||equationArray[i]=='-'||equationArray[i]=='/'||equationArray[i]=='x')
				operatorsCount++;
		    if (equationArray[i]=='.'&&(equationArray[i+1]=='+'||equationArray[i+1]=='.'||equationArray[i+1]=='-'||equationArray[i+1]=='/'||equationArray[i+1]=='x'))
		    	{notValid=1;
		    	break;
		    	}
		}
		if(equationArray[0]=='+'||equationArray[0]=='/'||equationArray[0]=='x')
			{return false;}
		else if ((operatorsCount>1&&equationArray[0]!='-')||(operatorsCount>2))
			{return false;}
		
		else if(notValid==1)
			{return false;}
		
		else if(equationArray[0]=='-'&&equationArray[1]=='-')
			{return false;}
		
		else if (equationArray[equationArray.length-1]=='+'||equationArray[equationArray.length-1]=='-'||equationArray[equationArray.length-1]=='/'||equationArray[equationArray.length-1]=='x'||equationArray[equationArray.length-1]=='.')
		    {return false;}
		else 
			{return true;}
		
	}
	
	public String division(String equation)
	{
		String expression[]=equation.split("\\/");
		String num1=expression[0];
		String num2=expression[1];
		double Operand1=Double.parseDouble(num1);
		double Operand2=Double.parseDouble(num2);
		if(Operand2==0) {
			JOptionPane.showMessageDialog(null,"Math Error" );
			return "";
		}
		else {
        double div=Operand1/Operand2;
        String ResultAsString = Double.toString(div);
        return ResultAsString;
		}
	}
		
	public String multiplication(String equation)
	{ 	String expression[]=equation.split("x");
		String num1=expression[0];
		String num2=expression[1];
		double Operand1=Double.parseDouble(num1);
		double Operand2=Double.parseDouble(num2);
        double multi=Operand1*Operand2;
        String ResultAsString = Double.toString(multi);
        return ResultAsString;
	}
	
	public String checkOperation (String expression)
	{
		char expressionArray[]=expression.toCharArray();
		for(int i=0;i<expressionArray.length;i++)
		{
			if (expressionArray[i]=='+')
				{operation="+";
			    break;
				}
			else if(expressionArray[i]=='-'&&i!=0)
			{operation="-";
			break;
			}
			else if(expressionArray[i]=='/')
			{operation="/";
			break;
			}
			else if(expressionArray[i]=='x')
			{operation="x";
			break;
			}
		}
		return operation;  
	}
	
	public String diff(String equation)
	{  if(checkNegative(equation))
	{   equation= equation.substring(1);
		String expression[]=equation.split("\\-");
		String num1=expression[0];
		String num2=expression[1];
		double Operand1=(Double.parseDouble(num1));
		Operand1=Operand1*(-1);
		double Operand2=Double.parseDouble(num2);
        double diff=Operand1-Operand2;
        String ResultAsString = Double.toString(diff);
        return ResultAsString;
	}  else {
		String expression[]=equation.split("\\-");
		String num1=expression[0];
		String num2=expression[1];
		double Operand1=Double.parseDouble(num1);
		double Operand2=Double.parseDouble(num2);
        double diff=Operand1-Operand2;
        String ResultAsString = Double.toString(diff);
        return ResultAsString;
	}
	}
	
	public boolean checkNegative(String equation)
	{
		char expression[]=equation.toCharArray();
		if(expression[0]=='-')
		{  
			return true;
		}
		else return false;
	}
	
	public String backspace (String expression)
	{
		String BackSpace=null;
		if(expression.length()>0)
		{
			StringBuilder str=new StringBuilder(expression);
			str.deleteCharAt(expression.length()-1);
			BackSpace=str.toString();
		}
		return BackSpace;
	}

	public String Result(String expression)
	{   
		String Result;
		operation=checkOperation(expression);
		boolean isValid=isValid(expression);
		if(isValid==false)
			Result=null;
		else {
		if(operation=="+")
		{   
			Result=sum(expression);
		}
		else if (operation=="-")
		{
			Result=diff(expression);
		}
		else if (operation=="x")
		{
			Result=multiplication(expression);
		}
		else if (operation=="/")
		{
			Result=division(expression);
		}
	
		else
			Result=expression;
		}
			return Result;
	}
	
	public void saveInArray(String expression )
	
	{
		i++;	
		counter++;
			this.expression[i%100]=expression;
	}
	
	public String previous ()
	{
		 if(counter<=0)
		 {
			 return null;
		 }
		 
		 else {
			String previous=expression[--counter];
			return previous;
		 }
	
	}
	
	public String next ()
	{   
		String next=expression[++counter];	
		if(counter>i)
			next=null;
		return next;
	}
}
