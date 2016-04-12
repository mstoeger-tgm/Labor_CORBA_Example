/**
 * Generated from IDL interface "int_Add".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at 09.04.2016 01:43:14
 */

public class _int_AddStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements int_Add
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:int_Add:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = int_AddOperations.class;
	public int add(int a1, int a2)
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "add", true);
					_os.write_long(a1);
					_os.write_long(a2);
					_is = _invoke(_os);
					int _result = _is.read_long();
					return _result;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add", _opsClass );
			if( _so == null )
				continue;
			int_AddOperations _localServant = (int_AddOperations)_so.servant;
			int _result;
			try
			{
				_result = _localServant.add(a1,a2);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return _result;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

}
