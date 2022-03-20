import java.io.*;  
class Data implements java.io.Serializable{

  public transient int id; // Dont want to serialize
  public String name;
  public Data(int id, String name){
    this.id = id;
    this.name = name;
  }
}

class Stud extends Data{
  public String grade;

  public Stud(int id, String name, String grade){
    super(id, name);
    this.grade = grade;
  }
}

public class TestSerialize {
  public static void main(String[] args){
    try{
      Stud s = new Stud(213, "Preeti", "A+");
      FileOutputStream file = new FileOutputStream("data.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(s);
			out.close();
			file.close();
			System.out.println("Serialized");
    }
    catch(Exception e){
      System.out.println(e);
    }
    try{
     	FileInputStream file = new FileInputStream("data.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Stud s = (Stud)in.readObject();
			in.close();
			file.close();
			System.out.println("id = " + s.id);
			System.out.println("name = " + s.name);
      System.out.println("grade = " + s.grade);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}