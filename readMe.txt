1. Create maven project
2. add dependency spring core and spring context
3. create configuration file config.xml
4. setter injection
4. creating beans pojo class


=> p2CollectionTypeInjection

=> p6Autowiring
byName:
looks for the name of the bean.
name of bean should be same as the name of the identifier in case of java class.
It calls setter method (setter injection)

byType:
looks for the bean having the same class as that of the identifier.
Throws exception if more than one bean present of same class;
It calls setter method (setter injection).

ByConstructor:


Using annotation:
called by setter injection. independent of name as it used type to identify the bean
3 ways:
using over property
using over setter
using over constructor

=> p7StandAloneCollection

what did we used to do so far
-we used collection (list, set, map) inside the bean
 we as a programmer have no control which class is implemented to collections
 for example: 
	a List can be ArrayList or LinkedList
	a Set can be LinkedHashSet or HashSet
	a Map can be LinkedHashMap or HashMap
 the above way fails to provide the flexibility to implement the classes for Collections

why use stand-alone collection?
- for re-usability:
 	when declared inside a bean collection can be used only in that bean.
 	when using stand-alone collection it can be used by multiple beans.
 	
how do you implement stand-alone collection
-using util schema


=> Bean scope

1. Singleton (default)
2. Prototype
3. Request
4. Session
5. Global session