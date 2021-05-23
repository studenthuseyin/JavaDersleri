package odev3_2;

public class UserManager {
	
	public void Add(User user) {
	System.out.println(user.firstName +" "+ user.lastName+" 'un ekleme işlemi başarıyla gerçekleşmiştir.");
	}

	
	public void List(User user) {
	System.out.println(user.firstName +" " +user.lastName +"Listeleme işlemi başarıyla gerçekleşmiştir.");
	}
	
	
	
	public void Delete(User user) {
	System.out.println(user.firstName +" "+ user.lastName + "Silme işlemi başarıyla gerçekleşmiştir.");
	}
	

}
