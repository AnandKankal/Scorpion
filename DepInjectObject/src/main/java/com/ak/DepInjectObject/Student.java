package com.ak.DepInjectObject;

public class Student {
	MathCheat mathCheat;
	
	Student()
	{
		System.out.println("Student()..");
	}
	public MathCheat getMathCheat() {
		return mathCheat;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void studentCheat()
	{
		mathCheat.cheating();
	}
}
