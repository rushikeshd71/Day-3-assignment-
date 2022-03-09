public class Empwage {
	public static void main(String args[]){
		System.out.println("Welcome");

			int Emp_Hr=0,Wage_Per_Hr=20;
			int Max_Hrs_In_Month=100,Max_Working_days=20,Total_salary=0;
			int Total_EmpHr=0,Total_Working_Days=1;
			int PROBLEMATIC_SCENARIO=36,Availability=0;

			while(Total_EmpHr < Max_Hrs_In_Month && Total_Working_Days <= Max_Working_days)
				{
			double Emp_check = Math.floor(Math.random() * 10) % 3;
					if (Total_EmpHr==PROBLEMATIC_SCENARIO) {
						Availability = 2;
				}
					else {
				 			Availability = (int)(Emp_check);
				}
			switch (Availability){
						case 1:
							System.out.println("Employee is working Full Time on day "+ Total_Working_Days);
							Emp_Hr=8;
						break;
						case 2:
							System.out.println("Employee is working Part Time on day "+ Total_Working_Days);
							Emp_Hr=4;
						break;
						default:
					 		System.out.println("Employee is absent on day "+ Total_Working_Days);
							Emp_Hr=0;
						break;
			}
			Total_Working_Days++;
			Total_EmpHr =+ Total_EmpHr + Emp_Hr;
		}
		Total_salary=Wage_Per_Hr * Total_EmpHr;
		System.out.println("Employee's monthly wage is : "+Total_salary+" and Employee worked for "+Total_EmpHr+" hours");
	}
}