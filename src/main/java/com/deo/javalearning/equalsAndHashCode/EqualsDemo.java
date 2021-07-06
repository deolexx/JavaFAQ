package com.deo.javalearning.equalsAndHashCode;

import java.util.ArrayList;

class Contact{
    int id;
    String name;
    String  phone;

  public Contact(int id,String  name,String  phone){
this.id = id;
this.name = name;
this.phone = phone;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != contact.id) return false;
        if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
        return phone != null ? phone.equals(contact.phone) : contact.phone == null;
    }

//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        return result;
//    }
}



public class EqualsDemo {

    public static void main(String[] args) {
        Contact contact1 = new Contact(124,"Mike","+901231122");
       Contact contact2 = new Contact(124,"Mike","+901231122");
        //Contact contact2 = contact1;  //by default equals return true only when
        //both variables references to one object
       // System.out.println(contact1.hashCode()); //1198108795
     //   System.out.println(contact2.hashCode()); //214126413


       // System.out.println(contact1.equals(contact2)); // will return false BY DEFAULT
        // hashtag and equals methods had been override so the result will be true NOW


        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);

        System.out.println(contacts.contains(contact2));
        System.out.println(contacts.indexOf(contact2));
        contacts.remove(contact2);
        System.out.println(contacts.size());




    }

}
