package inheritancc;
import javax.persistence.column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//

public class Manager extends Employee
{
	private static final long serialVersionUID=1L;
	@Column(name="Department_Name") String deptName;
	Manager()
	{
		
	}
	public Manager(String deptName)
	{
		this.deptName=deptName()
				{
			return deptName;
			
				}
		public void setDeptName(String deptName)
		
		{
			this.deptName=deptName;
		}
	}


