CXX            	= /usr/bin/g++
CPPFLAGS      	= -g -c
LDFLAGS       	= -g
OMNI_HOME     	= /home/michael/corba/omniORB-4.2.1/build
OMNIIDL       	= $(OMNI_HOME)/bin/omniidl
LIBS          	= -lomniORB4 -lomnithread -lomniDynamic4
IDL_DIR		= ../idl
IDL_FILE	= $(IDL_DIR)/add.idl

all server:
	$(OMNIIDL) -bcxx $(IDL_FILE)
	$(CXX) $(LDFLAGS) -o server add.hh addSK.cc server.cpp $(LIBS)

run: server
	# Start Naming service with command 'omniNames -start -always' as root
	./server -ORBInitRef NameService=corbaname::localhost

clean clean-up:
	rm -rf server
	rm -rf add.hh
	rm -rf addSK.cc
