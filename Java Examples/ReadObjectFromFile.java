
public class ObjectIOExample {

	private static final String filepath="C:\\Users\\nikos7\\Desktop\\obj";

	public static void main(String args[]) {

		ObjectIOExample objectIO = new ObjectIOExample();

		//Read object from file
		Student st = (Student) objectIO.ReadObjectFromFile(filepath);
		System.out.println(st);
	}

	public Object ReadObjectFromFile(String filepath) {

		try {

			FileInputStream fileIn = new FileInputStream(filepath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			Object obj = objectIn.readObject();

			System.out.println("The Object has been read from the file");
			objectIn.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
Output

The Object has been read from the file