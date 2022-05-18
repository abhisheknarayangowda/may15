package inheritancee;

import inheritance.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory=Persistence.createEntity ManageFactory("JPA-PU");
//developed conn with database
EntityManager em=factory.createEntityManager();
//operation on database
//create update insert delete got object for communication em.getTransaction().begin();
//start communication
Employee e=new Employee();
e.setEmployeeName("Mansi");
e.setEmployeeSalary(10000);
em.persist(e);
//started communication

Manager m= new Manager();
m.setEmployeeName("Vikas");
m.setEmployeeSalary(30000);
m.setDeptName("Training");
em.persist(m);
em.getTransaction().commit();
//end of communication
System.out.println("rows inserted");
em.close();
//communication factory.close();
//connection
	}

}
