package entities;

public class Users implements Comparable<Users>{
	
	private Integer userCode;	
	
	public Users() {
	}

	public Users(Integer userCode) {
		super();
		this.userCode = userCode;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	@Override
	public int compareTo(Users other) { //O TreeSet utiliza a interface Comparable para fazer a comparacao
		return userCode.compareTo(other.getUserCode());
	}
		
}
