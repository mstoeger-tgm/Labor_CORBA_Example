import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;
/**
 * Client Beispiel fuer CORBA Uebung
 * Vorlage: HelloWorld Beispiel
 * @author Michael Stoeger
 * @version 13.4.2016
 */
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
			
			//Objekt testen
			boolean ok = true;
			int result = add_obj.add(2, 3); //Test 1
			System.out.println("2+3="+result);
			if(result!=5)
				ok=false;
			result = add_obj.add(15, -3); //Test 2
			System.out.println("15-3="+result);
			if(result!=12)
				ok=false;
			result = add_obj.add(2, -3); //Test 3
			System.out.println("2-3="+result);
			if(result!=-1)
				ok=false;
			if(ok)
				System.out.println("Das entfernte Objekt arbeitet korrekt!");
			else
				System.out.println("Ein Problem ist aufgetreten!");
			
		}	catch (Exception e)	{
			System.err.println("Es ist ein Fehler aufgetreten: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

