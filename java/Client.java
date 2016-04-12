import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;
public class Client {
	public static void main(String[] args){
		int_Add add_obj;
		try {
			
			/* Erstellen und intialisieren des ORB */
			ORB orb = ORB.init(args, null);
			
			/* Erhalten des RootContext des angegebenen Namingservices */
			Object o = orb.resolve_initial_references("NameService");
			
			/* Verwenden von NamingContextExt */
			NamingContextExt rootContext = NamingContextExtHelper.narrow(o);
			
			/* Angeben des Pfades zum Echo Objekt */
			NameComponent[] name = new NameComponent[2];
			name[0] = new NameComponent("test","my_context");
			name[1] = new NameComponent("Echo", "Object");
			
			/* Aufloesen der Objektreferenzen  */
			add_obj = int_AddHelper.narrow(rootContext.resolve(name));
			
			//Objekt benutzen
			int result = add_obj.add(2, 3);
			System.out.println("2+3="+result);
			
		}	catch (Exception e)	{
			System.err.println("Es ist ein Fehler aufgetreten: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

