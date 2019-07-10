package Object类介绍;

public class Student {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	//source -----> Override/Implement Methods
	@Override
	public int hashCode() {
//		return super.hashCode();
		return 123;
	}
}
