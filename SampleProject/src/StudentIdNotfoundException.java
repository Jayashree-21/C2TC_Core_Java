
public class StudentIdNotfoundException extends Exception {
	int sid;
	StudentIdNotfoundException()
	{
		
	}
	public StudentIdNotfoundException(int sid)
	{
		this.sid = sid;
	}
	@Override
	public String getMessage()
	{
		return "student with id "+sid+" Not found";
	}
	@Override
	public String toString()
	{
		return "Student id not found";
	}
}