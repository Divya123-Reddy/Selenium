
public class Employee {

		 public String name;
	      public double salary;
	      public int empid;
	      public String addres;
	    
	    
	            public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    public int getEmpid() {
	        return empid;
	    }
	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }
	    public String getaddres() {
	    	return addres;
	    }
	    public void setaddres(String addres)
	    {
	    	this.addres=addres;
	    }
	           public void Employee() {
	              System.out.println("name  : " + name );
	              System.out.println("salary :" + salary);
	              System.out.println("empid  : " + empid );
	              System.out.println("address :" + addres);
	           }
	           public static void main(String args[]) {
	          
	              Employee emp = new Employee();
	              emp.setSalary(30000);
	              emp.setName("Divya");
	              emp.setEmpid(32607);
	              emp.setaddres("anantapur");
	              
	               }
	}


