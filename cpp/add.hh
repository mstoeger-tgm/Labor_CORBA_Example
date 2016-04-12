// This file is generated by omniidl (C++ backend)- omniORB_4_2. Do not edit.
#ifndef __add_hh__
#define __add_hh__

#ifndef __CORBA_H_EXTERNAL_GUARD__
#include <omniORB4/CORBA.h>
#endif

#ifndef  USE_stub_in_nt_dll
# define USE_stub_in_nt_dll_NOT_DEFINED_add
#endif
#ifndef  USE_core_stub_in_nt_dll
# define USE_core_stub_in_nt_dll_NOT_DEFINED_add
#endif
#ifndef  USE_dyn_stub_in_nt_dll
# define USE_dyn_stub_in_nt_dll_NOT_DEFINED_add
#endif






#ifdef USE_stub_in_nt_dll
# ifndef USE_core_stub_in_nt_dll
#  define USE_core_stub_in_nt_dll
# endif
# ifndef USE_dyn_stub_in_nt_dll
#  define USE_dyn_stub_in_nt_dll
# endif
#endif

#ifdef _core_attr
# error "A local CPP macro _core_attr has already been defined."
#else
# ifdef  USE_core_stub_in_nt_dll
#  define _core_attr _OMNIORB_NTDLL_IMPORT
# else
#  define _core_attr
# endif
#endif

#ifdef _dyn_attr
# error "A local CPP macro _dyn_attr has already been defined."
#else
# ifdef  USE_dyn_stub_in_nt_dll
#  define _dyn_attr _OMNIORB_NTDLL_IMPORT
# else
#  define _dyn_attr
# endif
#endif



#ifndef __int__Add__
#define __int__Add__
class int_Add;
class _objref_int_Add;
class _impl_int_Add;

typedef _objref_int_Add* int_Add_ptr;
typedef int_Add_ptr int_AddRef;

class int_Add_Helper {
public:
  typedef int_Add_ptr _ptr_type;

  static _ptr_type _nil();
  static _CORBA_Boolean is_nil(_ptr_type);
  static void release(_ptr_type);
  static void duplicate(_ptr_type);
  static void marshalObjRef(_ptr_type, cdrStream&);
  static _ptr_type unmarshalObjRef(cdrStream&);
};

typedef _CORBA_ObjRef_Var<_objref_int_Add, int_Add_Helper> int_Add_var;
typedef _CORBA_ObjRef_OUT_arg<_objref_int_Add,int_Add_Helper > int_Add_out;

#endif

// interface int_Add
class int_Add {
public:
  // Declarations for this interface type.
  typedef int_Add_ptr _ptr_type;
  typedef int_Add_var _var_type;

  static _ptr_type _duplicate(_ptr_type);
  static _ptr_type _narrow(::CORBA::Object_ptr);
  static _ptr_type _unchecked_narrow(::CORBA::Object_ptr);
  
  static _ptr_type _nil();

  static inline void _marshalObjRef(_ptr_type, cdrStream&);

  static inline _ptr_type _unmarshalObjRef(cdrStream& s) {
    omniObjRef* o = omniObjRef::_unMarshal(_PD_repoId,s);
    if (o)
      return (_ptr_type) o->_ptrToObjRef(_PD_repoId);
    else
      return _nil();
  }

  static inline _ptr_type _fromObjRef(omniObjRef* o) {
    if (o)
      return (_ptr_type) o->_ptrToObjRef(_PD_repoId);
    else
      return _nil();
  }

  static _core_attr const char* _PD_repoId;

  // Other IDL defined within this scope.
  
};

class _objref_int_Add :
  public virtual ::CORBA::Object,
  public virtual omniObjRef
{
public:
  // IDL operations
  ::CORBA::Long add(::CORBA::Long a1, ::CORBA::Long a2);

  // Constructors
  inline _objref_int_Add()  { _PR_setobj(0); }  // nil
  _objref_int_Add(omniIOR*, omniIdentity*);

protected:
  virtual ~_objref_int_Add();

  
private:
  virtual void* _ptrToObjRef(const char*);

  _objref_int_Add(const _objref_int_Add&);
  _objref_int_Add& operator = (const _objref_int_Add&);
  // not implemented

  friend class int_Add;
};

class _pof_int_Add : public _OMNI_NS(proxyObjectFactory) {
public:
  inline _pof_int_Add() : _OMNI_NS(proxyObjectFactory)(int_Add::_PD_repoId) {}
  virtual ~_pof_int_Add();

  virtual omniObjRef* newObjRef(omniIOR*,omniIdentity*);
  virtual _CORBA_Boolean is_a(const char*) const;
};

class _impl_int_Add :
  public virtual omniServant
{
public:
  virtual ~_impl_int_Add();

  virtual ::CORBA::Long add(::CORBA::Long a1, ::CORBA::Long a2) = 0;
  
public:  // Really protected, workaround for xlC
  virtual _CORBA_Boolean _dispatch(omniCallHandle&);

private:
  virtual void* _ptrToInterface(const char*);
  virtual const char* _mostDerivedRepoId();
  
};




class POA_int_Add :
  public virtual _impl_int_Add,
  public virtual ::PortableServer::ServantBase
{
public:
  virtual ~POA_int_Add();

  inline ::int_Add_ptr _this() {
    return (::int_Add_ptr) _do_this(::int_Add::_PD_repoId);
  }
};







#undef _core_attr
#undef _dyn_attr



inline void
int_Add::_marshalObjRef(::int_Add_ptr obj, cdrStream& s) {
  omniObjRef::_marshal(obj->_PR_getobj(),s);
}



#ifdef   USE_stub_in_nt_dll_NOT_DEFINED_add
# undef  USE_stub_in_nt_dll
# undef  USE_stub_in_nt_dll_NOT_DEFINED_add
#endif
#ifdef   USE_core_stub_in_nt_dll_NOT_DEFINED_add
# undef  USE_core_stub_in_nt_dll
# undef  USE_core_stub_in_nt_dll_NOT_DEFINED_add
#endif
#ifdef   USE_dyn_stub_in_nt_dll_NOT_DEFINED_add
# undef  USE_dyn_stub_in_nt_dll
# undef  USE_dyn_stub_in_nt_dll_NOT_DEFINED_add
#endif

#endif  // __add_hh__
