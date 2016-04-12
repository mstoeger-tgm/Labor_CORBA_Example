/**
 * Generated from IDL interface "int_Add".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at 09.04.2016 01:43:14
 */

public abstract class int_AddHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(int_AddHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:int_Add:1.0", "int_Add");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final int_Add s)
	{
			any.insert_Object(s);
	}
	public static int_Add extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:int_Add:1.0";
	}
	public static int_Add read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(_int_AddStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final int_Add s)
	{
		_out.write_Object(s);
	}
	public static int_Add narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof int_Add)
		{
			return (int_Add)obj;
		}
		else if (obj._is_a("IDL:int_Add:1.0"))
		{
			_int_AddStub stub;
			stub = new _int_AddStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static int_Add unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof int_Add)
		{
			return (int_Add)obj;
		}
		else
		{
			_int_AddStub stub;
			stub = new _int_AddStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
