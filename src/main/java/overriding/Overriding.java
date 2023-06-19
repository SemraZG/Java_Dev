package overriding;

public class Overriding {
    /**
     * child class olmayan veriable veya methdoalr için parent class a gidiyorduk, eğer parentdaki method içeriğini childe uyarlamak istersek override yapabiliriz.
     * child classda iken, sağ click+ generate + override + method sec + super'ı sil ve istediğin içeriği yaz.
     * Overriding de method signature a dokunulmaz(method name+method parameters), method body değiştirilmil olur.
     * private methodlar override edilmezler.
     * childdaki override edilen methodun return type ı ile parentdaki methodun return type ı arasında is a ilişkisi varsa return type değiştirilebilir
     * (primitiveler ve wrapper lar hariç int, long, Integer, Long gibi)

     * In Method Overloading, method name are not changed.
     * In Method Overloading, parameters are changed.
     *
     *   "super" keyword: this is used for getting the data (variables + methods) from parent classes in inheritance.
     *         if there is no data in parent class, then java goes and fetched the data from grandparent class.
     *         if the required data does not exist in both parent and grandparent class then java gives CTE.(red underline while typing)
     *
     *         super()===> direct java to parent classes for using constructors.
     *         super() has to be used in the first line of code statement.
     *
     *         The different between super and super():
     *         super() is used for calling the constructors from parent classes
     *         super is used to get the data and methods from parent classes, can be at any line in the class.
     *         Also, you can use super keyword repeatedly in the same class.
     *
     *         "this" ==> if you declare this keyword in a class it means you want to see the value which is in the same class
     *         this.name==> (Cat)==>Cat
     *         When you use "this" we are telling java to use the variable/ methods from the same class.
     *         By typing "this", java will not go to the parent classes and it will use the variables and methods from the same class.
     *
     *

     *
     *         Method Overriding:
     *
     *         1) When we want to use a method from parent classes in the child classes,
     *         we may need to update implementation of the methods.
     *         For example; in Animal class eat() method tells "Animals eat",
     *         but to tell that in Cat class is not good.
     *         To be able to create specific implementation for the Cat class like "Cats eat",
     *         we should update the method body.
     *
     *         This is called "Method Overriding".
     *
     *         2) To do method overriding we need inheritance.
     *         If there is no inheritance then method overriding is not possible.
     *         3) When we use "method overriding", we do not touch the method signature(method name + parameters)
     *         4) "Overriding" annotation checks the overriding rules when you do overriding.
     *         5) When you do overriding, you cannot use narrower access modifier in your child class,
     *         you can use same or wider access modifier in child class.
     *         6) The method in parent is called "overridden method" and the method in child class is called "overriding method".
     *         7) When you do method overriding, if the return type is void, then the return type of overriding method has to void too.
     *         We cannot use another return type different from the overridden method.
     *
     *         8) When you do method overriding, return type of the overriding method has to have the same return type.
     *         The return type of the overriding method can be same or the child of the return type of the overridden method.
     *         From the child class you must have a "IS-A" relationship.
     *
     *         9) Between wrapper classes, java did not create any parent-child relationship.
     *         Between wrapper there is no parent-child relationship==>"IS-A".
     *
     *         10) When you do method overriding, if the return type of the overridden method is primitive the you cannot change that return type to non-primitive one.
     *         Because primitive data classes are not child classes of non-primitive data classes.
     *
     *         Note: If a method has "final" keyword in method line, it means the body cannot be updated or overridden in another class.
     *
     *         11) "final" keyword restricts of usage of the method and does not accept any change.
     *
     *         12) "private" methods cannot be overridden because they are not accessible by other classes.
     *
     *         13) "static" methods cannot be overridden because static things are common for all child classes
     *         If any child class updates the static method then it will be updated for all other classes.
     *         All classes will be affected, therefore java does not let you override a method that is static.
     */
}
