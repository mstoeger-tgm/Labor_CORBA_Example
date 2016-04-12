/**
 * Generated from IDL interface "int_Add".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at 09.04.2016 01:43:14
 */

public final class int_AddHolder	implements org.omg.CORBA.portable.Streamable{
	 public int_Add value;
	public int_AddHolder()
	{
	}
	public int_AddHolder (final int_Add initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return int_AddHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = int_AddHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		int_AddHelper.write (_out,value);
	}
}
