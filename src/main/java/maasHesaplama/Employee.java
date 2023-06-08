package maasHesaplama;

public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;
    public Employee(String name, double salary, int workHour, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHour=workHour;
        this.hireYear=hireYear;
    }
    public double  tax(){
        if(this.salary<1000){
           return this.salary;
        }
        else
            return this.salary*0.03;
    }
    public  double bonus(){
        return  (this.workHour*30)/this.workHour;

    }
    public  double raiseSalary(){
        if(2021-this.hireYear<9) {
           return  (0.05 * this.salary) ;
        }
        else if(2021-this.hireYear>9&& 2021-this.hireYear<20){
            return  (0.10 * this.salary);
        }
        else
            return  (0.15 * this.salary) ;

    }
    public String toString(){
        return  "..........INFORMATION ABOUT THE EMPOLYERR...........\n\t" +
                "Name : "+this.name+"\n\t" +
                "Working hours: "+this.workHour+"\n\t" +
                "Starting year: "+this.hireYear+"\n\t"
                +"Salary :"+ this.salary+"\n\t" +
                "Salaray Raise: "+ this.raiseSalary()+"\n\t" +
                "Tax to be paid: "+ this.tax()+"\n\t" +
                "Bonus: " + this.bonus();
    }

}
